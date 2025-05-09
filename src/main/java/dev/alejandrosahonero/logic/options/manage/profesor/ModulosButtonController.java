package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.gui.options.manage.profesor.AddModProView;
import dev.alejandrosahonero.gui.options.manage.MainManageView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModulosButtonController implements ActionListener {
    private MainManageView mainManageView;
    public ModulosButtonController(MainManageView mainManageView) {
        this.mainManageView = mainManageView;
    }
    public void actionPerformed(ActionEvent e) {
        new AddModProView(mainManageView).setVisible(true);
    }
}
