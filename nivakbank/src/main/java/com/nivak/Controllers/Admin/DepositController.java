package com.nivak.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class DepositController implements Initializable{

    @FXML
    private TextField amount_fld;

    @FXML
    private Button deposit_btn;

    @FXML
    private TextField payeeadd_fld;

    @FXML
    private ListView<?> result_listview;

    @FXML
    private Button search_btn;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

}
