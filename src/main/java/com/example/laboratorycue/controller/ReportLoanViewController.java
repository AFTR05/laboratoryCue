package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Loan;
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

public class ReportLoanViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //loan------------------------------------------------------------------------------------------------------------------------------------------------------------
        mfc.getLaboratory().getPreparatorTable().prepareTableLoan(columnCodeLoanReports,columnBeginLoanReports,columnFinalLoanReports,columnMonitorLoanReports,columnStudentLoanReports);
        tableLoanReports.setItems((mfc.getLaboratory().getLoanService().getObservablelistLoan()));
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
    private Button btnStudentObjectReportLoan;

    @FXML
    private TableColumn<Loan, String> columnBeginLoanReports;

    @FXML
    private TableColumn<Loan, String> columnCodeLoanReports;

    @FXML
    private TableColumn<Loan, String> columnFinalLoanReports;

    @FXML
    private TableColumn<Loan, String> columnMonitorLoanReports;

    @FXML
    private TableColumn<Loan, String> columnStudentLoanReports;

    @FXML
    private TableView<Loan> tableLoanReports;

    @FXML
    void changeToStudentObjectReport(ActionEvent event) throws IOException{
        mfc.getLaboratory().getChangerScenes().changeToReportsView(event);
    }

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

}
