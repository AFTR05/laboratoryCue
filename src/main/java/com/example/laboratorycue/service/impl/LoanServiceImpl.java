package com.example.laboratorycue.service.impl;

import com.example.laboratorycue.controller.ModelFactoryController;
import com.example.laboratorycue.model.DetalleObject;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.utilities.SearcherObject;
import com.example.laboratorycue.model.Loan;
import com.example.laboratorycue.service.LoanService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class LoanServiceImpl implements LoanService {
    private ObservableList<Loan> observablelistLoan= FXCollections.observableArrayList();
    private static ModelFactoryController mfc=ModelFactoryController.getInstance();
    //MM/dd/yyyy
    private int contador=0;




    @Override
    public void createLoan(Monitor monitorSelected, Student studentSelected, ObservableList<DetalleObject> listDetalleObjects, String endDate){
        observablelistLoan.add(new Loan(endDate,String.valueOf(contador+1),monitorSelected,studentSelected,listDetalleObjects));
        contador++;
        studentSelected.setAmountLoan(studentSelected.getAmoutLoan()+1);
        monitorSelected.setAmoutLoan(monitorSelected.getAmountLoan()+1);
        for (int x=0;x<listDetalleObjects.size();x++){
            listDetalleObjects.get(x).getObject().setStock(listDetalleObjects.get(x).getObject().getStock()-listDetalleObjects.get(x).getUnids());
        }
    }
    public ObservableList<Loan> getObservablelistLoan() {
        return observablelistLoan;
    }

    public void setObservablelistLoan(ObservableList<Loan> observablelistLoan) {
        this.observablelistLoan = observablelistLoan;
    }
}
