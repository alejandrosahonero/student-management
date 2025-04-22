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

        matricularButton = createButton("Matricular", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        matricularButton.addActionListener(new OptionsController(this));
        matricularButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        listarButton = createButton("Listar", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        listarButton.addActionListener(new OptionsController(this));
        listarButton.setBounds((getWidth()/2+getButtonsWidth()/2), (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        addProButton = createButton("Añadir Profesor", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        addProButton.addActionListener(new OptionsController(this));
        addProButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2+getButtonsHeight()/2), getButtonsWidth(), getButtonsHeight());

        addModButton = createButton("Añadir módulo", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        addModButton.addActionListener(new OptionsController(this));
        addModButton.setBounds((getWidth()/2+getButtonsWidth()/2), (getHeight()/2+getButtonsHeight()/2), getButtonsWidth(), getButtonsHeight());

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
