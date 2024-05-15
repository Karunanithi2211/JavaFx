module com.nivak {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.nivak to javafx.fxml;
    exports com.nivak;
}
