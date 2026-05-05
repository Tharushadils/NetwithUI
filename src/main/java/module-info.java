module com.pearl {
    requires javafx.controls;
    requires javafx.fxml;

    // Opens the package so the FXML loader can see your controllers
    opens com.pearl to javafx.fxml;

    exports com.pearl;
}