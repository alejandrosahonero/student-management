package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public class AddModuloView extends MainView {
    JLabel background;

    public AddModuloView() {
        super("Modulos");
        setBackgroundImage("src/main/resources/img/background-windows.png");

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
