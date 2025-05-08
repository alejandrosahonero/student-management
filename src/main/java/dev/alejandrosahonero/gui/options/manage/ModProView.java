package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.logic.options.manage.profesor.ModulosButtonController;
import dev.alejandrosahonero.logic.options.manage.profesor.RmButtonController;
import dev.alejandrosahonero.logic.options.manage.profesor.SearchButtonController;
import dev.alejandrosahonero.logic.options.manage.profesor.ModProButtonController;
import dev.alejandrosahonero.logic.options.manage.txtController;

import javax.swing.*;
import java.awt.*;

public class ModProView extends MainManageView {
    private JButton modulosButton;
    public ModProView(){
        super("Modificar Profesor");

        doneButton("MODIFICAR", new ModProButtonController(this));
        searchBar();
        searchButton(new SearchButtonController(this));
        removeButton(new RmButtonController(this));
    }
    @Override
    protected void academicInformation(){
        modulosButton = createButton("Añadir modulos", 20, 0x3D5A40, 0xffffff);
        modulosButton.setBounds(margin, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        modulosButton.addActionListener(new ModulosButtonController(this));
        background.add(modulosButton);

        nuss = createTextField("NUSS", 15);
        nuss.setBounds(margin*2+getButtonsWidth(), margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        nuss.addMouseListener(new txtController());
        background.add(nuss);

        email = createTextField("EMAIL", 15);
        email.setBounds(margin*3+getButtonsWidth()*2, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        email.addMouseListener(new txtController());
        background.add(email);

        telefono = createTextField("TELÉFONO", 15);
        telefono.setBounds(margin*4+getButtonsWidth()*3, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        telefono.addMouseListener(new txtController());
        background.add(telefono);
    }
}
