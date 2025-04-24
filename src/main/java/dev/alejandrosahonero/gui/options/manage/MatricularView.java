package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.PhotoButtonController;

import javax.swing.*;
import java.awt.*;

public class MatricularView extends MainView
{
    final int photoWidth = 233;
    final int photoHeight = 300;
    final int margin = 50;

    private JLabel background, labelPhoto, title1, title2;
    private JPanel imagePanel;
    private JButton photoButton, matricularButton;
    private JTextField dni, apellidoPaterno, apellidoMaterno, nombres, fechaNac, sexo, modulo, nuss, email, telefono;
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
        dni.setBounds(margin, margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        background.add(dni);

        apellidoPaterno = new JTextField("Apellido Paterno");
        apellidoPaterno.setHorizontalAlignment(SwingConstants.CENTER);
        apellidoPaterno.setBounds(margin*2+getButtonsWidth(), margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        background.add(apellidoPaterno);

        apellidoMaterno = new JTextField("Apellido Materno");
        apellidoMaterno.setHorizontalAlignment(SwingConstants.CENTER);
        apellidoMaterno.setBounds(margin*3+getButtonsWidth()*2, margin*3/2+getButtonsHeight(), getButtonsWidth(), getButtonsHeight());
        background.add(apellidoMaterno);

        nombres = new JTextField("Nombres");
        nombres.setHorizontalAlignment(SwingConstants.CENTER);
        nombres.setBounds(margin, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        background.add(nombres);

        fechaNac = new JTextField("Fecha Nacimiento");
        fechaNac.setHorizontalAlignment(SwingConstants.CENTER);
        fechaNac.setBounds(margin*2+getButtonsWidth(), margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        background.add(fechaNac);

        sexo = new JTextField("Sexo");
        sexo.setHorizontalAlignment(SwingConstants.CENTER);
        sexo.setBounds(margin*3+getButtonsWidth()*2, margin*3+getButtonsHeight()*2, getButtonsWidth(), getButtonsHeight());
        background.add(sexo);
    }
    private void academicInformation(){
        modulo = new JTextField("Modulo");
        modulo.setHorizontalAlignment(SwingConstants.CENTER);
        modulo.setBounds(margin, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        background.add(modulo);

        nuss = new JTextField("NUSS");
        nuss.setHorizontalAlignment(SwingConstants.CENTER);
        nuss.setBounds(margin*2+getButtonsWidth(), margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        background.add(nuss);

        email = new JTextField("Email");
        email.setHorizontalAlignment(SwingConstants.CENTER);
        email.setBounds(margin*3+getButtonsWidth()*2, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
        background.add(email);

        telefono = new JTextField("Telefono");
        telefono.setHorizontalAlignment(SwingConstants.CENTER);
        telefono.setBounds(margin*4+getButtonsWidth()*3, margin*6+getButtonsHeight()*3, getButtonsWidth(), getButtonsHeight());
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

        background.add(matricularButton);
    }

    public void setPhoto(ImageIcon photoChossed) {
        this.photo = new ImageIcon(photoChossed.getImage().getScaledInstance(photoWidth, photoHeight, Image.SCALE_SMOOTH));
        labelPhoto.setIcon(photo);
        revalidate();
    }
}
