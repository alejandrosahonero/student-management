package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.ModModController;
import dev.alejandrosahonero.logic.options.manage.matricular.MatricularButtonController;
import dev.alejandrosahonero.logic.options.manage.PhotoButtonController;
import dev.alejandrosahonero.logic.options.manage.matricular.txtController;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Objects;

public class MatricularView extends MainView
{
    final int photoWidth = 233;
    final int photoHeight = 300;
    final int margin = 50;

    private JLabel background, labelPhoto, title1, title2;
    private JPanel imagePanel;
    private JButton photoButton, matricularButton;
    private JTextField dni, apellidoPaterno, apellidoMaterno, nombres, fechaNac, sexo, nuss, email, telefono;
    private JComboBox modulo;
    private ImageIcon photo;

    public MatricularView()
    {
        super("Matriculacion");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        initComponents();
    }
    private void initComponents()
    {
        background = new JLabel(getBackgroundImage());

        imagePanel();
        matricularButton();
        titles();
        personalInformation();
        academicInformation();

        add(background, BorderLayout.CENTER);
    }
    private void titles(){
        title1 = new JLabel("INFORMACIÓN PERSONAL");
        title1.setFont(new Font("Tahoma", Font.BOLD, 50));
        title1.setForeground(new Color(0x3D5A40));
        title1.setHorizontalAlignment(SwingConstants.CENTER);
        title1.setVerticalAlignment(SwingConstants.CENTER);
        title1.setBounds(margin, margin, getButtonsWidth()*3, getButtonsHeight());
        background.add(title1);

        title2 = new JLabel("INFORMACIÓN ACADÉMICA");
        title2.setFont(new Font("Tahoma", Font.BOLD, 50));
        title2.setForeground(new Color(0x3D5A40));
        title2.setHorizontalAlignment(SwingConstants.CENTER);
        title2.setVerticalAlignment(SwingConstants.CENTER);
        title2.setBounds(margin, photoHeight+margin*5/2, getButtonsWidth()*3, getButtonsHeight());
        background.add(title2);
    }
    private void personalInformation(){
        dni = new JTextField("DNI");
        dni.setHorizontalAlignment(SwingConstants.CENTER);
        dni.setBackground(Color.WHITE);
        dni.setBounds(margin, margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        dni.addMouseListener(new txtController(this));
        background.add(dni);

        apellidoPaterno = new JTextField("Apellido Paterno");
        apellidoPaterno.setHorizontalAlignment(SwingConstants.CENTER);
        apellidoPaterno.setBackground(Color.WHITE);
        apellidoPaterno.setBounds(margin*2+getButtonsWidth(), margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        apellidoPaterno.addMouseListener(new txtController(this));
        background.add(apellidoPaterno);

        apellidoMaterno = new JTextField("Apellido Materno");
        apellidoMaterno.setHorizontalAlignment(SwingConstants.CENTER);
        apellidoMaterno.setBackground(Color.WHITE);
        apellidoMaterno.setBounds(margin*3+getButtonsWidth()*2, margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        apellidoMaterno.addMouseListener(new txtController(this));
        background.add(apellidoMaterno);

        nombres = new JTextField("Nombres");
        nombres.setHorizontalAlignment(SwingConstants.CENTER);
        nombres.setBackground(Color.WHITE);
        nombres.setBounds(margin, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        nombres.addMouseListener(new txtController(this));
        background.add(nombres);

        fechaNac = new JTextField("Fecha Nacimiento");
        fechaNac.setHorizontalAlignment(SwingConstants.CENTER);
        fechaNac.setBackground(Color.WHITE);
        fechaNac.setBounds(margin*2+getButtonsWidth(), margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        fechaNac.addMouseListener(new txtController(this));
        background.add(fechaNac);

        sexo = new JTextField("Sexo");
        sexo.setHorizontalAlignment(SwingConstants.CENTER);
        sexo.setBackground(Color.WHITE);
        sexo.setBounds(margin*3+getButtonsWidth()*2, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        sexo.addMouseListener(new txtController(this));
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
        nuss.addMouseListener(new txtController(this));
        background.add(nuss);

        email = new JTextField("Email");
        email.setHorizontalAlignment(SwingConstants.CENTER);
        email.setBackground(Color.WHITE);
        email.setBounds(margin*3+getButtonsWidth()*2, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        email.addMouseListener(new txtController(this));
        background.add(email);

        telefono = new JTextField("Telefono");
        telefono.setHorizontalAlignment(SwingConstants.CENTER);
        telefono.setBackground(Color.WHITE);
        telefono.setBounds(margin*4+getButtonsWidth()*3, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        telefono.addMouseListener(new txtController(this));
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
        photoButton.addActionListener(new PhotoButtonController(this));
        imagePanel.add(photoButton, BorderLayout.SOUTH);

        imagePanel.setBounds(margin*9/2+getButtonsWidth()*3, margin, photoWidth, photoHeight+photoButton.getHeight());
        background.add(imagePanel);
    }
    private void matricularButton(){
        matricularButton = createButton("MATRICULAR", 0, 0, 20, 0x3D5A40, 0xffffff);
        matricularButton.setBounds(margin*13/3+getButtonsWidth()*3, margin*2+photoHeight, getButtonsWidth(), getButtonsHeight());
        matricularButton.addActionListener(new MatricularButtonController(this));

        background.add(matricularButton);
    }
    public void setPhoto(ImageIcon photoChossed) {
        this.photo = new ImageIcon(photoChossed.getImage().getScaledInstance(photoWidth, photoHeight, Image.SCALE_SMOOTH));
        labelPhoto.setIcon(photo);
        revalidate();
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
    public JButton getMatricularButton() {
        return matricularButton;
    }
}
