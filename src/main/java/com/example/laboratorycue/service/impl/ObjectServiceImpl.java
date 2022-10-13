package com.example.laboratorycue.service.impl;
import com.example.laboratorycue.utilities.SearcherObject;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Position;
import com.example.laboratorycue.model.Status;
import com.example.laboratorycue.service.ObjectService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ObjectServiceImpl implements ObjectService {
    private ObservableList<Object> observablelistObject= FXCollections.observableArrayList();
    SearcherObject searcherObject=new SearcherObject();

    @Override
    public void generateProve(){
        observablelistObject.add(new Object("Portaltil","9875236", Position.A1.getPosition(),20,1000, Status.Active.getState()));
    }

    public ObservableList<Object> getObservablelistObject() {
        return observablelistObject;
    }

    @Override
    public void createObject(String name, String code, double price, int stock, String position,String status) {
        observablelistObject.add(new Object(name,code,position,stock,price,status));
    }

    @Override
    public boolean updateObject(String name, String code, double price, int stock, String position,String status,String oldCode) {
        Object object = null;
        object = searcherObject.getObject(oldCode,observablelistObject);
        if(object != null){
            object.setName(name);
            object.setCode(code);
            object.setPrice(price);
            object.setStock(stock);
            object.setPosition(position);
            object.setStatus(status);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void deleteObject(String name, String code, double price, int stock, String position,String status) {
        Object object=searcherObject.getObject(code,observablelistObject);
        if (object!=null){
            observablelistObject.remove(object);
        }
    }
}
