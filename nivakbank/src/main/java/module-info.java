module com.nivak {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.nivak.Controllers to javafx.fxml;
    opens com.nivak.Controllers.Client to javafx.fxml;
    opens com.nivak.Controllers.Admin to javafx.fxml;
    exports com.nivak;
    exports com.nivak.Controllers;
    exports com.nivak.Controllers.Admin;
    exports com.nivak.Controllers.Client;
    exports com.nivak.View;
    exports com.nivak.Model;
}
