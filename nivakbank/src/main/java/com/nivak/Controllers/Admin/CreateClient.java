package com.nivak.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CreateClient implements Initializable {

    @FXML
    private CheckBox add_checing_acc;

    @FXML
    private CheckBox add_saving_acc;

    @FXML
    private TextField checking_acc_bal;

    @FXML
    private Label error_lbl;

    @FXML
    private TextField fname_field;

    @FXML
    private TextField lastname_field;

    @FXML
    private Button new_client_btn;

    @FXML
    private TextField password_field;

    @FXML
    private CheckBox payee_address_box;

    @FXML
    private Label payee_address_lbl;

    @FXML
    private TextField saving_acc_bal;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
            
    }

}
