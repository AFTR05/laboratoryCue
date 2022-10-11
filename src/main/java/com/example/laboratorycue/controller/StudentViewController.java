package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.Monitor;
import com.example.laboratorycue.model.Student;
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

public class StudentViewController implements Initializable {
    ModelFactoryController mfc= ModelFactoryController.getInstance();
    Student studentSelected;
    private ChangerScenesController changerScenesController=new ChangerScenesController();
    private PreparatorTable preparatorTable=new PreparatorTable();
    private DeleterInputs deleterInputs=new DeleterInputs();
    private ComboBoxAdder comboBoxAdder=new ComboBoxAdder();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        preparatorTable.prepareTableStudentMonitor(columnNameStudent,columnCareerStudent,columnIdStudent,columnPhoneNumberStudent,columnAmountLoanStudent);
        //Selection------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        tableStudent.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            studentSelected =newSelection;
            showMonitorInformation(studentSelected);
        });
        comboBoxAdder.addComboBoxOptionsCareer(cbCareerStudent);
        comboBoxAdder.addComboBoxOptionsTypeDocument(cbTypeStudent);
        tableStudent.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
    }

    private void showMonitorInformation(Student studentSelected){
        if(studentSelected != null){
            txtNameStudent.setText(studentSelected.getName());
            cbTypeStudent.setValue(studentSelected.getTypeDocument());
            cbCareerStudent.setValue(studentSelected.getCareer());
            txtPhoneNumberStudent.setText(studentSelected.getPhoneNumber());
            txtIdStudent.setText(studentSelected.getCode());
        }
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
        deleterInputs.deleteInputStudent(txtNameStudent,txtPhoneNumberStudent,txtIdStudent,cbCareerStudent,cbTypeStudent);
    }

    @FXML
    void updateStudent(ActionEvent event) {
        mfc.updateStudent(txtNameStudent.getText(),txtIdStudent.getText(),txtPhoneNumberStudent.getText(),cbTypeStudent.getValue(),cbCareerStudent.getValue());
        tableStudent.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
        tableStudent.refresh();
        deleterInputs.deleteInputStudent(txtNameStudent,txtPhoneNumberStudent,txtIdStudent,cbCareerStudent,cbTypeStudent);
    }

    @FXML
    void createStudent(ActionEvent event) {
        mfc.createStudent(txtNameStudent.getText(),txtIdStudent.getText(),txtPhoneNumberStudent.getText(),cbTypeStudent.getValue(),cbCareerStudent.getValue());
        tableStudent.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
        tableStudent.refresh();
        deleterInputs.deleteInputStudent(txtNameStudent,txtPhoneNumberStudent,txtIdStudent,cbCareerStudent,cbTypeStudent);
    }

    @FXML
    void deleteStudent(ActionEvent event) {
        mfc.deleteStudent(txtNameStudent.getText(),txtIdStudent.getText(),txtPhoneNumberStudent.getText(),cbTypeStudent.getValue(),cbCareerStudent.getValue());
        tableStudent.setItems(mfc.getLaboratory().getStudentService().getObservablelistStudent());
        tableStudent.refresh();
        deleterInputs.deleteInputStudent(txtNameStudent,txtPhoneNumberStudent,txtIdStudent,cbCareerStudent,cbTypeStudent);
    }
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


}
