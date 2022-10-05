package com.example.laboratorycue.model;

public class Loan {
    private String BeginLoan;
    private int daysLoan;
    private String code;
    private Monitor monitor;
    private Student student;
    private DetalleObject[] detalleObjects;
    private double totalValue;

    public Loan(String beginLoan, int daysLoan, String code, Monitor monitor, Student student, DetalleObject[] detalleObjects) {
        BeginLoan = beginLoan;
        this.daysLoan = daysLoan;
        this.code = code;
        this.monitor = monitor;
        this.student = student;
        this.detalleObjects = detalleObjects;
    }

    public String getBeginLoan() {
        return BeginLoan;
    }

    public void setBeginLoan(String beginLoan) {
        BeginLoan = beginLoan;
    }

    public int getDaysLoan() {
        return daysLoan;
    }

    public void setDaysLoan(int daysLoan) {
        this.daysLoan = daysLoan;
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

    public DetalleObject[] getDetalleObjects() {
        return detalleObjects;
    }

    public void setDetalleObjects(DetalleObject[] detalleObjects) {
        this.detalleObjects = detalleObjects;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
