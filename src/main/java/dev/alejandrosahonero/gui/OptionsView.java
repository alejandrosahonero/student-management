package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.OptionsController;

import javax.swing.*;
import java.awt.*;

public class OptionsView extends JFrame {
    private JPanel panel;
    private JButton matricularButton, listarButton, addProButton, addModButton;
    public OptionsView(){
        setTitle("Opciones");
        setSize(new Dimension(1152, 768));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
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
        matricularButton.addActionListener(new OptionsController(this));

        listarButton = new JButton("Listar");
        listarButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        listarButton.setHorizontalAlignment(SwingConstants.CENTER);
        listarButton.setVerticalAlignment(SwingConstants.CENTER);
        listarButton.setPreferredSize(new Dimension(250, 100));
        listarButton.addActionListener(new OptionsController(this));

        addProButton = new JButton("Añadir Profesor");
        addProButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        addProButton.setHorizontalAlignment(SwingConstants.CENTER);
        addProButton.setVerticalAlignment(SwingConstants.CENTER);
        addProButton.setPreferredSize(new Dimension(250, 100));
        addProButton.addActionListener(new OptionsController(this));

        addModButton = new JButton("Añadir módulo");
        addModButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        addModButton.setHorizontalAlignment(SwingConstants.CENTER);
        addModButton.setVerticalAlignment(SwingConstants.CENTER);
        addModButton.setPreferredSize(new Dimension(250, 100));
        addModButton.addActionListener(new OptionsController(this));

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
