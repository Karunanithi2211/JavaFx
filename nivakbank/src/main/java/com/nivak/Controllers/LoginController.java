package com.nivak.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.nivak.Model.Model;
import com.nivak.View.AccountType;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {
    @FXML
    private ChoiceBox<AccountType> acc_selector;

    @FXML
    private Label error_label;

    @FXML
    private Button login_button;

    @FXML
    private TextField password_field;

    @FXML
    private TextField payee_address_field;
 
    @FXML
    private Label payee_address_lable;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        acc_selector.setItems(FXCollections.observableArrayList(AccountType.CLIENT, AccountType.ADMIN));
        acc_selector.setValue(Model.getInstance().getViewFactory().getLoginAccountType());
        acc_selector.valueProperty().addListener(observable -> Model.getInstance().getViewFactory().setLoginAccountType(acc_selector.getValue()));
        login_button.setOnAction(event -> onLogin());
    }

    private void onLogin(){
        Stage stage =(Stage) error_label.getScene().getWindow();
        if (Model.getInstance().getViewFactory().getLoginAccountType() == AccountType.CLIENT) {
            // Evaluate Client Login Credentials
            Model.getInstance().evaluateClientCred(payee_address_field.getText(), password_field.getText());
            if(Model.getInstance().getClientLoginSuccessFlag()){
                Model.getInstance().getViewFactory().showClientWindow();

                // Close the login stage
                 Model.getInstance().getViewFactory().closeStage(stage);
            }
            else{
                payee_address_field.setText("");
                password_field.setText("");
                error_label.setText("No Such Login Credentials");
            }
        }
        else{
            Model.getInstance().getViewFactory().showAdminWindow();
        }
        
    }
}
