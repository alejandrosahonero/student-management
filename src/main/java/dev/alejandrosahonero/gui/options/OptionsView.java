package dev.alejandrosahonero.gui.options;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.OptionsController;

import javax.swing.*;
import java.awt.*;

public class OptionsView extends MainView {
    private JLabel background, title1, title2;
    private JButton matricularButton, modAlumButton, modProButton, modModButton, modAsigButton, listAlumButton, listProButton, listModButton, listAsigButton;
    public OptionsView(){
        super("Options");

        initComponents();
    }

    private void initComponents(){
        background = new OptionsBackground(getWindowsWidth(), getWindowsHeight());
        background.setIcon(getBackgroundImage());

        titles();
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
    private void titles(){
        title1 = new JLabel("GESTIONAR");
        title1.setFont(new Font("Tahoma", Font.BOLD, 50));
        title1.setForeground(new Color(0x3D5A40));
        title1.setHorizontalAlignment(SwingConstants.CENTER);
        title1.setVerticalAlignment(SwingConstants.CENTER);
        title1.setBounds(getWindowsWidth()/4-getButtonsWidth(), getWindowsHeight()/12-getButtonsHeight()/2, getButtonsWidth()*2, getButtonsHeight());

        title2 = new JLabel("LISTAR");
        title2.setFont(new Font("Tahoma", Font.BOLD, 50));
        title2.setForeground(new Color(0x3D5A40));
        title2.setHorizontalAlignment(SwingConstants.CENTER);
        title2.setVerticalAlignment(SwingConstants.CENTER);
        title2.setBounds(getWindowsWidth()/4*3-getButtonsWidth()/2, getWindowsHeight()/12-getButtonsHeight()/2, getButtonsWidth(), getButtonsHeight());

        background.add(title1);
        background.add(title2);
    }
    private void matricularButton(){
        matricularButton = createButton("Matricular Alumno", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        matricularButton.addActionListener(new OptionsController(this));
        matricularButton.setBounds(getWindowsWidth()/26, getWindowsHeight()/6+getButtonsHeight()/3*2, getButtonsWidth(), getButtonsHeight());

        background.add(matricularButton);
    }
    private void modAlumButton(){
        modAlumButton = createButton("Modificar Alumno", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        modAlumButton.addActionListener(new OptionsController(this));
        modAlumButton.setBounds(getWindowsWidth()/18*5, getWindowsHeight()/6+getButtonsHeight()/3*2, getButtonsWidth(), getButtonsHeight());

        background.add(modAlumButton);
    }
    private void modProButton(){
        modProButton = createButton("Modificar Profesor", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        modProButton.addActionListener(new OptionsController(this));
        modProButton.setBounds(getWindowsWidth()/26, getWindowsHeight()/6+getButtonsHeight()*5/2, getButtonsWidth(), getButtonsHeight());

        background.add(modProButton);
    }
    private void modModButton(){
        modModButton = createButton("Modificar Módulo", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        modModButton.addActionListener(new OptionsController(this));
        modModButton.setBounds(getWindowsWidth()/18*5, getWindowsHeight()/6+getButtonsHeight()*5/2, getButtonsWidth(), getButtonsHeight());

        background.add(modModButton);
    }
    private void modAsigButton(){
        modAsigButton = createButton("Modificar Asignatura", getButtonsWidth(), getButtonsHeight(), 20, 0x3D5A40, 0xffffff);
        modAsigButton.addActionListener(new OptionsController(this));
        modAsigButton.setBounds(getWindowsWidth()/26*4, getWindowsHeight()/6+getButtonsHeight()*13/3, getButtonsWidth(), getButtonsHeight());

        background.add(modAsigButton);
    }
    private void listAlumButton(){
        listAlumButton = createButton("Alumnos", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        listAlumButton.addActionListener(new OptionsController(this));
        listAlumButton.setBounds(getWindowsWidth()/13*7, getWindowsHeight()/6+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());

        background.add(listAlumButton);
    }
    private void listProButton(){
        listProButton = createButton("Profesores", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        listProButton.addActionListener(new OptionsController(this));
        listProButton.setBounds(getWindowsWidth()/13*10, getWindowsHeight()/6+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());

        background.add(listProButton);
    }
    private void listModButton(){
        listModButton = createButton("Módulos", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        listModButton.addActionListener(new OptionsController(this));
        listModButton.setBounds(getWindowsWidth()/13*7, getWindowsHeight()/6+getButtonsHeight()/3*10, getButtonsWidth(), getButtonsHeight());

        background.add(listModButton);
    }
    private void listAsigButton(){
        listAsigButton = createButton("Asignaturas", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        listAsigButton.addActionListener(new OptionsController(this));
        listAsigButton.setBounds(getWindowsWidth()/13*10, getWindowsHeight()/6+getButtonsHeight()/3*10, getButtonsWidth(), getButtonsHeight());

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
