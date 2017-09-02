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
import java.net.URL;
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
    private TableColumn<PlayerBean, String> ownPercent;

    @FXML
    private TableColumn<PlayerBean, Integer> transfersIn;

    @FXML
    private TableColumn<PlayerBean, Integer> transfersOut;

    @FXML
    private TableColumn<PlayerBean, Integer> netTransfers;

    @FXML
    private TableColumn<PlayerBean, Integer> currentValue;
   
    
    final ObservableList<PlayerBean> playersData = FXCollections.observableArrayList(new PlayerBean("Mesut","Ozil",4000,5000,1000,40.2,"9.5"),
            new PlayerBean("Mesut","Ozil2",4000,5000,1000,40.2,"9.5"),
            new PlayerBean("Mesut","Ozil3",4000,5000,1000,40.2,"9.5"),
            new PlayerBean("Mesut","Ozil4",4000,5000,1000,40.2,"9.5"));
    
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