module com.nivak {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nivak to javafx.fxml;
    exports com.nivak;
}
