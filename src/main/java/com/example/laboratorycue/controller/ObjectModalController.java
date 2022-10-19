package com.example.laboratorycue.controller;

import com.example.laboratorycue.model.DetalleObject;
import com.example.laboratorycue.model.Object;
import com.example.laboratorycue.model.Student;
import com.example.laboratorycue.utilities.PreparatorTable;
import com.example.laboratorycue.utilities.PrepareListObject;
import com.example.laboratorycue.utilities.ShowInformationInputs;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ObjectModalController implements Initializable {
    private final ModelFactoryController mfc=ModelFactoryController.getInstance();
    private Object objectSelected;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mfc.getLaboratory().getPreparatorTable().prepareTableObjectOutStatus(columnNameObjectModal,columnCodeObjectModal,columnPriceObjectModal,columnStockObjectModal,columnAmountLoanObjectModal,columnPositionObjectModal);
        tableObjectModal.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            objectSelected = newSelection;
            mfc.getLaboratory().getShowInformationInputs().showJustObjectInformation(objectSelected,txtNameSelectedObjectModal,txtStockSelectedObjectModal,txtPriceSelectedObjectModal,txtCodeSelectedObjectModal,txtPositionSelectedObjectModal);
        });
        tableObjectModal.setItems(mfc.getLaboratory().getPrepareListObject().prepareListObjectOutStatus(mfc.getLaboratory().getObjectService().getObservablelistObject()));
    }

    @FXML
    private Text txtCodeSelectedObjectModal;

    @FXML
    private Text txtNameSelectedObjectModal;

    @FXML
    private Text txtPositionSelectedObjectModal;

    @FXML
    private Text txtPriceSelectedObjectModal;

    @FXML
    private Text txtStockSelectedObjectModal;

    @FXML
    private Button btnSelectedObjectModal;
    @FXML
    private TableColumn<Object, Integer> columnAmountLoanObjectModal;

    @FXML
    private TableColumn<Object, String> columnCodeObjectModal;

    @FXML
    private TableColumn<Object, String> columnNameObjectModal;

    @FXML
    private TableColumn<Object, String> columnPositionObjectModal;

    @FXML
    private TableColumn<Object, Double> columnPriceObjectModal;

    @FXML
    private TableColumn<Object, Integer> columnStockObjectModal;

    @FXML
    private TableView<Object> tableObjectModal;

    @FXML
    private TextField txtUnidObjectModal;

    @FXML
    void selectDetailObject(ActionEvent event) {
        if (objectSelected==null){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("No object selected");
            alert.showAndWait();
        }else {
            DetalleObject detalleObject=mfc.getLaboratory().getSearcherObject().getObjectObject(objectSelected,mfc.getObjectObservableList());
            if (mfc.getLaboratory().getValidator().validateObjectLoan(detalleObject,txtUnidObjectModal.getText())){
                mfc.getObjectObservableList().add(new DetalleObject(objectSelected,Integer.parseInt(txtUnidObjectModal.getText())));
            }
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Information");
            alert.setContentText("Sucessed selection");
            alert.showAndWait();
            mfc.getLaboratory().getCloseModal().closeModalWindow(btnSelectedObjectModal);
        }
    }

}
