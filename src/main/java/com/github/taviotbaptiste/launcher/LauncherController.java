package com.github.taviotbaptiste.launcher;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LauncherController {
    @FXML
    private Label playText;
    @FXML
    private Button playButton;

    @FXML
    private Button closeButton;

    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    public void initialize() {
        username.setPromptText("email");
        password.setPromptText("Mot de passe");
        username.getParent().requestFocus();
        username.setFocusTraversable(false);
        password.getParent().requestFocus();
        password.setFocusTraversable(false);
        playButton.setBackground(null);
        closeButton.setBackground(null);
    }
    @FXML
    protected void onPlayButtonClick() {
        playText.setText("Connexion");
    }
    @FXML
    protected void onCloseButtonClick() {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }

}
