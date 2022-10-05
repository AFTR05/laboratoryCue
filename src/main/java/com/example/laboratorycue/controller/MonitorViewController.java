package com.example.laboratorycue.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class MonitorViewController {

    @FXML
    private Button btnCancelMonitor;

    @FXML
    private Button btnCreateMonitor;

    @FXML
    private Button btnDeleteMonitor;

    @FXML
    private Button btnMenuOptionLoanMonitor;

    @FXML
    private Button btnMenuOptionMonitorMonitor;

    @FXML
    private Button btnMenuOptionObjectsMonitor;

    @FXML
    private Button btnMenuOptionReportsMonitor;

    @FXML
    private Button btnMenuOptionStudentMonitor;

    @FXML
    private ComboBox<?> cbTypeMonitor;

    @FXML
    private TableColumn<?, ?> columnCareerMonitor;

    @FXML
    private TableColumn<?, ?> columnDirectionMonitor;

    @FXML
    private TableColumn<?, ?> columnIdMonitor;

    @FXML
    private TableColumn<?, ?> columnNameMonitor;

    @FXML
    private TableColumn<?, ?> columnTypeMonitor;

    @FXML
    private ImageView imageCueMonitor;

    @FXML
    private TableView<?> tableMonitor;

    @FXML
    private TextField txtCareerMonitor;

    @FXML
    private TextField txtDirectionMonitor;

    @FXML
    private TextField txtIdMonitor;

    @FXML
    private TextField txtNameMonitor;

    @FXML
    void cancelMonitor(ActionEvent event) {

    }
    private ChangerScenesController changerScenesController=new ChangerScenesController();
    @FXML
    void changeToMonitorView(ActionEvent event) throws IOException {
        changerScenesController.changeToMonitorView(event);
    }
    @FXML
    void changeToLoanView(ActionEvent event) throws IOException {
        changerScenesController.changeToLoanView(event);
    }



    @FXML
    void changeToObjectsView(ActionEvent event) throws IOException {
        changerScenesController.changeToObjectsView(event);
    }

    @FXML
    void changeToReportsView(ActionEvent event) throws IOException {
        changerScenesController.changeToReportsView(event);
    }

    @FXML
    void changeToStudentView(ActionEvent event) throws IOException {
        changerScenesController.changeToStudentView(event);
    }

    @FXML
    void deleteMonitor(ActionEvent event) {

    }

    @FXML
    void seleccionarTipoDocumentoAction(ActionEvent event) {

    }

}
