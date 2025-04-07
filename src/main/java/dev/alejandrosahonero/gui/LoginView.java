package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    //Tamaño de la ventana de inicio
    final int windowWidth=1152;
    final int windowHeight=768;
    //Tamaño del boton
    final int loginButtonWidth=180;
    final int loginButtonHeight=90;

    JLayeredPane loginPanel;
    ImageIcon icon, background;
    JButton loginButton;

    public LoginView() {
        setTitle("CO-Gestor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(windowWidth, windowHeight);
        setLayout(null);
        setBackground(new Color(0xCCCCCC));
        initComponents();
    }

    /**
     * Método que inicializa todos los demás métodos para aligerar la carga al constructor
     */
    public void initComponents() {
        loginPanel = getLayeredPane();
        loginPanel.setBounds(0, 0, windowWidth, windowHeight);
        WindowIcon();
        BackgroundImage();
        loginButton();
    }

    /**
     * Establece el ícono de la ventana y de la aplicación
     */
    public void WindowIcon(){
        icon = new ImageIcon("src/main/resources/img/icon-comercio.png");
        setIconImage(icon.getImage());
    }

    /**
     * Establece la imagen de fondo
     */
    public void BackgroundImage() {
        background = new ImageIcon("src/main/resources/img/background-comercio.png");
        JLabel backgroundLabel = new JLabel(background);

        backgroundLabel.setBounds(0, 0, windowWidth, windowHeight);
        loginPanel.add(backgroundLabel, 1);
    }

    /**
     * Crea el botón de inicio
     * Añade el boton a un panel para poder alinearlo correctamente y a la vez tener un tamaño especificado
     */
    public void loginButton(){
        loginButton = new JButton();
        loginButton.setFont(new Font("Arial", Font.BOLD, 20));
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(0x3c7181),10,true));
        //loginButton.setBackground(null);

        ImageIcon buttonIcon = new ImageIcon("src/main/resources/img/login-button.png");
        buttonIcon = new ImageIcon(buttonIcon.getImage().getScaledInstance(loginButtonWidth, loginButtonHeight, Image.SCALE_SMOOTH));
        loginButton.setIcon(buttonIcon);

        loginButton.setBounds((windowWidth/2)-(loginButtonWidth/2), windowHeight-250, loginButtonWidth, loginButtonHeight);
        loginPanel.add(loginButton,2);

    }

    public JButton getLoginButton() {
        return loginButton;
    }
}
