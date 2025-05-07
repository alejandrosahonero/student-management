package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.logic.options.manage.profesor.RmButtonController;
import dev.alejandrosahonero.logic.options.manage.profesor.SearchButtonController;
import dev.alejandrosahonero.logic.options.manage.profesor.ModProButtonController;

import javax.swing.*;
import java.awt.*;

public class ModProView extends MainManageView {
    public ModProView(){
        super("Modificar Profesor");

        doneButton("MODIFICAR", new ModProButtonController(this));
        searchBar();
        searchButton(new SearchButtonController(this));
        removeButton(new RmButtonController(this));
    }
}
