package dev.alejandrosahonero.gui.options.manage.modulo;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.logic.options.manage.modulo.AsignaturasButtonController;
import dev.alejandrosahonero.logic.options.manage.modulo.NewModButtonController;

import javax.swing.*;

public class NewModView extends MainManageView {
    final int margin = 50;

    private JLabel background, title1, siglas_l, nombre_l, descripcion_l, asignaturas_l;
    private JTextField siglas, nombre, descripcion;
    private JButton asignaturasButton, doneButton;

    public NewModView(){
        super("Añadir Módulo");

        initComponents();
    }
    @Override
    protected void initComponents(){
        background = new JLabel(getBackgroundImage());

        titles();
        subTitles();
        data();
        doneButton();

        add(background);
    }
    @Override
    protected void titles(){
        title1 = createTitle("INFORMACIÓN DEL MÓDULO", 50, 0x3D5A40);
        title1.setBounds(margin, margin, getButtonsWidth()*3, getButtonsHeight());
        background.add(title1);
    }
    @Override
    protected void subTitles(){
        siglas_l = createTitle("SIGLAS", 20, 0x3D5A40);
        siglas_l.setBounds(margin, margin*2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        background.add(siglas_l);
        nombre_l = createTitle("NOMBRE", 20, 0x3D5A40);
        nombre_l.setBounds(margin*2+getButtonsWidth(), margin*2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        background.add(nombre_l);
        descripcion_l = createTitle("DESCRIPCIÓN", 20, 0x3D5A40);
        descripcion_l.setBounds(margin*3+getButtonsWidth()*2, margin*2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        background.add(descripcion_l);
        asignaturas_l = createTitle("ASIGNATURAS", 20, 0x3D5A40);
        asignaturas_l.setBounds(margin*4+getButtonsWidth()*3, margin*2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        background.add(asignaturas_l);
    }
    private void data(){
        siglas = createTextField("SIGLAS", 15);
        siglas.setBounds(margin, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        background.add(siglas);

        nombre = createTextField("Nombre", 15);
        nombre.setBounds(margin*2+getButtonsWidth(), margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        background.add(nombre);

        descripcion = createTextField("Descripción", 15);
        descripcion.setBounds(margin*3+getButtonsWidth()*2, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        background.add(descripcion);

        asignaturasButton = createButton("Asignar Asignaturas", 15, 0x3D5A40, 0xffffff);
        asignaturasButton.setBounds(margin*4+getButtonsWidth()*3, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        asignaturasButton.addActionListener(new AsignaturasButtonController(this));
        background.add(asignaturasButton);
    }
    private void doneButton(){
        doneButton = createButton("AÑADIR", 25, 0x3D5A40, 0xffffff);
        doneButton.setBounds(margin*9/2+getButtonsWidth()*3, margin*5/2+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        doneButton.addActionListener(new NewModButtonController(this));
        background.add(doneButton);
    }
}
