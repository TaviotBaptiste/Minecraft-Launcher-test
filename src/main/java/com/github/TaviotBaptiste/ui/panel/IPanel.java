package com.github.TaviotBaptiste.ui.panel;


import com.github.TaviotBaptiste.ui.PanelManager;
import javafx.scene.layout.GridPane;

public interface IPanel {
    void init (PanelManager panelManager);
    GridPane getLayout();
    void onShow();
    String getName();
}
