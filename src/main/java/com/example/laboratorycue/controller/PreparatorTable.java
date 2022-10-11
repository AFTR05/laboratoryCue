package com.example.laboratorycue.controller;

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

    public void prepareTableObject(TableColumn tableNameColumn,TableColumn tableCodeColumn,TableColumn tablePriceColumn,TableColumn tableStockColumn,TableColumn tableAmountLoanColumn,TableColumn tablePositionColumn){
        tableNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        tableCodeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        tableAmountLoanColumn.setCellValueFactory(new PropertyValueFactory<>("amountLoan"));
        tablePositionColumn.setCellValueFactory(new PropertyValueFactory<>("position"));
        tableStockColumn.setCellValueFactory(new PropertyValueFactory<>("stock"));
        tablePriceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
    }
}
