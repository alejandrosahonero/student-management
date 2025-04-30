package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.OptionsBackground;
import dev.alejandrosahonero.logic.options.OptionsController;

import javax.swing.*;
import java.awt.*;

public class NewAsigView extends MainManageView {
    public NewAsigView(){
        super("Añadir Asignatura");
        super.doneButton("AÑADIR");
    }
}
