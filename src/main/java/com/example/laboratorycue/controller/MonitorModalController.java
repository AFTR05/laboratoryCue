package com.example.laboratorycue.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class MonitorModalController {

    @FXML
    private TableColumn<?, ?> columnAmountLoanMonitorLoan;

    @FXML
    private TableColumn<?, ?> columnCareerMonitorModal;

    @FXML
    private TableColumn<?, ?> columnIdMonitorLoan;

    @FXML
    private TableColumn<?, ?> columnNameMonitorModal;

    @FXML
    private TableColumn<?, ?> columnPhoneNumberMonitorModal;

    @FXML
    private TableView<?> tableMonitorModal;

    @FXML
    private Text txtSelectedMonitorModal;

    @FXML
    void pinMonitorSelected(ActionEvent event) {

    }

}
