package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.gui.options.manage.modulo.NewModView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewModButtonController implements ActionListener {
    NewModView newModView;
    public NewModButtonController(NewModView newModView) {
        this.newModView = newModView;
    }
    public void actionPerformed(ActionEvent e) {}
}
