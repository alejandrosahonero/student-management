package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    //Tamaño de la ventana de inicio
    final int windowWidth=1200;
    final int windowHeight=700;
    //Tamaño del boton
    final int loginButtonWidth=150;
    final int loginButtonHeight=70;
    //Tamaño del contenedor del boton
    final int loginPanelWidth=0;
    final int loginPanelHeight=110;
    ImageIcon icon, background;
    JPanel loginPanel;
    JButton login;
    public LoginView() {
        setTitle("CO-Gestor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(windowWidth, windowHeight);
        setLayout(new BorderLayout());
        initComponents();
    }
    public void initComponents() {
        WindowIcon();
        loginButton();
        BackgroundImage();
    }
    public void WindowIcon(){
        icon = new ImageIcon("src/main/resources/img/icon-comercio.png");
        setIconImage(icon.getImage());
    }
    public void loginButton(){
        login = new JButton("Iniciar");
        login.setFont(new Font("Arial", Font.BOLD, 20));
        login.setPreferredSize(new Dimension(loginButtonWidth, loginButtonHeight));
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setVerticalAlignment(SwingConstants.CENTER);
        loginPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        loginPanel.setPreferredSize(new Dimension(loginPanelWidth, loginPanelHeight));
        loginPanel.add(login);
        add(loginPanel, BorderLayout.SOUTH);
    }
    public void BackgroundImage() {
        background = new ImageIcon("src/main/resources/img/background-comercio.jpg");
        background = new ImageIcon(background.getImage().getScaledInstance(windowWidth, windowHeight-loginButtonHeight-loginButtonHeight, Image.SCALE_SMOOTH));
        JLabel backgroundLabel = new JLabel(background);
        add(backgroundLabel, BorderLayout.CENTER);
    }
}
