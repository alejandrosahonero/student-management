package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.PhotoButtonController;

import javax.swing.*;
import java.awt.*;

public class MatricularView extends MainView
{
    final int photoWidth = 233;
    final int photoHeight = 300;

    private JLabel background, labelPhoto;
    private JPanel imagePanel, personalInformationPanel;
    private JButton photoButton;
    private JTextField nombre, apellido, email, telefono;
    private ImageIcon photo;

    public MatricularView()
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

        personalInformationPanel.setBounds(300, 300, 500, 300);
        background.add(personalInformationPanel);
    }
    private void imagePanel()
    {
        imagePanel = new JPanel(new BorderLayout());

        photo = new ImageIcon("src/main/resources/img/photo-default.jpg");
        photo = new ImageIcon(photo.getImage().getScaledInstance(photoWidth, photoHeight, Image.SCALE_SMOOTH));
        labelPhoto = new JLabel(photo);
        imagePanel.add(labelPhoto, BorderLayout.CENTER);

        photoButton = new JButton("Escoger imagen");
        photoButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        photoButton.setVerticalAlignment(SwingConstants.CENTER);
        photoButton.setHorizontalAlignment(SwingConstants.CENTER);
        photoButton.setSize(0, 30);
        photoButton.addActionListener(new PhotoButtonController(this));
        imagePanel.add(photoButton, BorderLayout.SOUTH);

        imagePanel.setBounds(50, 50, photoWidth, photoHeight+photoButton.getHeight());
        background.add(imagePanel);
    }

    public void setPhoto(ImageIcon photoChossed) {
        this.photo = new ImageIcon(photoChossed.getImage().getScaledInstance(photoWidth, photoHeight, Image.SCALE_SMOOTH));
        labelPhoto.setIcon(photo);
        revalidate();
    }
}
