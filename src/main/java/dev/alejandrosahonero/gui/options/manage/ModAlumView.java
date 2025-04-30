package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.ModModController;
import dev.alejandrosahonero.logic.options.manage.PhotoButtonController;
import dev.alejandrosahonero.logic.options.manage.matricular.MatricularButtonController;
import dev.alejandrosahonero.logic.options.manage.matricular.txtController;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ModAlumView extends MainManageView {
    public ModAlumView(){
        super("Modificar Alumno");
        super.doneButton("MODIFICAR");
    }
}
