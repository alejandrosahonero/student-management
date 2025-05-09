package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.gui.options.manage.modulo.AddAsigModView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AsignaturasButtonController implements ActionListener {
    private MainManageView mainManageView;
    public AsignaturasButtonController(MainManageView mainManageView) {
        this.mainManageView = mainManageView;
    }
    public void actionPerformed(ActionEvent e) {
        new AddAsigModView(mainManageView).setVisible(true);
    }
}
