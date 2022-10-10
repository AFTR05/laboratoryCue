package com.example.laboratorycue.model;

public class Monitor extends Student {

    private int ageInCompany;
    private double totalIncomeLoan;

    public Monitor(String name, String code, String phoneNumber, String typeDocument, String career) {
        super(name, code, phoneNumber, typeDocument, career);
        setAmoutLoan(0);
        this.ageInCompany = 0;
        this.totalIncomeLoan = 0;
    }

    public int getAgeInCompany() {
        return ageInCompany;
    }

    public void setAgeInCompany(int ageInCompany) {
        this.ageInCompany = ageInCompany;
    }

    public double getTotalIncomeLoan() {
        return totalIncomeLoan;
    }

    public void setTotalIncomeLoan(double totalIncomeLoan) {
        this.totalIncomeLoan = totalIncomeLoan;
    }
}
