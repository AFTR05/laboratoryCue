package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.utilities.*;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MonitorViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    Monitor monitorSelected;
    ObservableList monitorList=mfc.getLaboratory().getMonitorService().getObservablelistMonitor();
    //Inicialize =observable list process,prepare CBs--------------------------------------------------------------------------------------------------------------------------
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getLaboratory().getPreparatorTable().prepareTableStudentMonitor(columnNameMonitor,columnCareerMonitor,columnIdMonitor,columnPhoneNumberMonitor,columnAmountLoanMonitor);
//Selection------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        tableMonitor.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            monitorSelected =newSelection;
            mfc.getLaboratory().getShowInformationInputs().showMonitorInformation(monitorSelected,txtNameMonitor,cbTypeMonitor,cbCareerMonitor,txtPhoneMonitor,txtIdMonitor);
        });
// configure comboBox and ObservableList-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        mfc.getLaboratory().getComboBoxAdder().addComboBoxOptionsTypeDocument(cbTypeMonitor);
        mfc.getLaboratory().getComboBoxAdder().addComboBoxOptionsCareer(cbCareerMonitor);
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
        if (mfc.getLaboratory().getValidator().validateMonitorStudent(txtNameMonitor.getText(),txtIdMonitor.getText(),txtPhoneMonitor.getText(),cbTypeMonitor.getValue(),cbCareerMonitor.getValue())){
            mfc.createMonitor(txtNameMonitor.getText(),txtIdMonitor.getText(),txtPhoneMonitor.getText(),cbTypeMonitor.getValue(),cbCareerMonitor.getValue());
        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Lack of information, some selections are missing");
            alert.showAndWait();
        }

        tableMonitor.setItems(monitorList);
        tableMonitor.refresh();
        mfc.getLaboratory().getDeleterInputs().deleteInputStudent(txtNameMonitor,txtIdMonitor,txtPhoneMonitor,cbCareerMonitor,cbTypeMonitor);
    }

    @FXML
    void updateMonitor(ActionEvent event) {
        mfc.updateMonitor(txtNameMonitor.getText(),txtIdMonitor.getText(),txtPhoneMonitor.getText(),cbTypeMonitor.getValue(),cbCareerMonitor.getValue(),monitorSelected.getCode());
        tableMonitor.setItems(monitorList);
        tableMonitor.refresh();
        mfc.getLaboratory().getDeleterInputs().deleteInputStudent(txtNameMonitor,txtIdMonitor,txtPhoneMonitor,cbCareerMonitor,cbTypeMonitor);
    }

    @FXML
    void cancelMonitor(ActionEvent event) {
        mfc.getLaboratory().getDeleterInputs().deleteInputStudent(txtNameMonitor,txtIdMonitor,txtPhoneMonitor,cbCareerMonitor,cbTypeMonitor);
    }

    @FXML
    void deleteMonitor(ActionEvent event) {
        mfc.deleteMonitor(txtNameMonitor.getText(),txtIdMonitor.getText(),txtPhoneMonitor.getText(),cbTypeMonitor.getValue(),cbCareerMonitor.getValue());
        tableMonitor.setItems(monitorList);
        tableMonitor.refresh();
        mfc.getLaboratory().getDeleterInputs().deleteInputStudent(txtNameMonitor,txtIdMonitor,txtPhoneMonitor,cbCareerMonitor,cbTypeMonitor);
    }

    @FXML
    void changeToMonitorView(ActionEvent event) throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToMonitorView(event);
    }
    @FXML
    void changeToLoanView(ActionEvent event) throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToLoanView(event);
    }



    @FXML
    void changeToObjectsView(ActionEvent event) throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToObjectsView(event);
    }

    @FXML
    void changeToReportsView(ActionEvent event) throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToReportsView(event);
    }

    @FXML
    void changeToStudentView(ActionEvent event) throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToStudentView(event);
    }


}
