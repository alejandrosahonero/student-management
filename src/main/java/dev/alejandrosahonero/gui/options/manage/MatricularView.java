package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.ModModController;
import dev.alejandrosahonero.logic.options.manage.matricular.MatricularButtonController;
import dev.alejandrosahonero.logic.options.manage.PhotoButtonController;
import dev.alejandrosahonero.logic.options.manage.matricular.txtController;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Objects;

public class MatricularView extends MainManageView
{
    public MatricularView(){
        super("Matricular Alumno");
        super.doneButton("MATRICULAR");
    }
}
