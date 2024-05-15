package com.nivak.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import com.nivak.Model.Transaction;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class TransactionCell implements Initializable{

    @FXML
    private Label amount_lbl;

    @FXML
    private Label date_lbl;

    @FXML
    private FontAwesomeIconView in_icon;

    @FXML
    private FontAwesomeIconView out_icon;

    @FXML
    private Label receiver_lbl;

    @FXML
    private Label sender_lbl;

    private final Transaction transaction;

    public TransactionCell(Transaction transaction){
        this.transaction = transaction;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }

}
