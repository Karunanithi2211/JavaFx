package com.nivak;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;
import javafx.util.Duration;

public class FxmlDocumentController implements Initializable {
    @FXML
    private MediaView mediaView;
    @FXML
    private Slider volumeSlider;
    @FXML
    private Slider seekSlider;

    private MediaPlayer mediaPlayer;
    private String filePath;

    @FXML
    void handleAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Select a file (*.mp4)", "*.mp4");

        fileChooser.getExtensionFilters().add(filter);
        File file = fileChooser.showOpenDialog(null);
        filePath = file.toURI().toString();

        if (filePath != null) {
            Media media = new Media(filePath);
            mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);

            DoubleProperty width = mediaView.fitWidthProperty();
            DoubleProperty height = mediaView.fitHeightProperty();
            System.out.println(width.toString());
            System.out.println(height.toString());
            width.bind(Bindings.selectDouble(mediaView.sceneProperty(), "width"));
            height.bind(Bindings.selectDouble(mediaView.sceneProperty(), "height"));

            volumeSlider.setValue(mediaPlayer.getVolume()*100);
            volumeSlider.valueProperty().addListener(new InvalidationListener() {

                @Override
                public void invalidated(Observable arg0) {
                    mediaPlayer.setVolume(volumeSlider.getValue()/100);
                }
                
            });
            System.out.println(mediaPlayer.getVolume()*100);

            mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {
                @Override
                public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
                    seekSlider.setValue(newValue.toSeconds());
                }
            });
            
            seekSlider.setOnMouseClicked(new EventHandler<MouseEvent>() {

                @Override
                public void handle(MouseEvent event) {
                    mediaPlayer.seek(Duration.seconds(seekSlider.getValue()));
                    
                }
                
            });
            
            mediaPlayer.play();
        }



    }

    @FXML
    void playVideo(ActionEvent event){
        mediaPlayer.play();
        mediaPlayer.setRate(1);
    }
    @FXML
    void pauseVideo(ActionEvent event){
        mediaPlayer.pause();
    }
    @FXML
    void stopVideo(ActionEvent event){
        mediaPlayer.stop();
    }

    @FXML
    void fastVideo(ActionEvent event){
        mediaPlayer.setRate(1.5);
    }
    @FXML
    void fasterVideo(ActionEvent event){
        mediaPlayer.setRate(2);
    }
    @FXML
    void slowVideo(ActionEvent event){
        mediaPlayer.setRate(.75);
    }
    @FXML
    void slowerVideo(ActionEvent event){
        mediaPlayer.setRate(.5);
    }

    @FXML
    void exitVideo(ActionEvent event){
        System.exit(0);
    }
    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'initialize'");
    }
    
}
