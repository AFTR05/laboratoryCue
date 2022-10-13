package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.utilities.PreparatorTable;
import com.example.laboratorycue.utilities.ShowInformationInputs;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MonitorModalController implements Initializable {
    private ModelFactoryController mfc=ModelFactoryController.getInstance();
    private Monitor monitorSelected=mfc.getLaboratory().getSearcherObject().getMonitor("1094887554",mfc.getLaboratory().getMonitorService().getObservablelistMonitor());
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getLaboratory().getPreparatorTable().prepareTableStudentMonitor(columnNameMonitorModal,columnCareerMonitorModal,columnIdMonitorModal,columnPhoneNumberMonitorModal,columnAmountLoanMonitorModal);
        tableMonitorModal.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            monitorSelected=newSelection;
            mfc.getLaboratory().getShowInformationInputs().showJustMonitorInformation(monitorSelected,txtNameSelectedMonitorModal,txtcareerSelectedMonitorModal,txtphoneSelectedMonitorModal,txtIdSelectedMonitorModal,txtTODSelectedMonitorModal);
        });
        tableMonitorModal.setItems(mfc.getLaboratory().getMonitorService().getObservablelistMonitor());
    }

    public Monitor getMonitorSelected() {
        return monitorSelected;
    }

    @FXML
    private Button btnSelectedMonitorModal;
    @FXML
    private TableColumn<Monitor, Integer> columnAmountLoanMonitorModal;

    @FXML
    private TableColumn<Monitor, String> columnCareerMonitorModal;

    @FXML
    private TableColumn<Monitor, String> columnIdMonitorModal;

    @FXML
    private TableColumn<Monitor, String> columnNameMonitorModal;

    @FXML
    private TableColumn<Monitor, String> columnPhoneNumberMonitorModal;

    @FXML
    private TableView<Monitor> tableMonitorModal;

    @FXML
    private Text txtIdSelectedMonitorModal;

    @FXML
    private Text txtNameSelectedMonitorModal;

    @FXML
    private Text txtTODSelectedMonitorModal;

    @FXML
    private Text txtcareerSelectedMonitorModal;

    @FXML
    private Text txtphoneSelectedMonitorModal;


    @FXML
    void selectMonitorModal(ActionEvent event) {
        if (monitorSelected==null){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No monitor selected");
            alert.showAndWait();
        }else {
            mfc.setMonitorLoanSelected(monitorSelected);
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Information");
            alert.setContentText("Sucessed selection");
            alert.showAndWait();
            mfc.getLaboratory().getCloseModal().closeModalWindow(btnSelectedMonitorModal);
        }
    }

}
