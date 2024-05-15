package com.nivak.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import com.nivak.Model.Model;
import com.nivak.View.ClientMenuOptions;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ClientMenuController implements Initializable {
    @FXML 
    private Button accountsbtn;

    @FXML
    private Button dashboardbtn;

    @FXML
    private Button logoutbtn;

    @FXML
    private Button profilebtn;

    @FXML
    private Button reportbtn;

    @FXML
    private Button transactionbtn;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
         addListener();
    }

    private void addListener() {
        dashboardbtn.setOnAction(event -> onDashboard());
        transactionbtn.setOnAction(event -> onTransaction());
        accountsbtn.setOnAction(event -> onAccounts());
    }

    private void onAccounts() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOptions.ACCOUNTS);
    }

    private void onTransaction() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOptions.TRANSACTIONS);
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOptions.DASHBOARD);
    }

}
