package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.model.Loan;
import com.example.laboratorycue.service.LoanService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class LoanServiceImpl implements LoanService {
    private ObservableList<Loan> observablelistLoan= FXCollections.observableArrayList();
}
