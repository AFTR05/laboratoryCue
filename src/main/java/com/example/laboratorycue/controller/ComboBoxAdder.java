package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Career;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.TypeDocument;
import javafx.scene.control.ComboBox;

public class ComboBoxAdder {
    public void addComboBoxOptionsTypeDocument(ComboBox comboBox) {
        comboBox.getItems().addAll(TypeDocument.CC.getTypeDocument(), TypeDocument.FI.getTypeDocument(), TypeDocument.NPI.getTypeDocument(), TypeDocument.TIN.getTypeDocument(), TypeDocument.IC.getTypeDocument(), TypeDocument.PA.getTypeDocument());
    }

    public void addComboBoxOptionsCareer(ComboBox comboBox){
        comboBox.getItems().addAll(Career.SE.getCareer(),Career.BA.getCareer(),Career.CE.getCareer(),Career.IE.getCareer(),Career.DMSC.getCareer(),Career.LAW.getCareer(),Career.MED.getCareer(),Career.NU.getCareer(),Career.PSI.getCareer(),Career.VET.getCareer());
    }
}
