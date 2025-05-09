package dev.alejandrosahonero.gui.options.manage.asignatura;

import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.logic.options.manage.asignatura.RmButtonController;
import dev.alejandrosahonero.logic.options.manage.asignatura.SearchButtonController;
import dev.alejandrosahonero.logic.options.manage.asignatura.ModAsigButtonController;

public class ModAsigView extends MainManageView {
    public ModAsigView(){
        super("Modificar Asignatura");

        doneButton("MODIFICAR", new ModAsigButtonController(this));
        searchBar("ID");
        searchButton(new SearchButtonController(this));
        removeButton(new RmButtonController(this));
    }
}
