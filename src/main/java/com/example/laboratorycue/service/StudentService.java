package com.example.laboratorycue.service;

import com.example.laboratorycue.model.Career;
import com.example.laboratorycue.model.TypeDocument;

public interface StudentService {
    void createStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career);

    boolean updateStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career);

    void deleteStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career);

    void generateProve();
}
