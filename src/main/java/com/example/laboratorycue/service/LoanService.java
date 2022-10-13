package com.example.laboratorycue.service;

import com.example.laboratorycue.model.DetalleObject;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Student;
import javafx.collections.ObservableList;

public interface LoanService {

    void createLoan(Monitor monitorSelected, Student studentSelected, ObservableList<DetalleObject> listDetalleObjects, String endDate);

}
