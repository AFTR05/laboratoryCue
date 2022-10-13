package com.example.laboratorycue.controller;

import com.example.laboratorycue.Application;
import com.example.laboratorycue.model.DetalleObject;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.utilities.ChangerScenesController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoanViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    DetalleObject detalleObjectSelected;
    private ObservableList<DetalleObject> listLoanObject= FXCollections.observableArrayList();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mfc.getLaboratory().getPreparatorTable().prepareTableDetalleObject(columnNameObjectsLoan,columnCodeObjectsLoan,columnPriceObjectsLoan,columnPositionObjectsLoan,columnUnidsObjectsLoan);
        //Selection------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        tableObjectsLoans.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            detalleObjectSelected =newSelection;
        });
// configure comboBox and ObservableList-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        tableObjectsLoans.setItems(mfc.getObjectObservableList());
    }

    @FXML
    private Button btnAddProduct;

    @FXML
    private Button btnConfirmLoan;

    @FXML
    private Button btnSelectMonitor;

    @FXML
    private Button btnSelectStudent;

    @FXML
    private TableColumn<DetalleObject, Integer> columnUnidsObjectsLoan;

    @FXML
    private TableColumn<DetalleObject, String> columnCodeObjectsLoan;

    @FXML
    private TableColumn<DetalleObject, String> columnNameObjectsLoan;

    @FXML
    private TableColumn<DetalleObject, Double> columnPriceObjectsLoan;

    @FXML
    private TableColumn<DetalleObject, String> columnPositionObjectsLoan;

    @FXML
    private DatePicker dateEndPicker;

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
    private TableView<DetalleObject> tableObjectsLoans;

    @FXML
    void addProduct(ActionEvent event) throws IOException {
        changerScenesController.changeToModalObject(event);
        tableObjectsLoans.setItems(mfc.getObjectObservableList());
        tableObjectsLoans.refresh();
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
        if (mfc.getLaboratory().getValidator().validateLoan(mfc.getMonitorLoanSelected(),mfc.getStudentLoanSelected(),mfc.getObjectObservableList(),String.valueOf(dateEndPicker.getValue()))&& (mfc.getLaboratory().getValidator().validateLoanDate(String.valueOf(dateEndPicker.getValue())))){
            mfc.createLoan(String.valueOf(dateEndPicker.getValue()));
        }

    }


    @FXML
    void selectMonitor(ActionEvent event) throws IOException{
        changerScenesController.changeToModalMonitor(event);
    }

    @FXML
    void selectStudent(ActionEvent event) throws IOException {
        changerScenesController.changeToModalStudent(event);
    }

}
