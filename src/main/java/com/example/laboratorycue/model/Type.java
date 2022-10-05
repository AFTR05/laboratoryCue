package com.example.laboratorycue.model;

public enum Type {
   FICHAS("Ensamble","A1"),PIEZAS_METAL("Estructura","B1"),ESFERAS("Movimiento","C1"),RUEDAS("Movimiento","C1");

    private String use;
    private String position;

    private Type(String use, String position){
        this.use = use;
        this.position = position;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
