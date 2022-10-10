package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Loan;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Student;
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
            if(monitor.getCode().equals(code))
            {
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
