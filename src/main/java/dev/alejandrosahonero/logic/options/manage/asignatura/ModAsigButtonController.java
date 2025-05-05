package dev.alejandrosahonero.logic.options.manage.asignatura;

import dev.alejandrosahonero.gui.options.manage.ModAsigView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModAsigButtonController implements ActionListener {
    ModAsigView modAsigView;
    public ModAsigButtonController(ModAsigView modAsigView) {
        this.modAsigView = modAsigView;
    }
    public void actionPerformed(ActionEvent e) {}
}
