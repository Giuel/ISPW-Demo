package it.giulio.rustia.ispw.justit;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UIController2 {
    @FXML
    private Button profileButton;
    private Stage stage;
    private Parent root;
    public void openProfile(){
        profileButton.setText("Mi Hai cliccato dal secondo controller");
    }
}
