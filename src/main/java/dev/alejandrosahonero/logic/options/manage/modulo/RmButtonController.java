package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.gui.options.manage.ModAlumView;
import dev.alejandrosahonero.gui.options.manage.ModModView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RmButtonController implements ActionListener {
    private ModModView modModView;
    public RmButtonController(ModModView modModView) {
        this.modModView = modModView;
    }
    public void actionPerformed(ActionEvent e) {}
}
