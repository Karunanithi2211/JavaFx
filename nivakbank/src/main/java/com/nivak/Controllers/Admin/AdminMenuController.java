package com.nivak.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import com.nivak.Model.Model;
import com.nivak.View.AdminMenuOptions;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class AdminMenuController implements Initializable {

    @FXML
    private Button client_list_btn;

    @FXML
    private Button create_client_btn;

    @FXML
    private Button deposite_btn;

    @FXML
    private Button logout_btn;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        addListeners();
    }

    private void addListeners(){
        create_client_btn.setOnAction(event -> onCreateClient());
        client_list_btn.setOnAction(event -> onClientList());
        deposite_btn.setOnAction(event -> onDeposite());
    }

    private void onCreateClient(){
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CREATE_CLIENT);
    }

    private void onClientList(){
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CLIENTS);
    }

    private void onDeposite(){
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.DEPOSIT);
    }





}
