package com.example.laboratorycue.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ObjectViewController {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    @FXML
    private Button btnBlockObject;

    @FXML
    private Button btnCreateObject;

    @FXML
    private Button btnDeleteObject;

    @FXML
    private Button btnMenuOptionLoanObject;

    @FXML
    private Button btnMenuOptionMonitorObject;

    @FXML
    private Button btnMenuOptionObjectsObjects;

    @FXML
    private Button btnMenuOptionReportsObject;

    @FXML
    private Button btnMenuOptionStudentObject;

    @FXML
    private Button btnUpdateObject;

    @FXML
    private ComboBox<?> cbTypeObject;

    @FXML
    private TableColumn<?, ?> columnCodeObject;

    @FXML
    private TableColumn<?, ?> columnNameObject;

    @FXML
    private TableColumn<?, ?> columnPriceObject;

    @FXML
    private TableColumn<?, ?> columnStockObject;

    @FXML
    private TableColumn<?, ?> columnTypeObject;

    @FXML
    private TableView<?> tableObject;

    @FXML
    private TextField txtCodeObject;

    @FXML
    private TextField txtNameObject;

    @FXML
    private TextField txtPriceObject;

    @FXML
    private TextField txtStockObject;

    @FXML
    void blockObject(ActionEvent event) {

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
    void createObject(ActionEvent event) {

    }

    @FXML
    void deleteObject(ActionEvent event) {

    }

    @FXML
    void seleccionarTipodeObjetoAction(ActionEvent event) {

    }

    @FXML
    void updateObject(ActionEvent event) {

    }

}
