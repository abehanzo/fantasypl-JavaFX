/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasypljfx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Abraham
 */
public class JsonPullPlayers {
    
    public static ArrayList<PlayerBean> extractData() throws IOException
   {
      ArrayList<PlayerBean> Players = new ArrayList<>();
      
     URL url = createUrl();
     String mqUrl = makeHttpRequest(url);
      
      JSONObject root = new JSONObject(mqUrl);
      JSONArray elements = root.getJSONArray("elements");
      JSONArray teams = root.getJSONArray("teams");
      String[] teamString = new String[teams.length()];
      for(int j=0; j<teams.length();j++)
      {
          JSONObject t = teams.getJSONObject(j);
          teamString[j]= t.getString("name");
      }
      for (int i=0 ; i < elements.length();i++)
      {
          JSONObject p = elements.getJSONObject(i);
          String firstName = p.getString("first_name");
          String lastName = p.getString("second_name");
          String name = firstName +" "+ lastName;
          int nowCost = p.getInt("now_cost");
          DecimalFormat df = new DecimalFormat("#.0");
          double currentValue = Double.parseDouble(df.format(nowCost/10.0));
          double selectedByPercent = p.getDouble("selected_by_percent");
          int transferIn = p.getInt("transfers_in_event");
          int transferOut = p.getInt("transfers_out_event");
          int netTransfers = transferIn-transferOut;
          int team = p.getInt("team");
          String teamName = null;
          teamName = teamString[team-1];
          String status = p.getString("status");
          String news = null;
          if(status.equals("a"))
              news = "Available";
          else
              news = p.getString("news");
          int elementType = p.getInt("element_type");
          String position = null;
          switch(elementType)
          {
              case 1 : position = "Goalkeeper";break;
              case 2 : position = "Defender";break;
              case 3 : position = "Midfielder";break;
              case 4 : position = "Forward";break;
          }
          int totalPoints = p.getInt("total_points");
          int eventPoints = p.getInt("event_points");
          double pointsPerGame = p.getDouble("points_per_game");
          int minutesPlayed = p.getInt("minutes");
          int goals = p.getInt("goals_scored");
          int assists = p.getInt("assists");
          int cleanSheets = p.getInt("clean_sheets");
          int yellowCards = p.getInt("yellow_cards");
          int redCards = p.getInt("red_cards");
          double form = p.getDouble("form");
          double influence = p.getDouble("influence");
          double creativity = p.getDouble("creativity");
          double threat = p.getDouble("threat");
          double ictIndex = p.getDouble("ict_index");
          Players.add(new PlayerBean(name,currentValue,selectedByPercent,transferIn,transferOut,netTransfers,teamName,
                news,position,totalPoints,eventPoints,pointsPerGame,minutesPlayed,goals,assists,cleanSheets,
                yellowCards,redCards,form,influence,creativity,threat,ictIndex));
                  
      }
       return Players;
   }
    
    
    
    private static URL createUrl() throws MalformedURLException {
        URL url = new URL("https://fantasy.premierleague.com/drf/bootstrap");
        return url;
    }
   
    
    private static String readFromStream(InputStream inputStream) throws IOException {
        StringBuilder output = new StringBuilder();
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while (line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }
        return output.toString();
    }
     
    private static String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";
        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.connect();
            inputStream = urlConnection.getInputStream();
            jsonResponse = readFromStream(inputStream);
        } catch (IOException e) {
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return jsonResponse;
    }
      
}