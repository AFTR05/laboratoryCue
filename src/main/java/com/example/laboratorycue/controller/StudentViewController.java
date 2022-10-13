package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.utilities.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    Student studentSelected;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getLaboratory().getPreparatorTable().prepareTableStudentMonitor(columnNameStudent,columnCareerStudent,columnIdStudent,columnPhoneNumberStudent,columnAmountLoanStudent);
        //Selection------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        tableStudent.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            studentSelected =newSelection;
            mfc.getLaboratory().getShowInformationInputs().showStudentInformation(studentSelected,txtNameStudent,cbCareerStudent,cbTypeStudent,txtPhoneNumberStudent,txtIdStudent);
        });
        mfc.getLaboratory().getComboBoxAdder().addComboBoxOptionsCareer(cbCareerStudent);
        mfc.getLaboratory().getComboBoxAdder().addComboBoxOptionsTypeDocument(cbTypeStudent);
        tableStudent.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
    }

    @FXML
    private Button btnUpdateStudent;

    @FXML
    private Button btnCancelStudent;

    @FXML
    private Button btnCreateStudent;

    @FXML
    private Button btnDeleteStudent;

    @FXML
    private Button btnMenuOptionLoanStudent;

    @FXML
    private Button btnMenuOptionMonitorStudent;

    @FXML
    private Button btnMenuOptionObjectsStudent;

    @FXML
    private Button btnMenuOptionReportsStudent;

    @FXML
    private Button btnMenuOptionStudentStudent;

    @FXML
    private ComboBox<String> cbTypeStudent;

    @FXML
    private ComboBox<String> cbCareerStudent;

    @FXML
    private TableColumn<Student,Integer> columnCareerStudent;

    @FXML
    private TableColumn<Student,Integer> columnPhoneNumberStudent;

    @FXML
    private TableColumn<Student,Integer> columnIdStudent;

    @FXML
    private TableColumn<Student,Integer> columnNameStudent;

    @FXML
    private TableColumn<Student,Integer> columnAmountLoanStudent;

    @FXML
    private TableView<Student> tableStudent;

    @FXML
    private TextField txtPhoneNumberStudent;

    @FXML
    private TextField txtIdStudent;

    @FXML
    private TextField txtNameStudent;

    @FXML
    void cancelStudent(ActionEvent event) {
        mfc.getLaboratory().getDeleterInputs().deleteInputStudent(txtNameStudent,txtPhoneNumberStudent,txtIdStudent,cbCareerStudent,cbTypeStudent);
    }

    @FXML
    void updateStudent(ActionEvent event) {
        mfc.updateStudent(txtNameStudent.getText(),txtIdStudent.getText(),txtPhoneNumberStudent.getText(),cbTypeStudent.getValue(),cbCareerStudent.getValue(),studentSelected.getCode());
        tableStudent.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
        tableStudent.refresh();
        mfc.getLaboratory().getDeleterInputs().deleteInputStudent(txtNameStudent,txtPhoneNumberStudent,txtIdStudent,cbCareerStudent,cbTypeStudent);
    }

    @FXML
    void createStudent(ActionEvent event) {
        if (mfc.getLaboratory().getValidator().validateMonitorStudent(txtNameStudent.getText(),txtIdStudent.getText(),txtPhoneNumberStudent.getText(),cbTypeStudent.getValue(),cbCareerStudent.getValue())){
            mfc.createStudent(txtNameStudent.getText(),txtIdStudent.getText(),txtPhoneNumberStudent.getText(),cbTypeStudent.getValue(),cbCareerStudent.getValue());
        }else {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Some information is missing");
            alert.showAndWait();
        }
        tableStudent.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
        tableStudent.refresh();
        mfc.getLaboratory().getDeleterInputs().deleteInputStudent(txtNameStudent,txtPhoneNumberStudent,txtIdStudent,cbCareerStudent,cbTypeStudent);
    }

    @FXML
    void deleteStudent(ActionEvent event) {
        mfc.deleteStudent(txtNameStudent.getText(),txtIdStudent.getText(),txtPhoneNumberStudent.getText(),cbTypeStudent.getValue(),cbCareerStudent.getValue());
        tableStudent.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
        tableStudent.refresh();
        mfc.getLaboratory().getDeleterInputs().deleteInputStudent(txtNameStudent,txtPhoneNumberStudent,txtIdStudent,cbCareerStudent,cbTypeStudent);
    }
    @FXML
    void changeToLoanView(ActionEvent event) throws IOException {
        mfc.getLaboratory().getChangerScenes().changeToLoanView(event);
    }

    @FXML
    void changeToMonitorView(ActionEvent event) throws IOException{
        mfc.getLaboratory().getChangerScenes().changeToMonitorView(event);
    }

    @FXML
    void changeToObjectsView(ActionEvent event) throws IOException{
        mfc.getLaboratory().getChangerScenes().changeToObjectsView(event);
    }

    @FXML
    void changeToReportsView(ActionEvent event) throws IOException{
        mfc.getLaboratory().getChangerScenes().changeToReportsView(event);
    }

    @FXML
    void changeToStudentView(ActionEvent event) throws IOException{
        mfc.getLaboratory().getChangerScenes().changeToStudentView(event);
    }


}
