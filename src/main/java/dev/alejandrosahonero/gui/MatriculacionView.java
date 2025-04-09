package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.PhotoButtonController;

import javax.swing.*;
import java.awt.*;

public class MatriculacionView extends JFrame {
    private JPanel imagePanel;
    private ImageIcon photo;
    private JButton photoButton;
    private JFileChooser photoChooser;

    public MatriculacionView() {
        setTitle("Matriculacion");
        setSize(1152, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        initComponents();
    }
    private void initComponents() {
        imagePanel();
    }
    private void imagePanel() {
        imagePanel = new JPanel(new BorderLayout());
        imagePanel.setBackground(Color.GRAY);
        imagePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        photo = new ImageIcon("src/main/resources/img/photo-default.jpg");
        photo = new ImageIcon(photo.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH));
        imagePanel.add(new JLabel(photo), BorderLayout.CENTER);

        photoButton = new JButton("Escoger imagen");
        photoButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        photoButton.setVerticalAlignment(SwingConstants.CENTER);
        photoButton.setHorizontalAlignment(SwingConstants.CENTER);
        photoButton.addActionListener(new PhotoButtonController(this));
        imagePanel.add(photoButton, BorderLayout.SOUTH);

        add(imagePanel, BorderLayout.CENTER);
    }
    public void setPhoto(ImageIcon image) {
        photo = image;
        photo = new ImageIcon(photo.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH));
        imagePanel.add(new JLabel(photo), BorderLayout.CENTER);
    }
}
