package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.utilities.PreparatorTable;
import com.example.laboratorycue.utilities.ShowInformationInputs;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;


public class StudentModalController implements Initializable {
    ModelFactoryController mfc=ModelFactoryController.getInstance();
    Student studentSelected;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        mfc.getLaboratory().getPreparatorTable().prepareTableStudentMonitor(columnNameStudentModal,columnCareerStudentModal,columnIdStudentModal,columnPhoneNumberStudentModal,columnAmountLoanStudentModal);
        tableStudentModal.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection)->{
            studentSelected=newSelection;
            mfc.getLaboratory().getShowInformationInputs().showJustStudentInformation(studentSelected,txtNameSelectedStudentModal,txtcareerSelectedStudentModal,txtphoneSelectedStudentModal,txtIdSelectedStudentModal,txtTODSelectedStudentModal);
        });
        tableStudentModal.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
    }

    @FXML
    private Button btnSelectedStudentModal;
    @FXML
    private TableColumn<Student, Integer> columnAmountLoanStudentModal;

    @FXML
    private TableColumn<Student, String> columnCareerStudentModal;

    @FXML
    private TableColumn<Student, String> columnIdStudentModal;

    @FXML
    private TableColumn<Student, String> columnNameStudentModal;

    @FXML
    private TableColumn<Student, String> columnPhoneNumberStudentModal;

    @FXML
    private TableView<Student> tableStudentModal;

    @FXML
    private Text txtIdSelectedStudentModal;

    @FXML
    private Text txtNameSelectedStudentModal;

    @FXML
    private Text txtTODSelectedStudentModal;

    @FXML
    private Text txtcareerSelectedStudentModal;

    @FXML
    private Text txtphoneSelectedStudentModal;

    @FXML
    void selectStudentModal(ActionEvent event) {
        if (studentSelected==null){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No monitor selected");
            alert.showAndWait();
        }else {
            mfc.setStudentLoanSelected(studentSelected);
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Information");
            alert.setContentText("Sucessed selection");
            alert.showAndWait();
            mfc.getLaboratory().getCloseModal().closeModalWindow(btnSelectedStudentModal);
        }
    }

}
