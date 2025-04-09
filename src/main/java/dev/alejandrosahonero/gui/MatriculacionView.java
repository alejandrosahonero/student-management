package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.PhotoButtonController;

import javax.swing.*;
import java.awt.*;

public class MatriculacionView extends JFrame
{
    private JPanel imagePanel, personalInformationPanel;
    private JButton photoButton;
    private JTextField nombre, apellido, email, telefono;
    private JLabel labelPhoto;
    private ImageIcon background, photo = new ImageIcon("src/main/resources/img/photo-default.jpg");

    public MatriculacionView()
    {
        setTitle("Matriculacion");
        setSize(1152, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(null);

        initComponents();
    }
    private void initComponents()
    {
        backgroundImage();
        imagePanel();
        personalInformation();
    }
    private void backgroundImage() {
        background = new ImageIcon("src/main/resources/img/background-windows.png");
        background = new ImageIcon(background.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));

        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, this.getWidth(), this.getHeight());

        add(backgroundLabel);
    }
    private void personalInformation(){
        personalInformationPanel = new JPanel(new GridLayout(2,2));

        nombre = new JTextField("Nombre");
        nombre.setPreferredSize(new Dimension(200, 30));
        personalInformationPanel.add(nombre);

        apellido = new JTextField("Apellido");
        apellido.setPreferredSize(new Dimension(200, 30));
        personalInformationPanel.add(apellido);

        email = new JTextField("Email");
        email.setPreferredSize(new Dimension(200, 30));
        personalInformationPanel.add(email);

        telefono = new JTextField("Telefono");
        telefono.setPreferredSize(new Dimension(200, 30));
        personalInformationPanel.add(telefono);

        personalInformationPanel.setBounds(0, 0, this.getWidth()/2, this.getHeight()/2);
        add(personalInformationPanel);
    }
    private void imagePanel()
    {
        imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.GRAY);

        labelPhoto = new JLabel(photo);
        imagePanel.add(labelPhoto, BorderLayout.CENTER);

        photoButton = new JButton("Escoger imagen");
        photoButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        photoButton.setVerticalAlignment(SwingConstants.CENTER);
        photoButton.setHorizontalAlignment(SwingConstants.CENTER);
        photoButton.addActionListener(new PhotoButtonController(this));
        imagePanel.add(photoButton, BorderLayout.SOUTH);

        imagePanel.setBounds(250, 250, this.getWidth()/2, this.getHeight()/2);
        add(imagePanel);
    }

    public void setPhoto(ImageIcon photoChossed) {
        this.photo = new ImageIcon(photoChossed.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH));
        labelPhoto.setIcon(photo);
        revalidate();
    }
}
