package com.example.laboratorycue.utilities;

import com.example.laboratorycue.controller.ModelFactoryController;
import com.example.laboratorycue.model.DetalleObject;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Student;
import javafx.collections.ObservableList;
import javafx.scene.control.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Validator {
    private static ModelFactoryController mfc=ModelFactoryController.getInstance();
    public boolean validateLoan(Monitor monitorSelected, Student studentSelected, ObservableList<DetalleObject> detalleObjectObservableList, String date){
        if (monitorSelected == null|| studentSelected==null||detalleObjectObservableList==null||date==null){
            return false;
        }
        return true;
    }

    public boolean validateLoanDate(String datePicker){
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        dtf.format(dateObj);
        return true;
    }

    public boolean validateUnidsObject(){
        return true;
    }

    public boolean validateMonitorStudent(String name,String career, String phoneNumber,String id,String typeDocument){
        if (name==null||career==null||phoneNumber==null||id==null||typeDocument==null){
            return false;
        }
        return true;
    }

    public boolean validateNullObject(){
        return true;
    }

    public boolean validateNumberObject(){
        return true;
    }

}
