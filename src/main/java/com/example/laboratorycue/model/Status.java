package com.example.laboratorycue.model;

public enum Status {
    Block("Block"),Active("Active");

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Status(String state) {
        this.state = state;
    }
}
