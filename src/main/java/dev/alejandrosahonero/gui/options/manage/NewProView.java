package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.OptionsController;
import dev.alejandrosahonero.logic.options.manage.profesor.NewProButtonController;

import javax.swing.*;
import java.awt.*;

public class NewProView extends MainManageView {
    public NewProView(){
        super("Añadir Profesor");
        super.doneButton("AÑADIR", new NewProButtonController(this));
    }
}
