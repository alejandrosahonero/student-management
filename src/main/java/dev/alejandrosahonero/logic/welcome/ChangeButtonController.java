package dev.alejandrosahonero.logic.welcome;

import dev.alejandrosahonero.gui.options.OptionsView;
import dev.alejandrosahonero.gui.welcome.StartView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeButtonController implements ActionListener {
    private StartView startView;

    public ChangeButtonController(StartView startView) {
        this.startView = startView;
    }

    public void actionPerformed(ActionEvent e) {
        startView.getChangeButton().setBackground(new Color(0xE0D6B5));

        startView.setVisible(false);
        new OptionsView().setVisible(true);
    }
}
