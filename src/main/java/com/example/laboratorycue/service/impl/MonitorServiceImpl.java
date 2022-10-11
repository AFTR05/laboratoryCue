package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.controller.SearcherObject;
import com.example.laboratorycue.model.Career;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.TypeDocument;
import com.example.laboratorycue.service.StudentService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MonitorServiceImpl implements StudentService {
    private ObservableList<Monitor> observablelistMonitor= FXCollections.observableArrayList();

    private SearcherObject searcherObject=new SearcherObject();
    public ObservableList<Monitor> getObservablelistMonitor() {
        return observablelistMonitor;
    }

    @Override
    public void createStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {
        observablelistMonitor.add(new Monitor(name, code, phoneNumber, typeDocument, career));
    }

    @Override
    public boolean updateStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career,String oldCode){
        Monitor monitor = searcherObject.getMonitor(oldCode,observablelistMonitor);
        if(monitor != null){
            monitor.setName(name);
            monitor.setCode(code);
            monitor.setPhoneNumber(phoneNumber);
            monitor.setTypeDocument(typeDocument);
            monitor.setCareer(career);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void deleteStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career){
        Monitor monitor=null;
        monitor=searcherObject.getMonitor(code,observablelistMonitor);
        if (monitor!=null){
            observablelistMonitor.remove(monitor);
        }
    }

    @Override
    public void generateProve() {
        observablelistMonitor.add(new Monitor("Andres Toro","1094887554","3164066163",TypeDocument.IC.getTypeDocument(), Career.SE.getCareer()));
    }
}
