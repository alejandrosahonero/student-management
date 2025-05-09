package dev.alejandrosahonero.logic.options.manage.asignatura;

import dev.alejandrosahonero.gui.options.manage.asignatura.NewAsigView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewAsigButtonController implements ActionListener {
    NewAsigView newAsigView;
    public NewAsigButtonController(NewAsigView newAsigView) {
        this.newAsigView = newAsigView;
    }
    public void actionPerformed(ActionEvent e) {}
}
