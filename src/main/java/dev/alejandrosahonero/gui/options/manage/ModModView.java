package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;
import java.awt.*;

public class ModModView extends MainView {
    JLabel background;

    public ModModView() {
        super("Moduficar Módulos");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        initComponents();
    }

    /**
     * Método que inicializa todos los demás métodos para aligerar la carga al constructor
     */
    private void initComponents() {
        background = new JLabel(getBackgroundImage());

        add(background, BorderLayout.CENTER);
    }
}
