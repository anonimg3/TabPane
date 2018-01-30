package sample;

import com.jfoenix.controls.JFXTabPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{
    @FXML
    JFXTabPane tp;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void switchTabBtn_Clicked() {
        SingleSelectionModel<Tab> selectionModel = tp.getSelectionModel();
        if(selectionModel.getSelectedIndex() != 2) selectionModel.selectNext();
        else selectionModel.selectFirst();
    }
}
