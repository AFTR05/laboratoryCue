package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.utilities.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ObjectViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    Object objectSelected;
    ObservableList listObjects=mfc.getLaboratory().getObjectService().getObservablelistObject();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getLaboratory().getPreparatorTable().prepareTableObject(columnNameObject,columnCodeObject,columnPriceObject,columnStockObject,columnAmountLoanObject,columnPositionObject,columnStatusObject);
        //Selection------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        tableObject.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            objectSelected =newSelection;
            showInformationInputs.showObjectInformation(objectSelected,txtNameObject,txtStockObject,txtPriceObject,txtCodeObject,cbPositionObject);
        });
// configure comboBox and ObservableList-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        mfc.getLaboratory().getComboBoxAdder().addComboBoxOptionsPosition(cbPositionObject);
        mfc.getLaboratory().getComboBoxAdder().addComboBoxOptionsStatus(cbStatusObject);
        tableObject.setItems(listObjects);
    }

    @FXML
    private Button btnCreateObject;

    @FXML
    private Button btnDeleteObject;

    @FXML
    private Button btnMenuOptionLoanObject;

    @FXML
    private Button btnMenuOptionMonitorObject;

    @FXML
    private Button btnMenuOptionObjectsObjects;

    @FXML
    private Button btnMenuOptionReportsObject;

    @FXML
    private Button btnMenuOptionStudentObject;

    @FXML
    private Button btnUpdateObject;

    @FXML
    private ComboBox<String> cbPositionObject;
    @FXML
    private ComboBox<String> cbStatusObject;
    @FXML
    private TableColumn<Object, String> columnStatusObject;
    @FXML
    private TableColumn<Object,Integer> columnAmountLoanObject;

    @FXML
    private TableColumn<Object,String> columnCodeObject;

    @FXML
    private TableColumn<Object,String> columnNameObject;

    @FXML
    private TableColumn<Object,String> columnPositionObject;

    @FXML
    private TableColumn<Object,Double> columnPriceObject;

    @FXML
    private TableColumn<Object,Integer> columnStockObject;

    @FXML
    private TableView<Object> tableObject;

    @FXML
    private TextField txtCodeObject;

    @FXML
    private TextField txtNameObject;

    @FXML
    private TextField txtPriceObject;

    @FXML
    private TextField txtStockObject;

    private ChangerScenesController changerScenesController=new ChangerScenesController();
    @FXML
    void changeToLoanView(ActionEvent event) throws IOException {
        changerScenesController.changeToLoanView(event);
    }

    @FXML
    void changeToMonitorView(ActionEvent event) throws IOException{
        changerScenesController.changeToMonitorView(event);
    }

    @FXML
    void changeToObjectsView(ActionEvent event) throws IOException{
        changerScenesController.changeToObjectsView(event);
    }

    @FXML
    void changeToReportsView(ActionEvent event) throws IOException{
        changerScenesController.changeToReportsView(event);
    }

    @FXML
    void changeToStudentView(ActionEvent event) throws IOException{
        changerScenesController.changeToStudentView(event);
    }

    @FXML
    void createObject(ActionEvent event) {
        mfc.createObject(txtNameObject.getText(),txtCodeObject.getText(),txtPriceObject.getText(),txtStockObject.getText(),cbPositionObject.getValue(),cbStatusObject.getValue());
        tableObject.setItems(listObjects);
        tableObject.refresh();
        deleterInputs.deleteInputObject(txtNameObject,txtCodeObject,txtPriceObject,txtStockObject,cbPositionObject,cbStatusObject);

    }

    @FXML
    void deleteObject(ActionEvent event) {
        mfc.deleteObject(txtNameObject.getText(),txtCodeObject.getText(),txtPriceObject.getText(),txtStockObject.getText(),cbPositionObject.getValue(),cbStatusObject.getValue());
        tableObject.setItems(listObjects);
        tableObject.refresh();
        deleterInputs.deleteInputObject(txtNameObject,txtCodeObject,txtPriceObject,txtStockObject,cbPositionObject,cbStatusObject);
    }

    @FXML
    void updateObject(ActionEvent event) {
        mfc.updateObject(txtNameObject.getText(),txtCodeObject.getText(),txtPriceObject.getText(),txtStockObject.getText(),cbPositionObject.getValue(),cbStatusObject.getValue(),objectSelected.getCode());
        tableObject.setItems(listObjects);
        tableObject.refresh();
        deleterInputs.deleteInputObject(txtNameObject,txtCodeObject,txtPriceObject,txtStockObject,cbPositionObject,cbStatusObject);
    }

}
