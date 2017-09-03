/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasypljfx;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Abraham
 */
public class PlayerBean {
   
    private final SimpleStringProperty name;
    private final SimpleDoubleProperty currentValue;
    private final SimpleDoubleProperty ownPercent;
    private final SimpleIntegerProperty transfersIn;
    private final SimpleIntegerProperty transfersOut;
    private final SimpleIntegerProperty netTransfers;
    private final SimpleStringProperty teamName;
   
    private final SimpleStringProperty news;
    private final SimpleStringProperty position;
    private final SimpleIntegerProperty totalPoints;
    private final SimpleIntegerProperty eventPoints;
    private final SimpleDoubleProperty pointsPerGame;
    private final SimpleIntegerProperty minutesPlayed;
    private final SimpleIntegerProperty goals;
    private final SimpleIntegerProperty assists;
    private final SimpleIntegerProperty cleanSheets;
    private final SimpleIntegerProperty yellowCards;
    private final SimpleIntegerProperty redCards;
    private final SimpleDoubleProperty form;
    private final SimpleDoubleProperty influence;
    private final SimpleDoubleProperty creativity;
    private final SimpleDoubleProperty threat;
    private final SimpleDoubleProperty ictIndex;
    
    public PlayerBean(String name, Double currentValue, Double ownPercent, Integer transfersIn, Integer transfersOut, Integer netTransfers, 
            String teamName, String news, String position, Integer totalPoints, Integer eventPoints, 
            Double pointsPerGame, Integer minutesPlayed, Integer goals, Integer assists, 
            Integer cleanSheets, Integer yellowCards, Integer redCards, Double form, 
            Double influence, Double creativity, Double threat, Double ictIndex) {
        this.name = new SimpleStringProperty(name);
        this.ownPercent = new SimpleDoubleProperty(ownPercent);
        this.currentValue =new SimpleDoubleProperty(currentValue);
        this.transfersIn = new SimpleIntegerProperty(transfersIn);
        this.transfersOut =new SimpleIntegerProperty(transfersOut);
        this.netTransfers = new SimpleIntegerProperty(netTransfers);
        this.teamName = new SimpleStringProperty(teamName);
        
        this.news = new SimpleStringProperty(news);
        this.position = new SimpleStringProperty(position);
        this.totalPoints = new SimpleIntegerProperty(totalPoints);
        this.eventPoints = new SimpleIntegerProperty(eventPoints);
        this.pointsPerGame = new SimpleDoubleProperty(pointsPerGame);
        this.minutesPlayed =new SimpleIntegerProperty(minutesPlayed);
        this.goals =new SimpleIntegerProperty(goals);
        this.assists = new SimpleIntegerProperty(assists);
        this.cleanSheets = new SimpleIntegerProperty(cleanSheets);
        this.yellowCards = new SimpleIntegerProperty(yellowCards);
        this.redCards = new SimpleIntegerProperty(redCards);
        this.form = new SimpleDoubleProperty(form );
        this.influence = new SimpleDoubleProperty(influence);
        this.creativity = new SimpleDoubleProperty(creativity);
        this.threat = new SimpleDoubleProperty(threat);
        this.ictIndex = new SimpleDoubleProperty(ictIndex);
    }
    
    public String getName() {
        return name.get();
    }

    public Double getOwnPercent() {
        return ownPercent.get();
    }

    public Double getCurrentValue() {
        return currentValue.get();
    }

    public Integer getTransfersIn() {
        return transfersIn.get();
    }

    public Integer getTransfersOut() {
        return transfersOut.get();
    }

    public Integer getNetTransfers() {
        return netTransfers.get();
    }

    public String getTeamName() {
        return teamName.get();
    }

    public String getNews() {
        return news.get();
    }

    public String getPosition() {
        return position.get();
    }

    public Integer getTotalPoints() {
        return totalPoints.get();
    }

    public Integer getEventPoints() {
        return eventPoints.get();
    }

    public Double getPointsPerGame() {
        return pointsPerGame.get();
    }

    public Integer getMinutesPlayed() {
        return minutesPlayed.get();
    }

    public Integer getGoals() {
        return goals.get();
    }

    public Integer getAssists() {
        return assists.get();
    }

    public Integer getCleanSheets() {
        return cleanSheets.get();
    }

    public Integer getYellowCards() {
        return yellowCards.get();
    }

    public Integer getRedCards() {
        return redCards.get();
    }

    public Double getForm() {
        return form.get();
    }

    public Double getInfluence() {
        return influence.get();
    }

    public Double getCreativity() {
        return creativity.get();
    }

    public Double getThreat() {
        return threat.get();
    }

    public Double getIctIndex() {
        return ictIndex.get();
    }
}
