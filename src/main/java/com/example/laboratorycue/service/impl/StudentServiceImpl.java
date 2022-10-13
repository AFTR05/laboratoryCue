package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.utilities.SearcherObject;
import com.example.laboratorycue.model.Career;
import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.model.TypeDocument;
import com.example.laboratorycue.service.StudentService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class StudentServiceImpl implements StudentService {
    private SearcherObject searcherObject=new SearcherObject();
    private ObservableList<Student> observablelistStudent= FXCollections.observableArrayList();

    public ObservableList<Student> getObservablelistStudent() {
        return observablelistStudent;
    }

    public void setObservablelistStudent(ObservableList<Student> observablelistStudent) {
        this.observablelistStudent = observablelistStudent;
    }


    @Override
    public boolean updateStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career,String oldCode) {
        Student student=null;
        student=searcherObject.getStudent(oldCode,observablelistStudent);
        if(student != null){
            student.setName(name);
            student.setCode(code);
            student.setPhoneNumber(phoneNumber);
            student.setTypeDocument(typeDocument);
            student.setCareer(career);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void createStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {
        observablelistStudent.add(new Student(name, code, phoneNumber, typeDocument, career));
    }

    @Override
    public void deleteStudentMonitor(String name, String code, String phoneNumber, String typeDocument, String career) {
        Student student=null;
        student=searcherObject.getStudent(code,observablelistStudent);
        if (student!=null){
            observablelistStudent.remove(student);
        }

    }

    @Override
    public void generateProve() {
        Student student=new Student("Harold Andres Toro Ossa","89004609","3163405218", TypeDocument.CC.getTypeDocument(), Career.SE.getCareer());
        observablelistStudent.add(student);

    }
}
