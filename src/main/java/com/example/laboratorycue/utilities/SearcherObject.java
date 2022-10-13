package com.example.laboratorycue.utilities;

import com.example.laboratorycue.model.*;
import com.example.laboratorycue.model.Object;
import javafx.collections.ObservableList;

public class SearcherObject {
    public Student getStudent(String code, ObservableList<Student> observableListStudent) {
        for (Student student : observableListStudent) {
            if(student.getCode().equals(code))
            {
                return student;
            }
        }
        return null;
    }

    public Monitor getMonitor(String code,ObservableList<Monitor> observableListMonitor){
        for (Monitor monitor : observableListMonitor) {
            if(monitor.getCode().equals(code)){
                return monitor;
            }
        }
        return null;
    }

    public Object getObject(String code,ObservableList<Object> observableListObject){
        for (Object object : observableListObject) {
            if(object.getCode().equals(code))
            {
                return object;
            }
        }
        return null;
    }

    public Object getObjectStatus(String status, ObservableList<Object> observableListObject){
        for (Object object : observableListObject) {
            if(object.getStatus().equals(Status.Block))
            {
                return object;
            }
        }
        return null;
    }

    public DetalleObject getObjectObject(Object obj, ObservableList<DetalleObject> observableListObject){
        for (DetalleObject detalleObject : observableListObject) {
            if(detalleObject.getObject().getCode().equals(obj.getCode()))
            {
                return detalleObject;
            }
        }
        return null;
    }

    public Loan getLoan(String code,ObservableList<Loan> observableListLoan){
        for (Loan loan : observableListLoan) {
            if(loan.getCode().equals(code))
            {
                return loan;
            }
        }
        return null;
    }
}
