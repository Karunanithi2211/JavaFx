package com.nivak;

import com.nivak.Model.Model;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    


    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage arg0) throws Exception {
        Model.getInstance().getViewFactory().showLoginWindow();
    }

}