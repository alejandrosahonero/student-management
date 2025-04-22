package dev.alejandrosahonero.logic;

import dev.alejandrosahonero.gui.OptionsView;
import dev.alejandrosahonero.gui.StartView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterButtonController implements ActionListener {
    private StartView startView;
    public RegisterButtonController(StartView startView) {
        this.startView = startView;
    }
    public void actionPerformed(ActionEvent e) {
        startView.getRegisterButton().setBackground(new Color(0xE0D6B5));

        startView.setVisible(false);
        new OptionsView().setVisible(true);
    }
}
