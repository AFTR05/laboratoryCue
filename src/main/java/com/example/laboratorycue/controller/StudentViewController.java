package com.example.laboratorycue.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StudentViewController {
    ModelFactoryController mfc= ModelFactoryController.getInstance();


    @FXML
    private Button btnUpdateStudent;

    @FXML
    private Button btnCancelStudent;

    @FXML
    private Button btnCreateStudent;

    @FXML
    private Button btnDeleteStudent;

    @FXML
    private Button btnMenuOptionLoanStudent;

    @FXML
    private Button btnMenuOptionMonitorStudent;

    @FXML
    private Button btnMenuOptionObjectsStudent;

    @FXML
    private Button btnMenuOptionReportsStudent;

    @FXML
    private Button btnMenuOptionStudentStudent;

    @FXML
    private ComboBox<?> cbTypeStudent;

    @FXML
    private TableColumn<?, ?> columnCareerStudent;

    @FXML
    private TableColumn<?, ?> columnDirectionStudent;

    @FXML
    private TableColumn<?, ?> columnIdStudent;

    @FXML
    private TableColumn<?, ?> columnNameStudent;

    @FXML
    private TableColumn<?, ?> columnAmountLoanStudent;

    @FXML
    private TableView<?> tableStudent;

    @FXML
    private TextField txtCareerStudent;

    @FXML
    private TextField txtDirectionStudent;

    @FXML
    private TextField txtIdStudent;

    @FXML
    private TextField txtNameStudent;

    @FXML
    void cancelStudent(ActionEvent event) {

    }

    private ChangerScenesController changerScenesController=new ChangerScenesController();

    @FXML
    void changeToLoanView(ActionEvent event) throws IOException {
        changerScenesController.changeToLoanView(event);
    }

    @FXML
    void changeToMonitorView(ActionEvent event) throws IOException{
        changerScenesController.changeToMonitorView(event);
    }

    @FXML
    void changeToObjectsView(ActionEvent event) throws IOException{
        changerScenesController.changeToObjectsView(event);
    }

    @FXML
    void changeToReportsView(ActionEvent event) throws IOException{
        changerScenesController.changeToReportsView(event);
    }

    @FXML
    void changeToStudentView(ActionEvent event) throws IOException{
        changerScenesController.changeToStudentView(event);
    }
    @FXML
    void updateStudent(ActionEvent event) {

    }

    @FXML
    void createStudent(ActionEvent event) {

    }

    @FXML
    void deleteStudent(ActionEvent event) {

    }

    @FXML
    void seleccionarTipoDocumentoAction(ActionEvent event) {

    }

}
