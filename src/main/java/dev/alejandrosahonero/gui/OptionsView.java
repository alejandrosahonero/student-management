package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.OptionsController;

import javax.swing.*;
import java.awt.*;

public class OptionsView extends JFrame {
    private JLabel backgroundLabel;
    private JButton matricularButton, listarButton, addProButton, addModButton;
    private ImageIcon background;
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
        backgroundImage();
        buttonsPanel();
    }
    private void backgroundImage() {
        background = new ImageIcon("src/main/resources/img/background-windows.png");
        background = new ImageIcon(background.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));

        backgroundLabel = new JLabel(background);
        backgroundLabel.setSize(background.getIconWidth(), background.getIconHeight());

        add(backgroundLabel, BorderLayout.CENTER);
    }
    private void buttonsPanel(){
        final int buttonWidth = 250;
        final int buttonHeight = 100;

        matricularButton = new JButton("Matricular");
        matricularButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        matricularButton.setHorizontalAlignment(SwingConstants.CENTER);
        matricularButton.setVerticalAlignment(SwingConstants.CENTER);
        matricularButton.addActionListener(new OptionsController(this));
        matricularButton.setBounds((getWidth()/2-buttonWidth/2)/2, (getHeight()/2-buttonHeight/2)/2, buttonWidth, buttonHeight);

        listarButton = new JButton("Listar");
        listarButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        listarButton.setHorizontalAlignment(SwingConstants.CENTER);
        listarButton.setVerticalAlignment(SwingConstants.CENTER);
        listarButton.addActionListener(new OptionsController(this));
        listarButton.setBounds((getWidth()/2+buttonWidth/2), (getHeight()/2-buttonHeight/2)/2, buttonWidth, buttonHeight);

        addProButton = new JButton("Añadir Profesor");
        addProButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        addProButton.setHorizontalAlignment(SwingConstants.CENTER);
        addProButton.setVerticalAlignment(SwingConstants.CENTER);
        addProButton.addActionListener(new OptionsController(this));
        addProButton.setBounds((getWidth()/2-buttonWidth/2)/2, (getHeight()/2+buttonHeight/2), buttonWidth, buttonHeight);

        addModButton = new JButton("Añadir módulo");
        addModButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        addModButton.setHorizontalAlignment(SwingConstants.CENTER);
        addModButton.setVerticalAlignment(SwingConstants.CENTER);
        addModButton.addActionListener(new OptionsController(this));
        addModButton.setBounds((getWidth()/2+buttonWidth/2), (getHeight()/2+buttonHeight/2), buttonWidth, buttonHeight);

        backgroundLabel.add(matricularButton);
        backgroundLabel.add(listarButton);
        backgroundLabel.add(addProButton);
        backgroundLabel.add(addModButton);

    }

    //Getters
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
