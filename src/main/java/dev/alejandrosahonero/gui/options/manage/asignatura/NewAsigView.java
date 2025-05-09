package dev.alejandrosahonero.gui.options.manage.asignatura;

import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.logic.options.manage.asignatura.NewAsigButtonController;

public class NewAsigView extends MainManageView {
    public NewAsigView(){
        super("Añadir Asignatura");
        super.doneButton("AÑADIR", new NewAsigButtonController(this));
    }
}
