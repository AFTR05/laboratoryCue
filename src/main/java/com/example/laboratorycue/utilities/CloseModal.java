package com.example.laboratorycue.utilities;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class CloseModal {
    public void closeModalWindow(Button button){
        Stage stage=(Stage) button.getScene().getWindow();
        stage.close();
    }
}
