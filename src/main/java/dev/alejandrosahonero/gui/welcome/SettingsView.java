package dev.alejandrosahonero.gui.welcome;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;
import java.awt.*;

public class SettingsView extends MainView {
    JLabel background;
    public SettingsView() {
        super("Ajustes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        initComponents();
    }
    public void initComponents(){
        background = new JLabel(getBackgroundImage());

        add(background, BorderLayout.CENTER);
    }
}
