package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    ImageIcon icon, background;
    JButton login = new JButton("Iniciar");
    public LoginView() {
        setTitle("CO-Gestor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(1255, 800);
        setLayout(new BorderLayout());
        initComponents();
    }
    public void initComponents() {
        imagesSettings();
        loginButton();
    }
    public void imagesSettings() {
        icon = new ImageIcon("src/main/resources/img/icon-comercio.png");
        setIconImage(icon.getImage());
        ImageIcon background = new ImageIcon("src/main/resources/img/background-comercio.jpg");
        background.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        add(new JLabel(background), BorderLayout.CENTER);
    }
    public void loginButton(){
        JPanel loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginPanel.setPreferredSize(new Dimension(0, 100));
        login.setPreferredSize(new Dimension(50, 50));
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setVerticalAlignment(SwingConstants.CENTER);
        loginPanel.add(login);
        add(loginPanel, BorderLayout.SOUTH);
    }
}
