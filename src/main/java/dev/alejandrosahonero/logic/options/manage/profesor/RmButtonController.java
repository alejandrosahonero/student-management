package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.gui.options.manage.ModAlumView;
import dev.alejandrosahonero.gui.options.manage.ModProView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RmButtonController implements ActionListener {
    private ModProView modProView;
    public RmButtonController(ModProView modProView) {
        this.modProView = modProView;
    }
    public void actionPerformed(ActionEvent e) {}
}
