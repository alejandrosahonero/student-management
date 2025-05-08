package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.gui.options.manage.AddModProView;
import dev.alejandrosahonero.gui.options.manage.ModProView;
import dev.alejandrosahonero.gui.options.manage.NewProView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModulosButtonController implements ActionListener {
    private NewProView newProView;
    private ModProView modProView;
    public ModulosButtonController(NewProView newProView) {
        this.newProView = newProView;
    }
    public ModulosButtonController(ModProView modProView) {
        this.modProView = modProView;
    }
    public void actionPerformed(ActionEvent e) {
        new AddModProView().setVisible(true);
    }
}
