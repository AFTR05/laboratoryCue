package com.example.laboratorycue.model;

public class Student{
    private String name;
    private String code;
    private String phoneNumber;
    private String typeDocument;
    private String career;

    private int amountLoan;
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public void setName(String name) {
        this.name = name;
    }


    public int getAmoutLoan() {
        return amountLoan;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public void setAmoutLoan(int amoutLoan) {
        this.amountLoan = amoutLoan;
    }



    public int getAmountLoan() {
        return amountLoan;
    }

    public void setAmountLoan(int amountLoan) {
        this.amountLoan = amountLoan;
    }

    public Student(String name, String code, String phoneNumber, String typeDocument, String career) {
        this.name = name;
        this.code = code;
        this.phoneNumber = phoneNumber;
        this.typeDocument = typeDocument;
        this.career = career;
        this.amountLoan = 0;
    }
}
