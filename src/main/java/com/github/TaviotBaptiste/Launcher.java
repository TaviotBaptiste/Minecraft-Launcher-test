package com.github.TaviotBaptiste;

import com.github.TaviotBaptiste.ui.PanelManager;
import com.github.TaviotBaptiste.utils.Helpers;
import fr.flowarg.flowlogger.ILogger;
import fr.flowarg.flowlogger.Logger;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;
import java.nio.file.Path;

public class Launcher extends Application {

    private PanelManager panelManager;
    private static Launcher instance;
    //private final ILogger logger;
    //private final Path launcherDir = GameDirGenerator.createGameDir("launcher-fx", true);
    //private final Path launcherDir = Helpers.generateGamePath("FuFx");

    public Launcher() {
        //instance = this;
        //this.logger = new Logger("[LauncherFX]", this.launcherDir.resolve("launcher.log"));
        //if (!this.launcherDir.toFile().exists()) {
        //    if (!this.launcherDir.toFile().mkdir()) {
        //this.logger.err("Unable to create launcher folder");
         //   }
        //}
    }
    @Override
    public void start(Stage stage) throws Exception {
        //this.logger.info("Starting launcher");
        this.panelManager = new PanelManager(this, stage);
        this.panelManager.init();
    }

    //public ILogger getLogger(){
    //     return logger;
    //}

    //public static Launcher getInstance() {
        //return instance;
    //}
}
