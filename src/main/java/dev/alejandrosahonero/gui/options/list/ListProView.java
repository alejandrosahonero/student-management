package dev.alejandrosahonero.gui.options.list;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;

public class ListProView extends MainView {
    private JLabel background;

    public ListProView() {
        super("Modificar Alumno");

        initComponents();
    }
    private void initComponents(){
        background = new JLabel(getBackgroundImage());
        add(background);
    }
}
