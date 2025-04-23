package dev.alejandrosahonero.gui.options.list;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;
import java.awt.*;

public class ListarView extends MainView {
    JLabel background;

    public ListarView() {
        super("Lista");

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
