module com.example.laboratorycue {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.laboratorycue to javafx.fxml;
    exports com.example.laboratorycue;
    exports com.example.laboratorycue.controller;
    opens com.example.laboratorycue.controller to javafx.fxml;
}