package com.example.laboratorycue.service.impl;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Position;
import com.example.laboratorycue.service.ObjectService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ObjectServiceImpl implements ObjectService {
    private ObservableList<Object> observablelistStudent= FXCollections.observableArrayList();

    @Override
    public void generateProve(){
        observablelistStudent.add(new Object("Portaltil","9875236", Position.A1.getPosition(),20,1000));
    }

    public ObservableList<Object> getObservablelistStudent() {
        return observablelistStudent;
    }

    public void setObservablelistStudent(ObservableList<Object> observablelistStudent) {
        this.observablelistStudent = observablelistStudent;
    }
}
