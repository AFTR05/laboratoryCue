package com.example.laboratorycue;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private static ModelFactoryController mfc=ModelFactoryController.getInstance();
    private Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage=stage;
        showPrincipalWindow();
    }
    public void showPrincipalWindow(){
        try{
            mfc.getLaboratory().getMonitorService().generateProve();
            mfc.getLaboratory().getStudentService().generateProve();
            mfc.getLaboratory().getObjectService().generateProve();
            mfc.getLaboratory().getLoanService().generateProve();
            FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("views/MonitorView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}