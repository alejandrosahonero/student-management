package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.logic.options.manage.alumno.ModAlumButtonController;
import dev.alejandrosahonero.logic.options.manage.alumno.SearchButtonController;

public class ModAlumView extends MainManageView {
    public ModAlumView(){
        super("Modificar Alumno");
        super.doneButton("MODIFICAR", new ModAlumButtonController(this));

        searchBar();
        searchButton(new SearchButtonController(this));
    }
}
