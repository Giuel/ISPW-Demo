package it.giulio.rustia.ispw.justit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;
public class UIController {
    private Stage stage;
    private Parent root;
    @FXML
   private Button bottoneAccesso;
    @FXML
   private Hyperlink signUpLink;
    @FXML
    private PasswordField firstPassInsert, secondPassInsert;

    public void showLoginPage(ActionEvent actionEvent) throws IOException {
        root=FXMLLoader.load(getClass().getResource("justITLoginPage.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene loginPage = new Scene(root);
        stage.setResizable(false);
        stage.setTitle("Just It Login");
        stage.setScene(loginPage);
        stage.show();
    }

    public void showSignupPage(ActionEvent actionEvent) throws IOException {
        root=FXMLLoader.load(getClass().getResource("justITSignUpPage.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene signUpPage=new Scene(root);
        stage.setResizable(false);
        stage.setTitle("Just IT Signup");
        stage.setScene(signUpPage);
        stage.show();
    }

    public void login(ActionEvent actionEvent) throws IOException {
        ///to complete login, dummy method for testing
        root=FXMLLoader.load(getClass().getResource("justITHomePageTemplate.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Scene templateHome=new Scene(root);
        stage.setTitle("Just IT HomePage");
        stage.setScene(templateHome);
        stage.show();
    }

    public void showWelcomePage(ActionEvent actionEvent) throws IOException{
            root=FXMLLoader.load(getClass().getResource("justITWelcomePage.fxml"));
            stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            Scene welcomePage = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("Just It Login");
            stage.setScene(welcomePage);
            stage.show();
    }

    public void signup(ActionEvent actionEvent){
        ///TODO
    }
}