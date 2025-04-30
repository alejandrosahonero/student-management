package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.OptionsController;

import javax.swing.*;
import java.awt.*;

public class NewModView extends MainView {
    private JLabel background;

    public NewModView(){
        super("Añadir Módulo");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        initComponents();
    }

    private void initComponents(){
        background = new JLabel(getBackgroundImage());


        add(background, BorderLayout.CENTER);
    }
}
