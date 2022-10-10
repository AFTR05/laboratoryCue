package com.example.laboratorycue.controller;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class DeleterInputs {
    public void deleteInputStudent(TextField textField1,TextField textField2,TextField textField3 ,ComboBox comboBox1,ComboBox comboBox2){
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        comboBox1.setValue("");
        comboBox2.setValue("");
    }
}
