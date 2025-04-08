package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public class OptionsView extends JFrame {
    JPanel panel;
    JButton matricularButton, listarButton, addProButton, addModButton;
    public OptionsView(){
        setTitle("Opciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(new Dimension(1152, 768));
        setLayout(new BorderLayout());

        initComponents();
    }
    private void initComponents(){

    }
    private void buttonsPanel(){
        panel = new JPanel(new GridLayout(2,2));

        matricularButton = new JButton("Matricular");
        matricularButton.setFont(new Font("Tahoma", Font.BOLD, 14));

        listarButton = new JButton("Listar");
        listarButton.setFont(new Font("Tahoma", Font.BOLD, 14));

        addProButton = new JButton("Añadir Profesor");
        addProButton.setFont(new Font("Tahoma", Font.BOLD, 14));

        addModButton = new JButton("Añadir módulo");
        addModButton.setFont(new Font("Tahoma", Font.BOLD, 14));

        panel.add(addModButton);
        panel.add(addProButton);
        panel.add(listarButton);
        panel.add(matricularButton);
    }
}
