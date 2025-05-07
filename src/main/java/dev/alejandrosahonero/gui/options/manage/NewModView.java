package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.OptionsController;
import dev.alejandrosahonero.logic.options.manage.modulo.NewModButtonController;

import javax.swing.*;
import java.awt.*;

public class NewModView extends MainManageView {
    public NewModView(){
        super("Añadir Módulo");
        super.doneButton("AÑADIR", new NewModButtonController(this));
    }
}
