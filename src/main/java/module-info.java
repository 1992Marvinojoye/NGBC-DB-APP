module ncbg {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens ncbg.app to javafx.fxml;
    exports ncbg.app;
}