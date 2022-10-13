package com.example.laboratorycue.utilities;

import com.example.laboratorycue.model.*;
import javafx.scene.control.ComboBox;

public class ComboBoxAdder {
    public void addComboBoxOptionsTypeDocument(ComboBox comboBox) {
        comboBox.getItems().addAll(TypeDocument.CC.getTypeDocument(), TypeDocument.FI.getTypeDocument(), TypeDocument.NPI.getTypeDocument(), TypeDocument.TIN.getTypeDocument(), TypeDocument.IC.getTypeDocument(), TypeDocument.PA.getTypeDocument());
    }

    public void addComboBoxOptionsCareer(ComboBox comboBox){
        comboBox.getItems().addAll(Career.SE.getCareer(),Career.BA.getCareer(),Career.CE.getCareer(),Career.IE.getCareer(),Career.DMSC.getCareer(),Career.LAW.getCareer(),Career.MED.getCareer(),Career.NU.getCareer(),Career.PSI.getCareer(),Career.VET.getCareer());
    }
    public void addComboBoxOptionsPosition(ComboBox comboBox){
        comboBox.getItems().addAll(Position.A1.getPosition(),Position.A2.getPosition(),Position.B1.getPosition(),Position.B2.getPosition(),Position.C1.getPosition(),Position.C2.getPosition());
    }

    public void addComboBoxOptionsStatus(ComboBox comboBox){
        comboBox.getItems().addAll(Status.Active.getState(),Status.Block.getState());
    }
}
