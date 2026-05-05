package com.pearl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Server extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // This look at the very root of the compiled resources
        var resource = getClass().getResource("/com/pearl/server-view.fxml");
        if (resource == null) {
            throw new RuntimeException("Could not find server-view.fxml. Check your target folder!");
        }
        FXMLLoader fxmlLoader = new FXMLLoader(resource);
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Chat Server - Pearl Corp");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // Launches the JavaFX runtime
        launch();
    }
}