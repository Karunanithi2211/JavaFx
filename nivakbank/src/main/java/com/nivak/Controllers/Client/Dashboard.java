package com.nivak.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Dashboard implements Initializable {

    @FXML
    private TextField amount_input;

    @FXML
    private Label checking_acc_number;

    @FXML
    private Label checking_balance;

    @FXML
    private Label expence_amount;

    @FXML
    private Label income_amount;

    @FXML
    private Label login_date;

    @FXML
    private TextArea message_input;

    @FXML
    private TextField payee_input;

    @FXML
    private Label saving_acc_number;

    @FXML
    private Label saving_balance;

    @FXML
    private Button send_money_btn;

    @FXML
    private ListView<?> transaction_list_view;

    @FXML
    private Text user_name;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

}
