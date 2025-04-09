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
    private ImageIcon photo = new ImageIcon("src/main/resources/img/photo-default.jpg");

    public MatriculacionView()
    {
        setTitle("Matriculacion");
        setSize(1152, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setLayout(new BorderLayout());

        initComponents();
    }
    private void initComponents()
    {
        imagePanel();
        personalInformation();
    }
    private void personalInformation(){
        personalInformationPanel = new JPanel(new GridLayout(2,2));
        personalInformationPanel.setPreferredSize(new Dimension(0, 100));

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

        add(personalInformationPanel, BorderLayout.NORTH);
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

        add(imagePanel, BorderLayout.CENTER);
    }

    public void setPhoto(ImageIcon photoChossed) {
        this.photo = new ImageIcon(photoChossed.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH));
        labelPhoto.setIcon(photo);
        revalidate();
    }
}
