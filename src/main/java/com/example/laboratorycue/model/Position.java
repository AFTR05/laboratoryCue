package com.example.laboratorycue.model;

public enum Position {
   A1("A1"),B1("B1"),C1("C1"),A2("A2"),B2("B2"),C2("C2");

    private String position;

    Position(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
