package com.example.laboratorycue.utilities;

import com.example.laboratorycue.Application;
import com.example.laboratorycue.controller.ModelFactoryController;
import com.example.laboratorycue.controller.MonitorModalController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;


public class ChangerScenesController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void changeToModalMonitor(ActionEvent event) throws IOException {
        root=FXMLLoader.load(Application.class.getResource("views/MonitorModal.fxml"));
        stage=new Stage();
        scene=new Scene(root);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void changeToModalStudent(ActionEvent event) throws IOException{
        root=FXMLLoader.load(Application.class.getResource("views/StudentModal.fxml"));
        stage=new Stage();
        scene=new Scene(root);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void changeToModalObject(ActionEvent event)throws IOException{
        root=FXMLLoader.load(Application.class.getResource("views/ObjectModal.fxml"));
        stage=new Stage();
        scene=new Scene(root);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void changeToMonitorView(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Application.class.getResource("views/MonitorView.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void changeToLoanView(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Application.class.getResource("views/LoanView.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void changeToObjectsView(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Application.class.getResource("views/ObjectView.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void changeToReportsView(ActionEvent event) throws IOException {
        root= FXMLLoader.load(Application.class.getResource("views/ReportView.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void changeToLoanReportView(ActionEvent event) throws IOException{
        root= FXMLLoader.load(Application.class.getResource("views/Loantableview.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void changeToStudentView(ActionEvent event) throws IOException{
        root= FXMLLoader.load(Application.class.getResource("views/StudentView.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
