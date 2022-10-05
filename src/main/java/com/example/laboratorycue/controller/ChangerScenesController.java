package com.example.laboratorycue.controller;

import com.example.laboratorycue.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class ChangerScenesController {
    private Stage stage;
    private Scene scene;
    private Parent root;

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

    public void changeToStudentView(ActionEvent event) throws IOException{
        root= FXMLLoader.load(Application.class.getResource("views/StudentView.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
