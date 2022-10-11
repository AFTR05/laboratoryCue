package com.example.laboratorycue.controller;

import com.example.laboratorycue.Application;
import com.example.laboratorycue.model.Career;
import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.model.TypeDocument;
import com.example.laboratorycue.service.impl.Laboratory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MonitorViewController implements Initializable {
    private ShowInformationInputs showInformationInputs=new ShowInformationInputs();
    private DeleterInputs deleterInputs=new DeleterInputs();
    private ComboBoxAdder comboBoxAdder=new ComboBoxAdder();
    private ChangerScenesController changerScenesController=new ChangerScenesController();
    private PreparatorTable preparatorTable=new PreparatorTable();
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    Monitor monitorSelected;
    ObservableList monitorList=mfc.getLaboratory().getMonitorService().getObservablelistMonitor();
    //Inicialize =observable list process,prepare CBs--------------------------------------------------------------------------------------------------------------------------
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        preparatorTable.prepareTableStudentMonitor(columnNameMonitor,columnCareerMonitor,columnIdMonitor,columnPhoneNumberMonitor,columnAmountLoanMonitor);
//Selection------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        tableMonitor.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            monitorSelected =newSelection;
            showInformationInputs.showMonitorInformation(monitorSelected,txtNameMonitor,cbCareerMonitor,cbTypeMonitor,txtIdMonitor,txtPhoneMonitor);
        });
// configure comboBox and ObservableList-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        comboBoxAdder.addComboBoxOptionsTypeDocument(cbTypeMonitor);
        comboBoxAdder.addComboBoxOptionsCareer(cbCareerMonitor);
        tableMonitor.setItems(monitorList);
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------

    @FXML
    private Button btnUpdateMonitor;

    @FXML
    private Button btnCancelMonitor;

    @FXML
    private Button btnCreateMonitor;

    @FXML
    private Button btnDeleteMonitor;

    @FXML
    private Button btnMenuOptionLoanMonitor;

    @FXML
    private Button btnMenuOptionMonitorMonitor;

    @FXML
    private Button btnMenuOptionObjectsMonitor;

    @FXML
    private Button btnMenuOptionReportsMonitor;

    @FXML
    private Button btnMenuOptionStudentMonitor;

    @FXML
    private ComboBox<String> cbTypeMonitor;

    @FXML
    private TableColumn<Monitor, String> columnCareerMonitor;

    @FXML
    private TableColumn<Monitor, String> columnPhoneNumberMonitor;

    @FXML
    private TableColumn<Monitor,String> columnIdMonitor;

    @FXML
    private TableColumn<Monitor, String> columnNameMonitor;

    @FXML
    private TableColumn<Monitor, Integer> columnAmountLoanMonitor;

    @FXML
    private ImageView imageCueMonitor;

    @FXML
    private TableView<Monitor> tableMonitor;

    @FXML
    private ComboBox<String> cbCareerMonitor;

    @FXML
    private TextField txtPhoneMonitor;

    @FXML
    private TextField txtIdMonitor;

    @FXML
    private TextField txtNameMonitor;

    @FXML
    void createMonitor(ActionEvent event) {
        mfc.createMonitor(txtNameMonitor.getText(),txtIdMonitor.getText(),txtPhoneMonitor.getText(),cbTypeMonitor.getValue(),cbCareerMonitor.getValue());
        tableMonitor.setItems(monitorList);
        tableMonitor.refresh();
        deleterInputs.deleteInputStudent(txtNameMonitor,txtIdMonitor,txtPhoneMonitor,cbCareerMonitor,cbTypeMonitor);
    }

    @FXML
    void updateMonitor(ActionEvent event) {
        mfc.updateMonitor(txtNameMonitor.getText(),txtIdMonitor.getText(),txtPhoneMonitor.getText(),cbTypeMonitor.getValue(),cbCareerMonitor.getValue());
        tableMonitor.setItems(monitorList);
        tableMonitor.refresh();
        deleterInputs.deleteInputStudent(txtNameMonitor,txtIdMonitor,txtPhoneMonitor,cbCareerMonitor,cbTypeMonitor);
    }

    @FXML
    void cancelMonitor(ActionEvent event) {
        deleterInputs.deleteInputStudent(txtNameMonitor,txtIdMonitor,txtPhoneMonitor,cbCareerMonitor,cbTypeMonitor);
    }

    @FXML
    void deleteMonitor(ActionEvent event) {
        mfc.deleteMonitor(txtNameMonitor.getText(),txtIdMonitor.getText(),txtPhoneMonitor.getText(),cbTypeMonitor.getValue(),cbCareerMonitor.getValue());
        tableMonitor.setItems(monitorList);
        tableMonitor.refresh();
        deleterInputs.deleteInputStudent(txtNameMonitor,txtIdMonitor,txtPhoneMonitor,cbCareerMonitor,cbTypeMonitor);
    }

    @FXML
    void changeToMonitorView(ActionEvent event) throws IOException {
        changerScenesController.changeToMonitorView(event);
    }
    @FXML
    void changeToLoanView(ActionEvent event) throws IOException {
        changerScenesController.changeToLoanView(event);
    }



    @FXML
    void changeToObjectsView(ActionEvent event) throws IOException {
        changerScenesController.changeToObjectsView(event);
    }

    @FXML
    void changeToReportsView(ActionEvent event) throws IOException {
        changerScenesController.changeToReportsView(event);
    }

    @FXML
    void changeToStudentView(ActionEvent event) throws IOException {
        changerScenesController.changeToStudentView(event);
    }


}
