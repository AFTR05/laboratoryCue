package com.example.laboratorycue.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class ReportViewController {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    @FXML
    private Button btnMenuOptionLoanReport;

    @FXML
    private Button btnMenuOptionMonitorReport;

    @FXML
    private Button btnMenuOptionObjectsReport;

    @FXML
    private Button btnMenuOptionReportsReport;

    @FXML
    private Button btnMenuOptionStudentReport;

    @FXML
    private TableColumn<?, ?> columnAmountObjectsReports;

    @FXML
    private TableColumn<?, ?> columnCareerMonitorsReports;

    @FXML
    private TableColumn<?, ?> columnCareerStudentsReports;

    @FXML
    private TableColumn<?, ?> columnCodeObjectsReports;

    @FXML
    private TableColumn<?, ?> columnDirectionMonitorsReports;

    @FXML
    private TableColumn<?, ?> columnDirectionStudentsReports;

    @FXML
    private TableColumn<?, ?> columnIdMonitorsReports;

    @FXML
    private TableColumn<?, ?> columnIdStudentsReports;

    @FXML
    private TableColumn<?, ?> columnNameMonitorsReports;

    @FXML
    private TableColumn<?, ?> columnNameObjectsReports;

    @FXML
    private TableColumn<?, ?> columnNameStudentsReports;

    @FXML
    private TableColumn<?, ?> columnPriceObjectsReports;

    @FXML
    private TableColumn<?, ?> columnTypeMonitorsReports;

    @FXML
    private TableColumn<?, ?> columnTypeObjectsReports;

    @FXML
    private TableColumn<?, ?> columnTypeStudentsReports;

    @FXML
    private TableView<?> tableMonitorsReports;

    @FXML
    private TableView<?> tableObjectsReports;

    @FXML
    private TableView<?> tableStudentsReports;

    private ChangerScenesController changerScenesController=new ChangerScenesController();

    @FXML
    void changeToLoanView(ActionEvent event) throws IOException {
        changerScenesController.changeToLoanView(event);
    }

    @FXML
    void changeToMonitorView(ActionEvent event)throws IOException {
        changerScenesController.changeToMonitorView(event);
    }

    @FXML
    void changeToObjectsView(ActionEvent event)throws IOException {
        changerScenesController.changeToObjectsView(event);
    }

    @FXML
    void changeToReportsView(ActionEvent event)throws IOException {
        changerScenesController.changeToReportsView(event);
    }

    @FXML
    void changeToStudentView(ActionEvent event)throws IOException {
        changerScenesController.changeToStudentView(event);
    }

}
