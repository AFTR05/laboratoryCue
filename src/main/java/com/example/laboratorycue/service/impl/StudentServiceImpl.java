package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.model.Career;
import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.model.TypeDocument;
import com.example.laboratorycue.service.StudentService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StudentServiceImpl implements StudentService {
    public ObservableList<Student> observablelistStudent= FXCollections.observableArrayList();

    public ObservableList<Student> getObservablelistStudent() {
        return observablelistStudent;
    }

    public void setObservablelistStudent(ObservableList<Student> observablelistStudent) {
        this.observablelistStudent = observablelistStudent;
    }


    @Override
    public boolean updateStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {
        return true;
    }

    @Override
    public void createStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {

    }

    @Override
    public void deleteStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {

    }

    @Override
    public void generateProve() {
        Student student=new Student("Harold Andres Toro Ossa","89004609","3163405218", TypeDocument.CC.getTypeDocument(), Career.SE.getCareer());
        observablelistStudent.add(student);

    }
}
