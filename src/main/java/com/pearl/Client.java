package com.pearl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Client extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Loads the UI layout from the resources folder
        FXMLLoader fxmlLoader = new FXMLLoader(Client.class.getResource("/com/pearl/client-view.fxml"));

        // Creates a scene with the loaded FXML content
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Chat Client - Pearl Corp");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Launches the JavaFX runtime
        launch();
    }
}