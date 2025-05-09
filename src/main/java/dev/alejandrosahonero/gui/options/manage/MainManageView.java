package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.modulo.ModModButtonController;
import dev.alejandrosahonero.logic.options.manage.txtController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.List;

public abstract class MainManageView extends MainView {
    final int photoWidth = 194;
    final int photoHeight = 250;
    final int margin = getMargin();

    protected JLabel background, labelPhoto, title1, title2, dni_l, apellidoPaterno_l, apellidoMaterno_l, nombres_l, fechaNac_l, sexo_l, modulo_l, nuss_l, email_l, telefono_l;
    protected JButton photoButton, doneButton, searchButton, removeButton;
    protected JTextField dni, apellidoPaterno, apellidoMaterno, nombres, fechaNac, sexo, nuss, email, telefono, searchBar;
    protected JComboBox modulo;
    protected ImageIcon photo;

    public MainManageView(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        initComponents();
    }
    private void initComponents(){
        background = new JLabel(getBackgroundImage());

        imagePanel();
        titles();
        subTitles();
        personalInformation();
        academicInformation();

        add(background, BorderLayout.CENTER);
    }
    private void titles(){
        title1 = new JLabel("INFORMACIÓN PERSONAL");
        title1.setFont(new Font("Tahoma", Font.BOLD, 50));
        title1.setForeground(new Color(0x3D5A40));
        title1.setHorizontalAlignment(SwingConstants.LEFT);
        title1.setVerticalAlignment(SwingConstants.TOP);
        title1.setBounds(margin/2, margin, getButtonsWidth()*3, getButtonsHeight());
        background.add(title1);

        title2 = new JLabel("INFORMACIÓN ACADÉMICA");
        title2.setFont(new Font("Tahoma", Font.BOLD, 50));
        title2.setForeground(new Color(0x3D5A40));
        title2.setHorizontalAlignment(SwingConstants.LEFT);
        title2.setVerticalAlignment(SwingConstants.CENTER);
        title2.setBounds(margin/2, margin*7/2+getButtonsHeight()*3, getButtonsWidth()*3, getButtonsHeight());
        background.add(title2);
    }
    private void subTitles(){
        dni_l = createTitle("DNI", 20, 0x3D5A40);
        dni_l.setBounds(margin, margin*2, getButtonsWidth(), getButtonsHeight());
        background.add(dni_l);
        apellidoPaterno_l = createTitle("APELLIDO PATERNO", 20, 0x3D5A40);
        apellidoPaterno_l.setBounds(margin*2+getButtonsWidth(), margin*2, getButtonsWidth(), getButtonsHeight());
        background.add(apellidoPaterno_l);
        apellidoMaterno_l = createTitle("APELLIDO MATERNO", 20, 0x3D5A40);
        apellidoMaterno_l.setBounds(margin*3+getButtonsWidth()*2, margin*2, getButtonsWidth(), getButtonsHeight());
        background.add(apellidoMaterno_l);
        nombres_l = createTitle("NOMBRES", 20, 0x3D5A40);
        nombres_l.setBounds(margin, margin*5, getButtonsWidth(), getButtonsHeight());
        background.add(nombres_l);
        fechaNac_l = createTitle("FECHA DE NACIMIENTO", 20, 0x3D5A40);
        fechaNac_l.setBounds(margin*2+getButtonsWidth(), margin*5, getButtonsWidth(), getButtonsHeight());
        background.add(fechaNac_l);
        sexo_l = createTitle("SEXO", 20, 0x3D5A40);
        sexo_l.setBounds(margin*3+getButtonsWidth()*2, margin*5, getButtonsWidth(), getButtonsHeight());
        background.add(sexo_l);
        modulo_l = createTitle("MODULO", 20, 0x3D5A40);
        modulo_l.setBounds(margin, margin*29/3, getButtonsWidth(), getButtonsHeight());
        background.add(modulo_l);
        nuss_l = createTitle("NUSS", 20, 0x3D5A40);
        nuss_l.setBounds(margin*2+getButtonsWidth(), margin*29/3, getButtonsWidth(), getButtonsHeight());
        background.add(nuss_l);
        email_l = createTitle("EMAIL", 20, 0x3D5A40);
        email_l.setBounds(margin*3+getButtonsWidth()*2, margin*29/3, getButtonsWidth(), getButtonsHeight());
        background.add(email_l);
        telefono_l = createTitle("TELÉFONO", 20, 0x3D5A40);
        telefono_l.setBounds(margin*4+getButtonsWidth()*3, margin*29/3, getButtonsWidth(), getButtonsHeight());
        background.add(telefono_l);
    }
    private void personalInformation(){
        dni = createTextField("DNI", 15);
        dni.setBounds(margin, margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        dni.addMouseListener(new txtController());
        background.add(dni);

        apellidoPaterno = createTextField("APELLIDO PATERNO", 15);
        apellidoPaterno.setBounds(margin*2+getButtonsWidth(), margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        apellidoPaterno.addMouseListener(new txtController());
        background.add(apellidoPaterno);

        apellidoMaterno = createTextField("APELLIDO MATERNO", 15);
        apellidoMaterno.setBounds(margin*3+getButtonsWidth()*2, margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        apellidoMaterno.addMouseListener(new txtController());
        background.add(apellidoMaterno);

        nombres = createTextField("NOMBRES", 15);
        nombres.setBounds(margin, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        nombres.addMouseListener(new txtController());
        background.add(nombres);

        fechaNac = createTextField("AAAA-MM-DD", 15);
        fechaNac.setBounds(margin*2+getButtonsWidth(), margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        fechaNac.addMouseListener(new txtController());
        background.add(fechaNac);

        sexo = createTextField("SEXO", 15);
        sexo.setBounds(margin*3+getButtonsWidth()*2, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        sexo.addMouseListener(new txtController());
        background.add(sexo);
    }
    protected void academicInformation(){
        modulo = new JComboBox();
        List<String> modulos = ModModButtonController.getAllModulos();
        for (Object m : modulos.toArray())
            modulo.addItem(m);
        modulo.setFont(new Font("Tahoma", Font.BOLD, 15));
        modulo.setBounds(margin, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        background.add(modulo);

        nuss = createTextField("NUSS", 15);
        nuss.setBounds(margin*2+getButtonsWidth(), margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        nuss.addMouseListener(new txtController());
        background.add(nuss);

        email = createTextField("EMAIL", 15);
        email.setBounds(margin*3+getButtonsWidth()*2, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        email.addMouseListener(new txtController());
        background.add(email);

        telefono = createTextField("TELÉFONO", 15);
        telefono.setBounds(margin*4+getButtonsWidth()*3, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        telefono.addMouseListener(new txtController());
        background.add(telefono);
    }
    private void imagePanel()
    {
        photo = new ImageIcon("src/main/resources/img/photo-default.jpg");
        photo = new ImageIcon(photo.getImage().getScaledInstance(photoWidth, photoHeight, Image.SCALE_SMOOTH));

        labelPhoto = new JLabel(photo);
        labelPhoto.setBounds(margin*5+getButtonsWidth()*3, margin, photoWidth, photoHeight);
        background.add(labelPhoto);

        photoButton = createButton("Escoger imagen", 15, 0x3D5A40, 0xffffff);
        //photoButton.addActionListener(new PhotoButtonController(this));
        photoButton.setBounds(margin*5+getButtonsWidth()*3, margin+photoHeight, photoWidth, 30);
        background.add(photoButton);
    }
    public void setPhoto(ImageIcon photoChossed) {
        this.photo = new ImageIcon(photoChossed.getImage().getScaledInstance(photoWidth, photoHeight, Image.SCALE_SMOOTH));
        labelPhoto.setIcon(photo);
        revalidate();
    }
    protected void doneButton(String nameButton, ActionListener actionListener){
        doneButton = createButton(nameButton,25, 0x3D5A40, 0xffffff);
        doneButton.setBounds(margin*9/2+getButtonsWidth()*3, margin*5/2+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        doneButton.addActionListener(actionListener);
        background.add(doneButton);
    }
    protected void searchBar(String name){
        searchBar = createTextField(name, 15);
        searchBar.setBounds(getWindowsWidth()/2+margin*2, margin+margin/3, getButtonsWidth()/2, getButtonsHeight()/2);
        searchBar.addMouseListener(new txtController());
        background.add(searchBar);
    }
    protected void searchButton(ActionListener actionListener){
        searchButton = createButton("BUSQ",15, 0x3D5A40, 0xffffff);
        searchButton.setBounds(getWindowsWidth()/2+margin*2+getButtonsWidth()/2, margin+margin/3, getButtonsWidth()/3, getButtonsHeight()/2);
        searchButton.addActionListener(actionListener);
        background.add(searchButton);
    }
    protected void removeButton(ActionListener actionListener){
        removeButton = createButton("ELIMINAR",15, 0xd11507, 0xffffff);
        removeButton.setBounds(margin*9/2+getButtonsWidth()*3,margin*5/2+getButtonsHeight()*4, getButtonsWidth(), getButtonsHeight()/2);
        removeButton.addActionListener(actionListener);
        background.add(removeButton);
    }

    //Getters
    public JTextField getDni() {
        return dni;
    }
    public JTextField getApellidoPaterno() {
        return apellidoPaterno;
    }
    public JTextField getApellidoMaterno() {
        return apellidoMaterno;
    }
    public JTextField getNombres() {
        return nombres;
    }
    public JTextField getFechaNac() {
        return fechaNac;
    }
    public JTextField getSexo() {
        return sexo;
    }
    public JComboBox getModulo() {
        return modulo;
    }
    public JTextField getNuss() {
        return nuss;
    }
    public JTextField getEmail() {
        return email;
    }
    public JTextField getTelefono() {
        return telefono;
    }
    public JButton getDoneButton() {
        return doneButton;
    }
    public JTextField getSearchBar() {
        return searchBar;
    }
    public JButton getSearchButton() {
        return searchButton;
    }
}
