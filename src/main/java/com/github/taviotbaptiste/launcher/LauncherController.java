package com.github.taviotbaptiste.launcher;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LauncherController {
    @FXML
    private Label playText;

    @FXML
    protected void onPlayButtonClick() {
        playText.setText("Jouer");
    }
}
