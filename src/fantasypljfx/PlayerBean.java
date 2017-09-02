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
    private final SimpleDoubleProperty ownPercent;
    private final SimpleStringProperty currentValue;
    private final SimpleIntegerProperty transfersIn;
    private final SimpleIntegerProperty transfersOut;
    private final SimpleIntegerProperty netTransfers;
    
    public PlayerBean(String firstName, String secondName, String currentValue, Double ownPercent,Integer transfersIn, Integer transfersOut, Integer netTransfers) {
        this.firstName = new SimpleStringProperty(firstName);
        this.secondName =new SimpleStringProperty(secondName);
        this.ownPercent = new SimpleDoubleProperty(ownPercent);
        this.currentValue = new SimpleStringProperty(currentValue);
        this.transfersIn = new SimpleIntegerProperty(transfersIn);
        this.transfersOut = new SimpleIntegerProperty(transfersOut);
        this.netTransfers = new SimpleIntegerProperty(netTransfers);
    }
     public String getFirstName() {
        return firstName.get();
    }

    public String getSecondName() {
        return secondName.get();
    }

    public Double getOwnPercent() {
        return ownPercent.get();
    }

    public String getCurrentValue() {
        return currentValue.get();
    }
    public int getTransfersIn() {
        return transfersIn.get();
    }

    public int getTransfersOut() {
        return transfersOut.get();
    }

    public int getNetTransfers() {
        return netTransfers.get();
    }

   
}
