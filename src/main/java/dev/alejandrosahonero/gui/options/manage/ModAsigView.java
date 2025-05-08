package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.logic.options.manage.asignatura.RmButtonController;
import dev.alejandrosahonero.logic.options.manage.asignatura.SearchButtonController;
import dev.alejandrosahonero.logic.options.manage.asignatura.ModAsigButtonController;

import javax.swing.*;

public class ModAsigView extends MainManageView {
    public ModAsigView(){
        super("Modificar Asignatura");

        doneButton("MODIFICAR", new ModAsigButtonController(this));
        searchBar("ID");
        searchButton(new SearchButtonController(this));
        removeButton(new RmButtonController(this));
    }
}
