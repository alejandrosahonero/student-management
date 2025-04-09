package dev.alejandrosahonero.gui;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.FileFilter;

public class MatriculacionView extends JFrame {
    private JPanel imagePanel;
    private ImageIcon photo;
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

        photoChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg, jpeg, png", "jpg", "jpeg", "png");
        photoChooser.setFileFilter(filter);
        photoChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);


        imagePanel.add(photoChooser, BorderLayout.SOUTH);

        add(imagePanel, BorderLayout.CENTER);
    }
}
