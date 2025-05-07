package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.OptionsController;
import dev.alejandrosahonero.logic.options.manage.modulo.ModModButtonController;
import dev.alejandrosahonero.logic.options.manage.profesor.ModProButtonController;
import dev.alejandrosahonero.logic.options.manage.profesor.NewProButtonController;
import dev.alejandrosahonero.logic.options.manage.txtController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NewProView extends MainManageView {
    public NewProView(){
        super("Añadir Profesor");

        doneButton("AÑADIR", new NewProButtonController(this));
    }
    @Override
    protected void academicInformation(){
        JButton modulosImparte = createButton("Añadir modulos", 20, 0x3D5A40, 0xffffff);
        modulosImparte.setBounds(margin, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        background.add(modulosImparte);

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
