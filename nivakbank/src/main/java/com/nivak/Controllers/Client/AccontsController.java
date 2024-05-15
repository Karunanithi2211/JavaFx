package com.nivak.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AccontsController implements Initializable{

    @FXML
    private Label checking_acc_number;

    @FXML
    private Label checking_balance;

    @FXML
    private Label checking_created_data;

    @FXML
    private TextField funds_to_checking;

    @FXML
    private TextField funds_to_saving;

    @FXML
    private Label saving_account_number;

    @FXML
    private Label saving_balance;

    @FXML
    private Label saving_date_created;

    @FXML
    private Label transaction_limit;

    @FXML
    private Button transfer_to_checking;

    @FXML
    private Button transfer_to_saving;

    @FXML
    private Label withdrawal_limit;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

}
