package com.example.laboratorycue.model;

import javafx.collections.ObservableList;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Loan {
    private String BeginLoan;
    private String EndLoan;
    private String code;
    private Monitor monitor;
    private Student student;
    private String nameMonitor;
    private String nameStudent;
    private  ObservableList<DetalleObject> detalleObjects;
    private double totalValue;
    SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    Date dateObj = calendar.getTime();


    public Loan(String endLoan, String code, Monitor monitor, Student student, ObservableList<DetalleObject> detalleObjects) {
        BeginLoan = dtf.format(dateObj);
        EndLoan = endLoan;
        this.code = code;
        this.monitor = monitor;
        this.student = student;
        this.nameMonitor=this.monitor.getName();
        this.nameStudent=this.student.getName();
        this.detalleObjects = detalleObjects;
        this.totalValue=0;
    }

    public String getNameMonitor() {
        return nameMonitor;
    }

    public void setNameMonitor(String nameMonitor) {
        this.nameMonitor = nameMonitor;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEndLoan() {
        return EndLoan;
    }

    public void setEndLoan(String endLoan) {
        EndLoan = endLoan;
    }

    public String getBeginLoan() {
        return BeginLoan;
    }

    public void setBeginLoan(String beginLoan) {
        BeginLoan = beginLoan;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ObservableList<DetalleObject> getDetalleObjects() {
        return detalleObjects;
    }

    public void setDetalleObjects(ObservableList<DetalleObject> detalleObjects) {
        this.detalleObjects = detalleObjects;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
