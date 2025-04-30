package dev.alejandrosahonero.gui.options;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.OptionsController;

import javax.swing.*;
import java.awt.*;

public class OptionsView extends MainView {
    private static final int marginTopLeft = 40;
    private static final int marginTopRight = 90;
    private static final int marginTitle = 60;
    private static final int marginHori = 46;
    private static final int lineWidth = 4;

    private JLabel background, title1, title2;
    private JButton matricularButton, modAlumButton, newProButton, modProButton, newModButton, modModButton, newAsigButton, modAsigButton, listAlumButton, listProButton, listModButton, listAsigButton;

    public OptionsView(){
        super("Options");
        addWindowListener(new OptionsController(this));

        initComponents();
    }

    private void initComponents(){
        background = new OptionsBackground(getWindowsWidth(), getWindowsHeight());
        background.setIcon(getBackgroundImage());

        titles();
        matricularButton();
        modAlumButton();
        newProButton();
        modProButton();
        newModButton();
        modModButton();
        newAsigButton();
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
        title1.setBounds(marginHori, marginTitle, getButtonsWidth()*2+marginHori, getButtonsHeight());

        title2 = new JLabel("LISTAR");
        title2.setFont(new Font("Tahoma", Font.BOLD, 50));
        title2.setForeground(new Color(0x3D5A40));
        title2.setHorizontalAlignment(SwingConstants.CENTER);
        title2.setVerticalAlignment(SwingConstants.CENTER);
        title2.setBounds(marginHori*4+getButtonsWidth()*2+lineWidth, marginTitle, getButtonsWidth()*2+marginHori, getButtonsHeight());

        background.add(title1);
        background.add(title2);
    }
    private void matricularButton(){
        matricularButton = createButton("Matricular Alumno", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        matricularButton.addActionListener(new OptionsController(this));
        matricularButton.setBounds(marginHori, marginTitle*2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());

        background.add(matricularButton);
    }
    private void modAlumButton(){
        modAlumButton = createButton("Modificar Alumno", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        modAlumButton.addActionListener(new OptionsController(this));
        modAlumButton.setBounds(marginHori*2+getButtonsWidth(), marginTitle*2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());

        background.add(modAlumButton);
    }
    private void newProButton(){
        modProButton = createButton("Añadir Profesor", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        modProButton.addActionListener(new OptionsController(this));
        modProButton.setBounds(marginHori, marginTitle*2+getButtonsHeight()*2+marginTopLeft, getButtonsWidth(), getButtonsHeight());

        background.add(modProButton);
    }
    private void modProButton(){
        modProButton = createButton("Modificar Profesor", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        modProButton.addActionListener(new OptionsController(this));
        modProButton.setBounds(marginHori*2+getButtonsWidth(), marginTitle*2+getButtonsHeight()*2+marginTopLeft, getButtonsWidth(), getButtonsHeight());

        background.add(modProButton);
    }
    private void newModButton(){
        modModButton = createButton("Añadir Módulo", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        modModButton.addActionListener(new OptionsController(this));
        modModButton.setBounds(marginHori, marginTitle*2+getButtonsHeight()*3+marginTopLeft*2, getButtonsWidth(), getButtonsHeight());

        background.add(modModButton);
    }
    private void modModButton(){
        modModButton = createButton("Modificar Módulo", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        modModButton.addActionListener(new OptionsController(this));
        modModButton.setBounds(marginHori*2+getButtonsWidth(), marginTitle*2+getButtonsHeight()*3+marginTopLeft*2, getButtonsWidth(), getButtonsHeight());

        background.add(modModButton);
    }
    private void newAsigButton(){
        modAsigButton = createButton("Añadir Asignatura", getButtonsWidth(), getButtonsHeight(), 20, 0x3D5A40, 0xffffff);
        modAsigButton.addActionListener(new OptionsController(this));
        modAsigButton.setBounds(marginHori, marginTitle*2+getButtonsHeight()*4+marginTopLeft*3, getButtonsWidth(), getButtonsHeight());

        background.add(modAsigButton);
    }
    private void modAsigButton(){
        modAsigButton = createButton("Modificar Asignatura", getButtonsWidth(), getButtonsHeight(), 20, 0x3D5A40, 0xffffff);
        modAsigButton.addActionListener(new OptionsController(this));
        modAsigButton.setBounds(marginHori*2+getButtonsWidth(), marginTitle*2+getButtonsHeight()*4+marginTopLeft*3, getButtonsWidth(), getButtonsHeight());

        background.add(modAsigButton);
    }
    private void listAlumButton(){
        listAlumButton = createButton("Alumnos", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        listAlumButton.addActionListener(new OptionsController(this));
        listAlumButton.setBounds(lineWidth+marginHori*4+getButtonsWidth()*2, marginTitle*2+getButtonsHeight()+marginTopRight, getButtonsWidth(), getButtonsHeight());

        background.add(listAlumButton);
    }
    private void listProButton(){
        listProButton = createButton("Profesores", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        listProButton.addActionListener(new OptionsController(this));
        listProButton.setBounds(lineWidth+marginHori*5+getButtonsWidth()*3, marginTitle*2+getButtonsHeight()+marginTopRight, getButtonsWidth(), getButtonsHeight());

        background.add(listProButton);
    }
    private void listModButton(){
        listModButton = createButton("Módulos", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        listModButton.addActionListener(new OptionsController(this));
        listModButton.setBounds(lineWidth+marginHori*4+getButtonsWidth()*2, marginTitle*2+getButtonsHeight()*2+marginTopRight*2, getButtonsWidth(), getButtonsHeight());

        background.add(listModButton);
    }
    private void listAsigButton(){
        listAsigButton = createButton("Asignaturas", getButtonsWidth(), getButtonsHeight(), 22, 0x3D5A40, 0xffffff);
        listAsigButton.addActionListener(new OptionsController(this));
        listAsigButton.setBounds(lineWidth+marginHori*5+getButtonsWidth()*3, marginTitle*2+getButtonsHeight()*2+marginTopRight*2, getButtonsWidth(), getButtonsHeight());

        background.add(listAsigButton);
    }



    //Getters
    public JButton getMatricularButton() {
        return matricularButton;
    }
    public JButton getModAlumButton() {
        return modAlumButton;
    }
    public JButton getNewProButton() {
        return newProButton;
    }
    public JButton getModProButton() {
        return modProButton;
    }
    public JButton getNewModButton() {
        return newModButton;
    }
    public JButton getModModButton() {
        return modModButton;
    }
    public JButton getNewAsigButton() {
        return newAsigButton;
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
    public static int getMarginTopLeft() {
        return marginTopLeft;
    }
    public static int getMarginTopRight() {
        return marginTopRight;
    }
    public static int getMarginTitle() {
        return marginTitle;
    }
    public static int getMarginHori() {
        return marginHori;
    }
    public static int getLineWidth() {
        return lineWidth;
    }
}
