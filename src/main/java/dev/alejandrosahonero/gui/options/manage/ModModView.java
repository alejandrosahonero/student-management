package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.modulo.ModModButtonController;

import javax.swing.*;
import java.awt.*;

public class ModModView extends MainManageView {
    public ModModView(){
        super("Modificar Módulo");
        super.doneButton("MODIFICAR", new ModModButtonController(this));
    }
}
