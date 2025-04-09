package dev.alejandrosahonero.logic;

import dev.alejandrosahonero.gui.MatriculacionView;
import dev.alejandrosahonero.gui.OptionsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatricularButtonController implements ActionListener {
    OptionsView optionsView;
    public MatricularButtonController(OptionsView optionsView) {
        this.optionsView = optionsView;
    }

    public void actionPerformed(ActionEvent e) {
        optionsView.setVisible(false);
        new MatriculacionView().setVisible(true);
    }
}
