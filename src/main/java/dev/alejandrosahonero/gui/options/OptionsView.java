package dev.alejandrosahonero.gui.options;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.OptionsController;

import javax.swing.*;
import java.awt.*;

public class OptionsView extends MainView {
    private JLabel background;
    private JButton matricularButton, modAlumButton, modProButton, modModButton, modAsigButton, listAlumButton, listProButton, listModButton, listAsigButton;
    public OptionsView(){
        super("Options");

        initComponents();
    }

    private void initComponents(){
        background = new OptionsBackground();
        background.setIcon(getBackgroundImage());

        matricularButton();
        modAlumButton();
        modProButton();
        modModButton();
        modAsigButton();
        listAlumButton();
        listProButton();
        listModButton();
        listAsigButton();


        add(background, BorderLayout.CENTER);
    }
    private void matricularButton(){
        matricularButton = createButton("Matricular Alumno", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        matricularButton.addActionListener(new OptionsController(this));
        matricularButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(matricularButton);
    }
    private void modAlumButton(){
        modAlumButton = createButton("Modificar Alumno", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        modAlumButton.addActionListener(new OptionsController(this));
        modAlumButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(modAlumButton);
    }
    private void modProButton(){
        modProButton = createButton("Modificar Profesor", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        modProButton.addActionListener(new OptionsController(this));
        modProButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(modProButton);
    }
    private void modModButton(){
        modModButton = createButton("Modificar Módulo", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        modModButton.addActionListener(new OptionsController(this));
        modModButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(modModButton);
    }
    private void modAsigButton(){
        modAsigButton = createButton("Modificar Asignatura", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        modAsigButton.addActionListener(new OptionsController(this));
        modAsigButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(modAsigButton);
    }
    private void listAlumButton(){
        listAlumButton = createButton("Alumnos", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        listAlumButton.addActionListener(new OptionsController(this));
        listAlumButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(listAlumButton);
    }
    private void listProButton(){
        listProButton = createButton("Profesores", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        listProButton.addActionListener(new OptionsController(this));
        listProButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(listProButton);
    }
    private void listModButton(){
        listModButton = createButton("Módulos", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        listModButton.addActionListener(new OptionsController(this));
        listModButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(listModButton);
    }
    private void listAsigButton(){
        listAsigButton = createButton("Asignaturas", getButtonsWidth(), getButtonsHeight(), 30, 0x3D5A40, 0xffffff);
        listAsigButton.addActionListener(new OptionsController(this));
        listAsigButton.setBounds((getWidth()/2-getButtonsWidth()/2)/2, (getHeight()/2-getButtonsHeight()/2)/2, getButtonsWidth(), getButtonsHeight());

        background.add(listAsigButton);
    }



    //Getters
    public JButton getMatricularButton() {
        return matricularButton;
    }
    public JButton getModAlumButton() {
        return modAlumButton;
    }
    public JButton getModProButton() {
        return modProButton;
    }
    public JButton getModModButton() {
        return modModButton;
    }
    public JButton getModAsigButton() {
        return modAsigButton;
    }
    public JButton getListAlumButton() {
        return listAlumButton;
    }
    public JButton getListProButton() {
        return listProButton;
    }
    public JButton getListModButton() {
        return listModButton;
    }
    public JButton getListAsigButton() {
        return listAsigButton;
    }
}
