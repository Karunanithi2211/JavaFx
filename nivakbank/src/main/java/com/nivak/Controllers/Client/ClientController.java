package com.nivak.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import com.nivak.Model.Model;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class ClientController implements Initializable{

    @FXML
    public BorderPane client_parent;
 
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case TRANSACTIONS:
                    client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
                    break;
                case ACCOUNTS:
                    client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                    break;
                default:
                    client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
    
}
