package com.github.taviotbaptiste.launcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.Console;
import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LauncherController.class.getResource("launcher-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 580);

        //Add name of the launcher
        stage.setTitle("Sensta");
        //Add background
        scene.getStylesheets().add(String.valueOf(this.getClass().getResource("style.css")));
        //Min Width/Height
        stage.setMinWidth(720);
        stage.setMinHeight(580);
        //Max width/Height
        stage.setMaxWidth(800);
        stage.setMaxHeight(650);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        System.out.println();
    }
}