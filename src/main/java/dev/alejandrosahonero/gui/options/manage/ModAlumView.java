package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;

public class ModAlumView extends MainView {
    private JLabel background;

    public ModAlumView(){
        super("Modificar Alumno");

        initComponents();
    }
    private void initComponents(){
        background = new JLabel(getBackgroundImage());
        add(background);
    }
}
