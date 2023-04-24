package com.github.taviotbaptiste.launcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(LauncherController.class.getResource("launcher-view.fxml"));
        Scene scene = new Scene(root.load(), 500, 500);

        //Add name of the launcher
        stage.setTitle("Sensta");
        //Add background
        scene.getStylesheets().add(String.valueOf(this.getClass().getResource("style.css")));
        //Min Width/Height
        stage.setMinWidth(500);
        stage.setMinHeight(500);
        //Max width/Height
        stage.setMaxWidth(500);
        stage.setMaxHeight(500);



        //For transparent background (+style.css)
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}