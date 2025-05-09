package dev.alejandrosahonero.gui.options.manage.modulo;

import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.logic.options.manage.modulo.RmButtonController;
import dev.alejandrosahonero.logic.options.manage.modulo.SearchButtonController;
import dev.alejandrosahonero.logic.options.manage.modulo.ModModButtonController;

public class ModModView extends MainManageView {
    public ModModView(){
        super("Modificar Módulo");

        doneButton("MODIFICAR", new ModModButtonController(this));
        searchBar("ID");
        searchButton(new SearchButtonController(this));
        removeButton(new RmButtonController(this));
    }
}
