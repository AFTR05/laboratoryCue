package com.example.laboratorycue.model;

public class Student extends Person{
    private String career;

    private int amountLoan;

    public int getAmoutLoan() {
        return amountLoan;
    }

    public void setAmoutLoan(int amoutLoan) {
        this.amountLoan = amoutLoan;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public Student(String name,String career) {
        setName(name);
        this.career = career;
        this.amountLoan=0;
    }
}
