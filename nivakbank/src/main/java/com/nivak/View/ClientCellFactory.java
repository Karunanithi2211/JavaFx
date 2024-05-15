package com.nivak.View;

import com.nivak.Controllers.Admin.ClientCell;
import com.nivak.Model.Client;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

public class ClientCellFactory extends ListCell<Client> {
    @Override
    protected void updateItem(Client client, boolean empty) {
        super.updateItem(client, empty);
        if(empty){
            setText(null);
            setGraphic(null);
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/nivak/Fxml/Admin/ClientCell.fxml"));
            ClientCell controller = new ClientCell(client);
            loader.setController(controller);
            setText(null);
            try {
                setGraphic(loader.load());
            } catch (Exception e) {
                e.printStackTrace();
            } 
        }
    }
}
