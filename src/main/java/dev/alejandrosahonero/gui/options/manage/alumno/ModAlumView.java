package dev.alejandrosahonero.gui.options.manage.alumno;

import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.logic.options.manage.alumno.ModAlumButtonController;
import dev.alejandrosahonero.logic.options.manage.alumno.RmButtonController;
import dev.alejandrosahonero.logic.options.manage.alumno.SearchButtonController;

public class ModAlumView extends MainManageView {
    public ModAlumView(){
        super("Modificar Alumno");

        doneButton("MODIFICAR", new ModAlumButtonController(this));
        searchBar("DNI");
        searchButton(new SearchButtonController(this));
        removeButton(new RmButtonController(this));
    }
}
