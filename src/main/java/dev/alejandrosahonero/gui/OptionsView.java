package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.MatricularButtonController;

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
        buttonsPanel();
    }
    private void buttonsPanel(){
        panel = new JPanel(new GridLayout(2,2));

        matricularButton = new JButton("Matricular");
        matricularButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        matricularButton.setHorizontalAlignment(SwingConstants.CENTER);
        matricularButton.setVerticalAlignment(SwingConstants.CENTER);
        matricularButton.setPreferredSize(new Dimension(250, 100));
        matricularButton.addActionListener(new MatricularButtonController(this));

        listarButton = new JButton("Listar");
        listarButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        listarButton.setHorizontalAlignment(SwingConstants.CENTER);
        listarButton.setVerticalAlignment(SwingConstants.CENTER);
        listarButton.setPreferredSize(new Dimension(250, 100));

        addProButton = new JButton("Añadir Profesor");
        addProButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        addProButton.setHorizontalAlignment(SwingConstants.CENTER);
        addProButton.setVerticalAlignment(SwingConstants.CENTER);
        addProButton.setPreferredSize(new Dimension(250, 100));

        addModButton = new JButton("Añadir módulo");
        addModButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        addModButton.setHorizontalAlignment(SwingConstants.CENTER);
        addModButton.setVerticalAlignment(SwingConstants.CENTER);
        addModButton.setPreferredSize(new Dimension(250, 100));

        JPanel button1 = new JPanel(new GridBagLayout());
        button1.add(matricularButton);
        JPanel button2 = new JPanel(new GridBagLayout());
        button2.add(listarButton);
        JPanel button3 = new JPanel(new GridBagLayout());
        button3.add(addProButton);
        JPanel button4 = new JPanel(new GridBagLayout());
        button4.add(addModButton);

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        add(panel);
    }

    //Getters and Setters
    public JPanel getPanel() {
        return panel;
    }

    public JButton getMatricularButton() {
        return matricularButton;
    }

    public JButton getListarButton() {
        return listarButton;
    }

    public JButton getAddProButton() {
        return addProButton;
    }

    public JButton getAddModButton() {
        return addModButton;
    }
}
