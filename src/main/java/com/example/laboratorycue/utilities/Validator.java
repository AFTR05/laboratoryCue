package com.example.laboratorycue.utilities;

import com.example.laboratorycue.controller.ModelFactoryController;
import com.example.laboratorycue.model.DetalleObject;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Student;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Validator {
    private static ModelFactoryController mfc=ModelFactoryController.getInstance();
    public boolean validateLoan(Monitor monitorSelected, Student studentSelected, ObservableList<DetalleObject> detalleObjectObservableList, String date){
        if (monitorSelected == null|| studentSelected==null||detalleObjectObservableList==null||date==null){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Lack of information, some selections are missing");
            alert.showAndWait();
            return false;
        }
        return true;
    }

    public boolean validateLoanDate(String datePicker){
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        String beginDate =dtf.format(dateObj);
        String endDate =datePicker;
        String[] partsBeginDate = beginDate.split("-");
        String[] partsEndDate=endDate.split("-");
        if ((Integer.parseInt(partsBeginDate[0])>Integer.parseInt(partsEndDate[0]))||((Integer.parseInt(partsBeginDate[0])==Integer.parseInt(partsEndDate[0]))&&(Integer.parseInt(partsBeginDate[1])>Integer.parseInt(partsEndDate[1])))||((Integer.parseInt(partsBeginDate[0])==Integer.parseInt(partsEndDate[0]))&&(Integer.parseInt(partsBeginDate[1])==Integer.parseInt(partsEndDate[1])&&(Integer.parseInt(partsBeginDate[2])>Integer.parseInt(partsEndDate[2]))))){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("You select a wrong date");
            alert.showAndWait();
            return false;
        }
        return true;
    }


    public boolean validateMonitorStudent(String name,String career, String phoneNumber,String id,String typeDocument){
        if (name==null||career==null||phoneNumber==null||id==null||typeDocument==null){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Lack of information, some selections are missing");
            alert.showAndWait();
            return false;
        }
        return true;
    }

    public boolean validateNullObject(String name,String price,String stock,String code,String position,String status) {
        if (name == null || price == null || stock == null || code == null || position == null || status == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Lack of information, some selections are missing");
            alert.showAndWait();
            return false;
        }

        return true;
    }

    public boolean validateObjectLoan(DetalleObject detalleObject,String unids){
        try {
                if (detalleObject!=null){
                    detalleObject.setUnids(detalleObject.getUnids()+Integer.parseInt(unids));
                    return false;
                }
        }catch (NullPointerException npe){
            return true;
        }

        return true;
    }

}
