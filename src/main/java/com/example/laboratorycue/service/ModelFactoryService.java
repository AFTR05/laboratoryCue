package com.example.laboratorycue.service;

import com.example.laboratorycue.model.Career;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.TypeDocument;

public interface ModelFactoryService {
    void createMonitor(String name, String code, String phoneNumber, String typeDocument, String career);
    void updateMonitor(String name, String code, String phoneNumber, String typeDocument, String career);

    //Student-------------------------------------------------------------------------------------------------------------------------------------------------------------
    void createStudent(String name, String code, String phoneNumber, String typeDocument, String career);

    void updateStudent(String name, String code, String phoneNumber, String typeDocument, String career);

    void deleteMonitor(String name, String code, String phoneNumber, String typeDocument, String career);

    void deleteStudent(String name, String code, String phoneNumber, String typeDocument, String career);
}
