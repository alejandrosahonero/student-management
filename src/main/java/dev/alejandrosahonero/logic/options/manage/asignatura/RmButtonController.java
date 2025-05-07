package dev.alejandrosahonero.logic.options.manage.asignatura;

import dev.alejandrosahonero.gui.options.manage.ModAlumView;
import dev.alejandrosahonero.gui.options.manage.ModAsigView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RmButtonController implements ActionListener {
    private ModAsigView modAsigView;
    public RmButtonController(ModAsigView modAsigView) {
        this.modAsigView = modAsigView;
    }
    public void actionPerformed(ActionEvent e) {}
}
