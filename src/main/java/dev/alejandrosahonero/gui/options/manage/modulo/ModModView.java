package dev.alejandrosahonero.gui.options.manage.modulo;

import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.logic.options.manage.modulo.*;
import dev.alejandrosahonero.logic.options.manage.txtController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ModModView extends MainManageView {
    final int marginTitle = 60;
    final int marginHori = 132;
    final int marginVert = 72;

    private JLabel title1, siglas_l, nombre_l, descripcion_l, asignaturas_l;
    private JTextField siglas, nombre;
    private JTextArea descripcion;
    private JButton asignaturasButton, doneButton;
    public ModModView(){
        super("Modificar Módulo");

        searchBar("SIGLAS");
        searchButton(new SearchButtonController(this));
        removeButton(new RmButtonController(this));
    }
    @Override
    protected void initComponents(){
        background = new JLabel(getBackgroundImage());

        titles();
        subTitles();
        data();
        doneButton();

        add(background);
    }
    @Override
    protected void titles(){
        title1 = createTitle("INFORMACIÓN DEL MÓDULO", 50, 0x3D5A40);
        title1.setBounds(marginHori/2, marginTitle, getButtonsWidth()*3, getButtonsHeight());
        background.add(title1);
    }
    @Override
    protected void subTitles(){
        siglas_l = createTitle("SIGLAS", 20, 0x3D5A40);
        siglas_l.setBounds(marginHori, marginTitle*2+getButtonsHeight()/3, getButtonsWidth(), getButtonsHeight());
        background.add(siglas_l);
        nombre_l = createTitle("NOMBRE", 20, 0x3D5A40);
        nombre_l.setBounds(marginHori*2+getButtonsWidth(), marginTitle*2+getButtonsHeight()/3, getButtonsWidth(), getButtonsHeight());
        background.add(nombre_l);
        asignaturas_l = createTitle("ASIGNATURAS", 20, 0x3D5A40);
        asignaturas_l.setBounds(marginHori*3+getButtonsWidth()*2, marginTitle*2+marginVert+getButtonsHeight()/3*4, getButtonsWidth(), getButtonsHeight());
        background.add(asignaturas_l);
        descripcion_l = createTitle("DESCRIPCIÓN", 20, 0x3D5A40);
        descripcion_l.setBounds(marginHori, marginTitle*2+marginVert+getButtonsHeight()/3*4, getButtonsWidth(), getButtonsHeight());
        background.add(descripcion_l);
    }
    private void data(){
        siglas = createTextField("SIGLAS", 15);
        siglas.setBounds(marginHori, marginTitle*2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        siglas.addMouseListener(new txtController());
        background.add(siglas);

        nombre = createTextField("Nombre", 15);
        nombre.setBounds(marginHori*2+getButtonsWidth(), marginTitle*2+getButtonsHeight(), getButtonsWidth()*2+marginHori, getButtonsHeight());
        nombre.addMouseListener(new txtController());
        background.add(nombre);

        asignaturasButton = createButton("Editar Asignaturas", 20, 0x3D5A40, 0xffffff);
        asignaturasButton.setBounds(marginHori*3+getButtonsWidth()*2, marginTitle*2+marginVert+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        asignaturasButton.addActionListener(new AsignaturasButtonController(this));
        background.add(asignaturasButton);

        descripcion = new JTextArea();
        descripcion.setFont(new Font("Tahoma", Font.BOLD, 15));
        descripcion.setLineWrap(true);
        descripcion.setWrapStyleWord(true);
        descripcion.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        descripcion.setBounds(marginHori, marginTitle*2+marginVert+getButtonsHeight()*2, getButtonsWidth()*2+marginHori, getButtonsHeight()*2+marginVert);
        background.add(descripcion);
    }
    private void doneButton(){
        doneButton = createButton("MODIFICAR", 25, 0x3D5A40, 0xffffff);
        doneButton.setBounds(marginHori*3+getButtonsWidth()*2, marginTitle*2+marginVert*2+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        doneButton.addActionListener(new ModModButtonController(this));
        background.add(doneButton);
    }
    @Override
    protected void searchBar(String name){
        searchBar = createTextField(name, 15);
        searchBar.setBounds(marginHori+getButtonsWidth()*3, marginTitle*3/2, getButtonsWidth()/2, getButtonsHeight()/2);
        searchBar.addMouseListener(new txtController());
        background.add(searchBar);
    }
    @Override
    protected void searchButton(ActionListener actionListener){
        searchButton = createButton("BUSQ",15, 0x3D5A40, 0xffffff);
        searchButton.setBounds(marginHori+getButtonsWidth()*3+getButtonsWidth()/2, marginTitle*3/2, getButtonsWidth()/3, getButtonsHeight()/2);
        searchButton.addActionListener(actionListener);
        background.add(searchButton);
    }
    @Override
    protected void removeButton(ActionListener actionListener){
        removeButton = createButton("ELIMINAR",15, 0xd11507, 0xffffff);
        removeButton.setBounds(marginHori*3+getButtonsWidth()*2,marginTitle*2+getButtonsHeight()*3+marginVert*3, getButtonsWidth(), getButtonsHeight()/2);
        removeButton.addActionListener(actionListener);
        background.add(removeButton);
    }

    //Getters
    public JTextField getSiglas() {
        return siglas;
    }
    public JTextField getNombre() {
        return nombre;
    }
    public JTextArea getDescripcion() {
        return descripcion;
    }
}
