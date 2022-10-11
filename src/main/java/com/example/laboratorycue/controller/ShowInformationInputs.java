package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Student;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ShowInformationInputs {
    public void showMonitorInformation(Monitor monitorSelected, TextField txtName, ComboBox cbType,ComboBox cbCareer,TextField txtPhone,TextField txtId){
        if(monitorSelected != null){
            txtName.setText(monitorSelected.getName());
            cbType.setValue(monitorSelected.getTypeDocument());
            cbCareer.setValue(monitorSelected.getCareer());
            txtPhone.setText(monitorSelected.getPhoneNumber());
            txtId.setText(monitorSelected.getCode());
        }
    }

    public void showStudentInformation(Student studentSelected, TextField txtName, ComboBox cbType, ComboBox cbCareer, TextField txtPhone, TextField txtId){
        if(studentSelected != null){
            txtName.setText(studentSelected.getName());
            cbType.setValue(studentSelected.getTypeDocument());
            cbCareer.setValue(studentSelected.getCareer());
            txtPhone.setText(studentSelected.getPhoneNumber());
            txtId.setText(studentSelected.getCode());
        }
    }

    public void showObjectInformation(Object objectSelected, TextField txtName, TextField txtStock, TextField txtPrice, TextField txtCode, ComboBox cbPosition){
        if(objectSelected != null){
            txtName.setText(objectSelected.getName());
            txtStock.setText(String.valueOf(objectSelected.getStock()));
            txtPrice.setText(String.valueOf(objectSelected.getPrice()));
            txtCode.setText(objectSelected.getCode());
            cbPosition.setValue(objectSelected.getPosition());
        }
    }
}
