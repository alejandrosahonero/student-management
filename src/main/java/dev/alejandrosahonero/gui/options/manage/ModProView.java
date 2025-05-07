package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.profesor.ModProButtonController;

import javax.swing.*;
import java.awt.*;

public class ModProView extends MainManageView {
    public ModProView(){
        super("Modificar Profesor");
        super.doneButton("MODIFICAR", new ModProButtonController(this));
    }
}
