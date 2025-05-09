package dev.alejandrosahonero.gui.options.manage.profesor;

import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.logic.options.manage.profesor.ModulosButtonController;
import dev.alejandrosahonero.logic.options.manage.profesor.NewProButtonController;
import dev.alejandrosahonero.logic.options.manage.txtController;

import javax.swing.*;

public class NewProView extends MainManageView {
    private JButton modulosButton;
    public NewProView(){
        super("Añadir Profesor");

        doneButton("AÑADIR", new NewProButtonController(this));
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
