package dev.alejandrosahonero.gui.options.list;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;

public class ListAsigView extends MainView {
    private JLabel background;

    public ListAsigView(){
        super("Modificar Alumno");

        initComponents();
    }
    private void initComponents(){
        background = new JLabel(getBackgroundImage());
        add(background);
    }
}
