package com.github.taviotbaptiste.launcher;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LauncherController {

    //Declaration
    //Error
    @FXML
    private HBox errorbox;
    @FXML
    private Label errorMessage;

    //Button
    @FXML
    private Button playButton;
    @FXML
    private Button closeButton;

    //TextField
    @FXML
    private TextField username;
    @FXML
    private TextField password;

    @FXML
    public void initialize() {
        //PromptText
        username.setPromptText("email");
        password.setPromptText("Mot de passe");
        username.getParent().requestFocus();
        password.getParent().requestFocus();

        //textField remove automatic select at launch
        username.setFocusTraversable(false);
        password.setFocusTraversable(false);

        //Remove background for button
        playButton.setBackground(null);
        closeButton.setBackground(null);

        //ErrorBox
        errorbox.setVisible(false);
        errorMessage.setVisible(false);
    }
    @FXML
    protected void onPlayButtonClick() {
        String message;
        //Check username or pwd are empty
        if (username.getText().isEmpty() || password.getText().isEmpty())
            message = "Erreur";
        else
            message = "Connexion en cours";

        //We add the message
        errorMessage.setText(message);

        //Set visibile error box/message
        errorbox.setVisible(true);
        errorMessage.setVisible(true);

        //Visiblity time duration 3sec before visibility -> false
        PauseTransition visiblePause = new PauseTransition(Duration.seconds(3));
        visiblePause.setOnFinished(event -> errorbox.setVisible(false));
        visiblePause.setOnFinished(event -> errorMessage.setVisible(false));
        visiblePause.play();

    }
    @FXML
    protected void onCloseButtonClick() {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        // Close the stage/application
        stage.close();
    }

}
