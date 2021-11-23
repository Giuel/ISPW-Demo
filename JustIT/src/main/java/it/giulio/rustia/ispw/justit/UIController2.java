package it.giulio.rustia.ispw.justit;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class UIController2 implements Initializable {
    @FXML
    private Button profileButton;
    private Stage stage;
    private Parent root;
    private String link ="https://www.google.it/maps/";
    public void openProfile(){
        profileButton.setText("Mi Hai cliccato dal secondo controller");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        profileButton.setVisible(false);

    }
}
