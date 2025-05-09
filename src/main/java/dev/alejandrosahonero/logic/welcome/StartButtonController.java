package dev.alejandrosahonero.logic.welcome;

import dev.alejandrosahonero.gui.welcome.LoginView;
import dev.alejandrosahonero.gui.welcome.StartView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButtonController implements ActionListener {
    private StartView startView;

    public StartButtonController(StartView startView) {
        this.startView = startView;
    }
    public void actionPerformed(ActionEvent e) {
        new LoginView(startView).setVisible(true);
    }
}
