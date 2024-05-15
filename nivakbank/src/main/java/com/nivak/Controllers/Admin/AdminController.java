package com.nivak.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import com.nivak.Model.Model;

import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class AdminController implements Initializable{
    public BorderPane admin_parent;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case CLIENTS:
                    admin_parent.setCenter(Model.getInstance().getViewFactory().getAdminClientView());
                    break;
                case DEPOSIT:
                    admin_parent.setCenter(Model.getInstance().getViewFactory().getDepositView());
                    break;
                default:
                    admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
            }
        });
    }
}
