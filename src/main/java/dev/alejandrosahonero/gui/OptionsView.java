package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.OptionsController;

import javax.swing.*;
import java.awt.*;

public class OptionsView extends MainView {
    private JLabel background;
    private JButton matricularButton, listarButton, addProButton, addModButton;
    public OptionsView(){
        super("Options");

        initComponents();
    }

    private void initComponents(){
        background = new JLabel(getBackgroundImage());

        buttonsPanel();

        add(background, BorderLayout.CENTER);
    }
    private void buttonsPanel(){
        final int buttonWidth = 250;
        final int buttonHeight = 100;

        matricularButton = new JButton("Matricular");
        matricularButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        matricularButton.setHorizontalAlignment(SwingConstants.CENTER);
        matricularButton.setVerticalAlignment(SwingConstants.CENTER);
        matricularButton.setBackground(new Color(0x3D5A40));
        matricularButton.setForeground(new Color(0xffffff));
        matricularButton.setFocusable(false);
        matricularButton.addActionListener(new OptionsController(this));
        matricularButton.setBounds((getWidth()/2-buttonWidth/2)/2, (getHeight()/2-buttonHeight/2)/2, buttonWidth, buttonHeight);

        listarButton = new JButton("Listar");
        listarButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        listarButton.setHorizontalAlignment(SwingConstants.CENTER);
        listarButton.setVerticalAlignment(SwingConstants.CENTER);
        listarButton.setBackground(new Color(0x3D5A40));
        listarButton.setForeground(new Color(0xffffff));
        listarButton.setFocusable(false);
        listarButton.addActionListener(new OptionsController(this));
        listarButton.setBounds((getWidth()/2+buttonWidth/2), (getHeight()/2-buttonHeight/2)/2, buttonWidth, buttonHeight);

        addProButton = new JButton("Añadir Profesor");
        addProButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        addProButton.setHorizontalAlignment(SwingConstants.CENTER);
        addProButton.setVerticalAlignment(SwingConstants.CENTER);
        addProButton.setBackground(new Color(0x3D5A40));
        addProButton.setForeground(new Color(0xffffff));
        addProButton.setFocusable(false);
        addProButton.addActionListener(new OptionsController(this));
        addProButton.setBounds((getWidth()/2-buttonWidth/2)/2, (getHeight()/2+buttonHeight/2), buttonWidth, buttonHeight);

        addModButton = new JButton("Añadir módulo");
        addModButton.setFont(new Font("Tahoma", Font.BOLD, 30));
        addModButton.setHorizontalAlignment(SwingConstants.CENTER);
        addModButton.setVerticalAlignment(SwingConstants.CENTER);
        addModButton.setBackground(new Color(0x3D5A40));
        addModButton.setForeground(new Color(0xffffff));
        addModButton.setFocusable(false);
        addModButton.addActionListener(new OptionsController(this));
        addModButton.setBounds((getWidth()/2+buttonWidth/2), (getHeight()/2+buttonHeight/2), buttonWidth, buttonHeight);

        background.add(matricularButton);
        background.add(listarButton);
        background.add(addProButton);
        background.add(addModButton);
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
