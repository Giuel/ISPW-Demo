package it.giulio.rustia.ispw.justit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class JustITApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("justITWelcomePage.fxml"));
        Scene welcomePage1 = new Scene(root);
        stage.setTitle("Just-I.T.");
        stage.setResizable(false);
        stage.setScene(welcomePage1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}