package com.example.laboratorycue.model;

public class DetalleObject {
    private Object object;

    private String objectName;
    private String objectCode;
    private Double objectPrice;
    private String objectPosition;
    private int unids;

    public DetalleObject(Object object, int unids) {
        this.object = object;
        this.unids = unids;
        this.objectName=this.object.getName();
        this.objectCode=this.object.getCode();
        this.objectPrice=this.object.getPrice();
        this.objectPosition=this.object.getPosition();

    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getUnids() {
        return unids;
    }

    public void setUnids(int unids) {
        this.unids = unids;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public Double getObjectPrice() {
        return objectPrice;
    }

    public void setObjectPrice(Double objectPrice) {
        this.objectPrice = objectPrice;
    }

    public String getObjectPosition() {
        return objectPosition;
    }

    public void setObjectPosition(String objectPosition) {
        this.objectPosition = objectPosition;
    }
}
