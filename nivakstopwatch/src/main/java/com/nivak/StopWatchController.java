package com.nivak;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class StopWatchController implements Initializable {

    @FXML
    private Label hourlable;

    @FXML
    private Label minutelabel;

    @FXML
    private Button pausebtn;

    @FXML
    private Label secondlabel;

    @FXML
    private Button startbtn;

    @FXML
    private Button stopbtn;

    private Timeline timeline;
    private int seconds = 0;
    private int minutes = 0;
    private int hour = 0;


    @FXML
    void pausebtnaction(ActionEvent event) {
        timeline.pause();
    }

    @FXML
    void startbtnaction(ActionEvent event) {
        timeline.play();
    }

    @FXML
    void stopbtnaction(ActionEvent event) {
        timeline.stop();
        seconds = 0;
        minutes = 0;
        hour = 0;
        updateLabel();
    }

    private void updateLabel(){
        secondlabel.setText(String.format("%02d",seconds));
        minutelabel.setText(String.format("%02d",minutes));
        hourlable.setText(String.format("%02d",hour));
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            seconds++;
            if(seconds == 60){
                seconds = 0;
                minutes++;
            }
            if(minutes == 60){
                minutes = 0;
                hour++;
            }
            updateLabel();
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
    }

}
