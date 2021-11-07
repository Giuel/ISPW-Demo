package it.giulio.rustia.ispw.justit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
   private Button bottoneAccesso;
    @FXML
   private Hyperlink signUpLink;

    public void showLoginPage(ActionEvent actionEvent) throws IOException {
        Parent
        Stage stage= new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("justITLoginPage.fxml"));
        Scene loginPage= new Scene(fxmlLoader.load());
        stage.setResizable(false);
        stage.setTitle("Just It Login");
        stage.setScene(loginPage);
        stage.show();
    }

    public void showSignupPage(ActionEvent actionEvent) {
    }

    public void login(ActionEvent actionEvent) {
    }

    public void showWelcomePage(ActionEvent actionEvent) {
    }
}