package com.example.laboratorycue.utilities;

import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Student;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PreparatorTable {
    public void prepareTableStudentMonitor(TableColumn tableNameColumn, TableColumn tableCareerColumn, TableColumn tableCodeColumn, TableColumn tablePhoneNumberColumn, TableColumn tableAmountLoanColumn){
        tableNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableCareerColumn.setCellValueFactory(new PropertyValueFactory<>("career"));
        tableCodeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        tablePhoneNumberColumn.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        tableAmountLoanColumn.setCellValueFactory(new PropertyValueFactory<>("amountLoan"));
    }

    public void prepareTableObject(TableColumn tableNameColumn,TableColumn tableCodeColumn,TableColumn tablePriceColumn,TableColumn tableStockColumn,TableColumn tableAmountLoanColumn,TableColumn tablePositionColumn,TableColumn tableStatusColumn){
        tableNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableCodeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        tableAmountLoanColumn.setCellValueFactory(new PropertyValueFactory<>("amountLoan"));
        tablePositionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));
        tableStockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        tablePriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        tableStatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    public void prepareTableObjectOutStatus(TableColumn tableNameColumn,TableColumn tableCodeColumn,TableColumn tablePriceColumn,TableColumn tableStockColumn,TableColumn tableAmountLoanColumn,TableColumn tablePositionColumn){
        tableNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableCodeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        tableAmountLoanColumn.setCellValueFactory(new PropertyValueFactory<>("amountLoan"));
        tablePositionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));
        tableStockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        tablePriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    }

    public void prepareTableLoan(TableColumn tableCodeColumn,TableColumn tableBeginColumn,TableColumn tableEndColumn,TableColumn tableMonitorColumn,TableColumn tableStudentColumn){
        tableCodeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        tableBeginColumn.setCellValueFactory(new PropertyValueFactory<>("BeginLoan"));
        tableEndColumn.setCellValueFactory(new PropertyValueFactory<>("EndLoan"));
        tableMonitorColumn.setCellValueFactory(new PropertyValueFactory<>("nameMonitor"));
        tableStudentColumn.setCellValueFactory(new PropertyValueFactory<>("nameStudent"));
    }

    public void prepareTableDetalleObject(TableColumn tableNameColumn,TableColumn tableCodeColumn,TableColumn tablePriceColumn,TableColumn tablePositionColumn,TableColumn tableUnidsColumn){
        tableNameColumn.setCellValueFactory(new PropertyValueFactory<>("objectName"));
        tableCodeColumn.setCellValueFactory(new PropertyValueFactory<>("objectCode"));
        tablePriceColumn.setCellValueFactory(new PropertyValueFactory<>("objectPrice"));
        tablePositionColumn.setCellValueFactory(new PropertyValueFactory<>("objectPosition"));
        tableUnidsColumn.setCellValueFactory(new PropertyValueFactory<>("unids"));
    }
}
