package dev.alejandrosahonero.gui.options;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;
import java.awt.*;

public class AddProfesorView extends MainView {
    JLabel background;

    public AddProfesorView() {
        super("Profesores");

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
