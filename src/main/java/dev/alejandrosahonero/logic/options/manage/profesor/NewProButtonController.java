package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.gui.options.manage.NewProView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewProButtonController implements ActionListener {
    NewProView newProView;
    public NewProButtonController(NewProView newProView) {
        this.newProView = newProView;
    }
    public void actionPerformed(ActionEvent e) {}
}
