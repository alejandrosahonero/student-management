package dev.alejandrosahonero.logic.welcome;

import dev.alejandrosahonero.gui.welcome.SettingsView;
import dev.alejandrosahonero.gui.welcome.StartView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsButtonController implements ActionListener {
    private StartView startView;
    public SettingsButtonController(StartView startView) {
        this.startView = startView;
    }
    public void actionPerformed(ActionEvent e) {
        startView.getSettingsButton().setBackground(new Color(0xE0D6B5));

        new SettingsView().setVisible(true);
    }
}
