package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public class OptionsView extends JFrame {
    public OptionsView(){
        setTitle("Opciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(new Dimension(1152, 768));
        setLayout(new BorderLayout());

        initComponents();
    }
    private void initComponents(){}
}
