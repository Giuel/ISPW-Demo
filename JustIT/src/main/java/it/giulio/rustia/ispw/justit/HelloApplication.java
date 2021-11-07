package it.giulio.rustia.ispw.justit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("justITWelcomePage.fxml"));
        Scene welcomePage1 = new Scene(fxmlLoader.load());
        stage.setTitle("Just-I.T.");
        stage.setResizable(false);
        stage.setScene(welcomePage1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}