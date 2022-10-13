package com.example.laboratorycue.utilities;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class DeleterInputs {
    public void deleteInputStudent(TextField textField1,TextField textField2,TextField textField3 ,ComboBox comboBox1,ComboBox comboBox2){
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        comboBox1.setValue("Career");
        comboBox2.setValue("Type");
    }

    public void deleteInputObject(TextField textField1,TextField textField2,TextField textField3,TextField textField4,ComboBox comboBox1,ComboBox comboBox2){
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        comboBox1.setValue("Position");
        comboBox2.setValue("Status");
    }

    public void deleteInputLoan(DatePicker datePicker){
        datePicker.setValue(null);
    }
}
