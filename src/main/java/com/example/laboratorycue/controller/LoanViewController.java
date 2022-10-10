package com.example.laboratorycue.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class LoanViewController {
    ModelFactoryController mfc= ModelFactoryController.getInstance();

    @FXML
    private Button btnAddProduct;

    @FXML
    private Button btnConfirmLoan;

    @FXML
    private Button btnDeleteProduct;

    @FXML
    private Button btnSelectMonitor;

    @FXML
    private Button btnSelectStudent;

    @FXML
    private TableColumn<?, ?> columnAmountObjectsLoan;

    @FXML
    private TableColumn<?, ?> columnCodeObjectsLoan;

    @FXML
    private TableColumn<?, ?> columnNameObjectsLoan;

    @FXML
    private TableColumn<?, ?> columnPriceObjectsLoan;

    @FXML
    private TableColumn<?, ?> columnTypeObjectsLoan;

    @FXML
    private Button menuOptionLoanLoan;

    @FXML
    private Button menuOptionMonitorLoan;

    @FXML
    private Button menuOptionObjectsLoan;

    @FXML
    private Button menuOptionReportsLoan;

    @FXML
    private Button menuOptionStudentLoan;

    @FXML
    private TableView<?> tableObjectsLoans;

    @FXML
    void addProduct(ActionEvent event) {

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
    void confirmLoan(ActionEvent event) {

    }

    @FXML
    void deleteProduct(ActionEvent event) {

    }

    @FXML
    void selectMonitor(ActionEvent event) {

    }

    @FXML
    void selectStudent(ActionEvent event) {

    }

}
