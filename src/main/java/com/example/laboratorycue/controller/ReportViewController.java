package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.utilities.ChangerScenesController;
import com.example.laboratorycue.utilities.PreparatorTable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ReportViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    //monitors----------------------------------------------------------------------------------------------------------------------------------------------------------------
        preparatorTable.prepareTableStudentMonitor(columnNameMonitorsReports,columnCareerMonitorsReports,columnIdMonitorsReports,columnPhoneNumberMonitorsReports,columnAmountLoanMonitorsReports);
        tableMonitorsReports.setItems(mfc.getLaboratory().getMonitorService().getObservablelistMonitor());
    //student-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        preparatorTable.prepareTableStudentMonitor(columnNameStudentsReports,columnCareerStudentsReports,columnIdStudentsReports,columnPhoneNumberStudentsReports,columnAmountLoanStudentsReports);
        tableStudentsReports.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
    //objects-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        mfc.getLaboratory().getPreparatorTable().prepareTableObject(columnNameObjectsReports,columnCodeObjectsReports,columnPriceObjectsReports,columnStockObjectsReports,columnAmountLoanObjectsReports,columnPositionObjectsReports,columnStatusObjectsReports);
        tableObjectsReports.setItems(mfc.getLaboratory().getObjectService().getObservablelistObject());
    }

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
    private TableColumn<Object, String> columnStatusObjectsReports;

    @FXML
    private TableColumn<Monitor, Integer> columnAmountLoanMonitorsReports;

    @FXML
    private TableColumn<Object, Integer> columnAmountLoanObjectsReports;

    @FXML
    private TableColumn<Student, Integer> columnAmountLoanStudentsReports;

    @FXML
    private TableColumn<Monitor, String> columnCareerMonitorsReports;

    @FXML
    private TableColumn<Student, String> columnCareerStudentsReports;

    @FXML
    private TableColumn<Object, String> columnCodeObjectsReports;

    @FXML
    private TableColumn<Monitor, String> columnIdMonitorsReports;

    @FXML
    private TableColumn<Student, String> columnIdStudentsReports;

    @FXML
    private TableColumn<Monitor, String> columnNameMonitorsReports;

    @FXML
    private TableColumn<Object, String> columnNameObjectsReports;

    @FXML
    private TableColumn<Student, String> columnNameStudentsReports;

    @FXML
    private TableColumn<Monitor, String> columnPhoneNumberMonitorsReports;

    @FXML
    private TableColumn<Student, String> columnPhoneNumberStudentsReports;

    @FXML
    private TableColumn<Object, String> columnPositionObjectsReports;

    @FXML
    private TableColumn<Object, Double> columnPriceObjectsReports;

    @FXML
    private TableColumn<Object, Integer> columnStockObjectsReports;

    @FXML
    private TableView<Monitor> tableMonitorsReports;

    @FXML
    private TableView<Object> tableObjectsReports;

    @FXML
    private TableView<Student> tableStudentsReports;


    @FXML
    void changeToLoanView(ActionEvent event) throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToLoanView(event);
    }

    @FXML
    void changeToMonitorView(ActionEvent event)throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToMonitorView(event);
    }

    @FXML
    void changeToObjectsView(ActionEvent event)throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToObjectsView(event);
    }

    @FXML
    void changeToReportsView(ActionEvent event)throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToReportsView(event);
    }

    @FXML
    void changeToStudentView(ActionEvent event)throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToStudentView(event);
    }


    @FXML
    void changeToLoanReport(ActionEvent event) throws IOException{
        mfc.getLaboratory().getChangerScenes().changeToLoanReportView(event);
    }

}
