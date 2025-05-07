package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.logic.options.manage.alumno.MatricularButtonController;

public class MatricularView extends MainManageView
{
    public MatricularView(){
        super("Matricular Alumno");
        super.doneButton("MATRICULAR", new MatricularButtonController(this));
    }
}
