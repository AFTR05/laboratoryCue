package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.controller.ModelFactoryController;
import com.example.laboratorycue.controller.SearcherObject;
import com.example.laboratorycue.model.DetalleObject;
import com.example.laboratorycue.model.Loan;
import com.example.laboratorycue.service.LoanService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class LoanServiceImpl implements LoanService {
    private ObservableList<Loan> observablelistLoan= FXCollections.observableArrayList();

    private static ModelFactoryController mfc=ModelFactoryController.getInstance();
    SearcherObject searcherObject=new SearcherObject();
    //MM/dd/yyyy

    @Override
    public void generateProve() {
        observablelistLoan.add(new Loan("11/11/2022","123",null,null,null,0));
    }

    public ObservableList<Loan> getObservablelistLoan() {
        return observablelistLoan;
    }

    public void setObservablelistLoan(ObservableList<Loan> observablelistLoan) {
        this.observablelistLoan = observablelistLoan;
    }
}
