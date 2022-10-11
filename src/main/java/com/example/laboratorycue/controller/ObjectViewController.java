package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Object;
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
    DeleterInputs deleterInputs=new DeleterInputs();
    ShowInformationInputs showInformationInputs=new ShowInformationInputs();
    ComboBoxAdder comboBoxAdder=new ComboBoxAdder();
    Object objectSelected;
    PreparatorTable preparatorTable=new PreparatorTable();
    ObservableList listObjects=mfc.getLaboratory().getObjectService().getObservablelistObject();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        preparatorTable.prepareTableObject(columnNameObject,columnCodeObject,columnPriceObject,columnStockObject,columnAmountLoanObject,columnPositionObject);
        //Selection------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        tableObject.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            objectSelected =newSelection;
            showInformationInputs.showObjectInformation(objectSelected,txtNameObject,txtStockObject,txtPriceObject,txtCodeObject,cbPositionObject);
        });
// configure comboBox and ObservableList-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        comboBoxAdder.addComboBoxOptionsPosition(cbPositionObject);
        tableObject.setItems(listObjects);
    }

    @FXML
    private Button btnBlockObject;

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

    @FXML
    void blockObject(ActionEvent event) {

    }

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
        mfc.createObject(txtNameObject.getText(),txtCodeObject.getText(),txtPriceObject.getText(),txtStockObject.getText(),cbPositionObject.getValue());
        tableObject.setItems(listObjects);
        tableObject.refresh();
        deleterInputs.deleteInputObject(txtNameObject,txtCodeObject,txtPriceObject,txtStockObject,cbPositionObject);

    }

    @FXML
    void deleteObject(ActionEvent event) {
        mfc.deleteObject(txtNameObject.getText(),txtCodeObject.getText(),txtPriceObject.getText(),txtStockObject.getText(),cbPositionObject.getValue());
        tableObject.setItems(listObjects);
        tableObject.refresh();
        deleterInputs.deleteInputObject(txtNameObject,txtCodeObject,txtPriceObject,txtStockObject,cbPositionObject);
    }

    @FXML
    void updateObject(ActionEvent event) {
        mfc.updateObject(txtNameObject.getText(),txtCodeObject.getText(),txtPriceObject.getText(),txtStockObject.getText(),cbPositionObject.getValue());
        tableObject.setItems(listObjects);
        tableObject.refresh();
        deleterInputs.deleteInputObject(txtNameObject,txtCodeObject,txtPriceObject,txtStockObject,cbPositionObject);
    }

}
