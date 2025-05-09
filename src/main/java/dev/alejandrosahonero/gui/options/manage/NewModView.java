package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.OptionsController;
import dev.alejandrosahonero.logic.options.manage.modulo.NewModButtonController;

import javax.swing.*;
import java.awt.*;

public class NewModView extends MainView {
    final int margin = 50;

    private JLabel background, title1, siglas_l, nombre_l, descripcion_l, asignaturas_l;
    private JTextField siglas, nombre, descripcion;
    private JButton asignaturasButton;

    public NewModView(){
        super("Añadir Módulo");

        initComponents();
    }
    private void initComponents(){
        background = new JLabel(getBackgroundImage());

        title();
        subTitles();
        data();

        add(background);
    }
    private void title(){
        title1 = createTitle("INFORMACIÓN DEL MÓDULO", 50, 0x3D5A40);
        title1.setBounds(margin, margin, getButtonsWidth(), getButtonsHeight());
        background.add(title1);
    }
    private void subTitles(){
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

    }
}
