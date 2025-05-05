package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.modulo.ModModController;
import dev.alejandrosahonero.logic.options.manage.alumno.txtController;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public abstract class MainManageView extends MainView {
    final int photoWidth = 233;
    final int photoHeight = 300;
    final int margin = 50;

    protected JLabel background, labelPhoto, title1, title2;
    protected JPanel imagePanel;
    protected JButton photoButton, doneButton, searchButton;
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
        personalInformation();
        academicInformation();

        add(background, BorderLayout.CENTER);
    }
    private void titles(){
        title1 = new JLabel("INFORMACIÓN PERSONAL");
        title1.setFont(new Font("Tahoma", Font.BOLD, 50));
        title1.setForeground(new Color(0x3D5A40));
        title1.setHorizontalAlignment(SwingConstants.LEFT);
        title1.setVerticalAlignment(SwingConstants.CENTER);
        title1.setBounds(margin/2, margin, getButtonsWidth()*3, getButtonsHeight());
        background.add(title1);

        title2 = new JLabel("INFORMACIÓN ACADÉMICA");
        title2.setFont(new Font("Tahoma", Font.BOLD, 50));
        title2.setForeground(new Color(0x3D5A40));
        title2.setHorizontalAlignment(SwingConstants.LEFT);
        title2.setVerticalAlignment(SwingConstants.CENTER);
        title2.setBounds(margin/2, photoHeight+margin*5/2, getButtonsWidth()*3, getButtonsHeight());
        background.add(title2);
    }
    private void personalInformation(){
        dni = new JTextField("DNI");
        dni.setHorizontalAlignment(SwingConstants.CENTER);
        dni.setBackground(Color.WHITE);
        dni.setBounds(margin, margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        dni.addMouseListener(new txtController());
        background.add(dni);

        apellidoPaterno = new JTextField("Apellido Paterno");
        apellidoPaterno.setHorizontalAlignment(SwingConstants.CENTER);
        apellidoPaterno.setBackground(Color.WHITE);
        apellidoPaterno.setBounds(margin*2+getButtonsWidth(), margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        apellidoPaterno.addMouseListener(new txtController());
        background.add(apellidoPaterno);

        apellidoMaterno = new JTextField("Apellido Materno");
        apellidoMaterno.setHorizontalAlignment(SwingConstants.CENTER);
        apellidoMaterno.setBackground(Color.WHITE);
        apellidoMaterno.setBounds(margin*3+getButtonsWidth()*2, margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        apellidoMaterno.addMouseListener(new txtController());
        background.add(apellidoMaterno);

        nombres = new JTextField("Nombres");
        nombres.setHorizontalAlignment(SwingConstants.CENTER);
        nombres.setBackground(Color.WHITE);
        nombres.setBounds(margin, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        nombres.addMouseListener(new txtController());
        background.add(nombres);

        fechaNac = new JTextField("Fecha Nacimiento");
        fechaNac.setHorizontalAlignment(SwingConstants.CENTER);
        fechaNac.setBackground(Color.WHITE);
        fechaNac.setBounds(margin*2+getButtonsWidth(), margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        fechaNac.addMouseListener(new txtController());
        background.add(fechaNac);

        sexo = new JTextField("Sexo");
        sexo.setHorizontalAlignment(SwingConstants.CENTER);
        sexo.setBackground(Color.WHITE);
        sexo.setBounds(margin*3+getButtonsWidth()*2, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        sexo.addMouseListener(new txtController());
        background.add(sexo);
    }
    private void academicInformation(){
        modulo = new JComboBox();
        List<String> modulos = ModModController.getAllModulos();
        for (Object m : modulos.toArray())
            modulo.addItem(m);
        modulo.setBounds(0,0,getButtonsWidth(),getButtonsHeight());
        modulo.setBackground(Color.WHITE);
        modulo.setBounds(margin, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        background.add(modulo);

        nuss = new JTextField("NUSS");
        nuss.setHorizontalAlignment(SwingConstants.CENTER);
        nuss.setBackground(Color.WHITE);
        nuss.setBounds(margin*2+getButtonsWidth(), margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        nuss.addMouseListener(new txtController());
        background.add(nuss);

        email = new JTextField("Email");
        email.setHorizontalAlignment(SwingConstants.CENTER);
        email.setBackground(Color.WHITE);
        email.setBounds(margin*3+getButtonsWidth()*2, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        email.addMouseListener(new txtController());
        background.add(email);

        telefono = new JTextField("Telefono");
        telefono.setHorizontalAlignment(SwingConstants.CENTER);
        telefono.setBackground(Color.WHITE);
        telefono.setBounds(margin*4+getButtonsWidth()*3, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        telefono.addMouseListener(new txtController());
        background.add(telefono);
    }
    private void imagePanel()
    {
        imagePanel = new JPanel(new BorderLayout());

        photo = new ImageIcon("src/main/resources/img/photo-default.jpg");
        photo = new ImageIcon(photo.getImage().getScaledInstance(photoWidth, photoHeight, Image.SCALE_SMOOTH));
        labelPhoto = new JLabel(photo);
        imagePanel.add(labelPhoto, BorderLayout.CENTER);

        photoButton = createButton("Escoger imagen", 0, 30, 15, 0x3D5A40, 0xffffff);
        //photoButton.addActionListener(new PhotoButtonController(this));
        imagePanel.add(photoButton, BorderLayout.SOUTH);

        imagePanel.setBounds(margin*9/2+getButtonsWidth()*3, margin, photoWidth, photoHeight+photoButton.getHeight());
        background.add(imagePanel);
    }
    protected void doneButton(String nameButton){
        doneButton = createButton(nameButton, 0, 0, 20, 0x3D5A40, 0xffffff);
        doneButton.setBounds(margin*13/3+getButtonsWidth()*3, margin*2+photoHeight, getButtonsWidth(), getButtonsHeight());
        //doneButton.addActionListener(new Controller(this));

        background.add(doneButton);
    }
    public void setPhoto(ImageIcon photoChossed) {
        this.photo = new ImageIcon(photoChossed.getImage().getScaledInstance(photoWidth, photoHeight, Image.SCALE_SMOOTH));
        labelPhoto.setIcon(photo);
        revalidate();
    }
    protected void searchBar(){
        searchBar = new JTextField("ID");
        searchBar.setHorizontalAlignment(SwingConstants.CENTER);
        searchBar.setBackground(Color.WHITE);
        searchBar.setBounds(getWindowsWidth()/2+margin*2, margin+margin/2, getButtonsWidth()/2, getButtonsHeight()/2);
        searchBar.addMouseListener(new txtController());
        background.add(searchBar);
    }
    protected void searchButton(){
        searchButton = createButton("BUSQ", getButtonsWidth()/20, getButtonsHeight()/2, 15, 0x3D5A40, 0xffffff);
        searchButton.setBounds(getWindowsWidth()/2+margin*2+getButtonsWidth()/2, margin+margin/2, getButtonsWidth()/3, getButtonsHeight()/2);
        background.add(searchButton);
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
