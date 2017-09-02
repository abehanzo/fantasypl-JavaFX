/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasypljfx;

/**
 *
 * @author Abraham
 */
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable {

    @FXML
    private TableView<PlayerBean> playerTable;
    
    @FXML
    private TableColumn<PlayerBean, String> playerName;
    
    @FXML
    private TableColumn<PlayerBean, String> currentValue;

    @FXML
    private TableColumn<PlayerBean, Double> ownPercent;

    @FXML
    private TableColumn<PlayerBean, Integer> transfersIn;

    @FXML
    private TableColumn<PlayerBean, Integer> transfersOut;

    @FXML
    private TableColumn<PlayerBean, Integer> netTransfers;

    
    final ArrayList<PlayerBean> Players;
    final ObservableList<PlayerBean> playersData; 
    public MainController() throws IOException {
        this.Players = new ArrayList(jsonPull.extractData());
        this.playersData = FXCollections.observableArrayList(Players);
        
    }
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources){
        playerName.setCellValueFactory(new PropertyValueFactory<>("secondName"));
        ownPercent.setCellValueFactory(new PropertyValueFactory<>("ownPercent"));
        transfersIn.setCellValueFactory(new PropertyValueFactory<>("transfersIn"));
        transfersOut.setCellValueFactory(new PropertyValueFactory<>("transfersOut"));
        netTransfers.setCellValueFactory(new PropertyValueFactory<>("netTransfers"));
        currentValue.setCellValueFactory(new PropertyValueFactory<>("currentValue"));
        
        playerTable.setItems(playersData);
        
    }

}