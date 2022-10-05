package com.example.laboratorycue.model;

public class DetalleObject {
    private Object object;
    private int unids;

    public DetalleObject(Object object, int unids) {
        this.object = object;
        this.unids = unids;
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
}
