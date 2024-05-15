package com.nivak.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import com.nivak.Model.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClientCell implements Initializable {

    @FXML
    private Label ch_acc_lbl;

    @FXML
    private Label date_lbl;

    @FXML
    private Button delete_btn;

    @FXML
    private Label fname_lbl;

    @FXML
    private Label lname_lbl;

    @FXML
    private Label pAddress_lbl;

    @FXML
    private Label sa_acc_lbl;


    private final Client client;

    public ClientCell(Client client) {
        this.client = client;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

}
