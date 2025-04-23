package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;

public class ModAsigView extends MainView {
    private JLabel background;

    public ModAsigView(){
        super("Modificar Alumno");

        initComponents();
    }
    private void initComponents(){
        background = new JLabel(getBackgroundImage());
        add(background);
    }
}
