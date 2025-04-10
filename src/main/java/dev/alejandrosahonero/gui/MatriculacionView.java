package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.PhotoButtonController;

import javax.swing.*;
import java.awt.*;

public class MatriculacionView extends MainView
{
    private JLabel background, labelPhoto;
    private JPanel imagePanel, personalInformationPanel;
    private JButton photoButton;
    private JTextField nombre, apellido, email, telefono;
    private ImageIcon photo = new ImageIcon("src/main/resources/img/photo-default.jpg");

    public MatriculacionView()
    {
        super("Matriculacion");

        initComponents();
    }
    private void initComponents()
    {
        background = new JLabel(getBackgroundImage());

        imagePanel();
        personalInformation();

        add(background, BorderLayout.CENTER);
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
        background.add(personalInformationPanel);
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
        background.add(imagePanel);
    }

    public void setPhoto(ImageIcon photoChossed) {
        this.photo = new ImageIcon(photoChossed.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH));
        labelPhoto.setIcon(photo);
        revalidate();
    }
}
