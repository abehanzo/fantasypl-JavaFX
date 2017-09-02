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
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty secondName;
    private final SimpleIntegerProperty transfersIn;
    private final SimpleIntegerProperty transfersOut;
  //  private SimpleIntegerProperty netTransfers;
    private final SimpleDoubleProperty selectedByPercent;
    private final SimpleStringProperty currentValue;
   
    public PlayerBean(String firstName, String secondName, Integer transfersIn, Integer transfersOut, Integer netTransfers, Double selectedByPercent, String currentValue) {
        this.firstName = new SimpleStringProperty(firstName);
        this.secondName =new SimpleStringProperty(secondName);
        this.transfersIn = new SimpleIntegerProperty(transfersIn);
        this.transfersOut = new SimpleIntegerProperty(transfersOut);
        //this.netTransfers = netTransfers;
        this.selectedByPercent = new SimpleDoubleProperty(selectedByPercent);
        this.currentValue = new SimpleStringProperty(currentValue);
    }
     public String getFirstName() {
        return firstName.get();
    }

    public String getSecondName() {
        return secondName.get();
    }

    public int getTransfersIn() {
        return transfersIn.get();
    }

    public int getTransfersOut() {
        return transfersOut.get();
    }

    /*public SimpleIntegerProperty getNetTransfers() {
        return netTransfers;
    }*/

    public double getSelectedByPercent() {
        return selectedByPercent.get();
    }

    public String getCurrentValue() {
        return currentValue.get();
    }
   
}
