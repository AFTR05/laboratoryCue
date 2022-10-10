package com.example.laboratorycue.model;

public enum Career {
    PSI("psychology"),MED("medicine"),LAW("law"),BA("business administration"),NU("nursing"),IE("industrial engineering"),
    DMSC("digital marketing and strategic communication"),SE("Software Engineering"),CE("civil Engineering"),VET("vet");
    private String career;

    Career(String career) {
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
