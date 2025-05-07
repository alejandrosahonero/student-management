package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.asignatura.ModAsigButtonController;

import javax.swing.*;

public class ModAsigView extends MainManageView {
    public ModAsigView(){
        super("Modificar Asignatura");
        super.doneButton("MODIFICAR", new ModAsigButtonController(this));
    }
}
