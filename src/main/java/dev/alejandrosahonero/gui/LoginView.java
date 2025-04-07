package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.LoginButtonController;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    // Tamaño de la ventana de inicio
    private final int windowWidth=1152;
    private final int windowHeight=768;

    // Tamaño del boton
    private final int loginButtonWidth=180;
    private final int loginButtonHeight=90;

    private JLayeredPane loginPanel;
    private ImageIcon icon, background, buttonIcon;
    private JButton loginButton;

    public LoginView() {
        setTitle("CO-Gestor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(windowWidth, windowHeight);
        setLayout(null);
        setBackground(new Color(0xCCCCCC));
        setLocationRelativeTo(null);

        initComponents();
        ejecutarAcciones();
    }

    /**
     * Método que inicializa todos los demás métodos para aligerar la carga al constructor
     */
    private void initComponents() {
        WindowIcon();
        BackgroundImage();
        loginButton();
    }

    /**
     * Establece el ícono de la ventana y de la aplicación
     */
    private void WindowIcon(){
        icon = new ImageIcon("src/main/resources/img/icon-comercio.png");
        setIconImage(icon.getImage());
    }

    /**
     * Establece la imagen de fondo
     */
    private void BackgroundImage() {
        background = new ImageIcon("src/main/resources/img/background-day-comercio.png");
        background = new ImageIcon(background.getImage().getScaledInstance(windowWidth, windowHeight, Image.SCALE_SMOOTH));

        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, windowWidth, windowHeight);

        add(backgroundLabel);
    }

    /**
     * Crea el botón de inicio
     * Añade el boton a un panel para poder alinearlo correctamente y a la vez tener un tamaño especificado
     */
    private void loginButton(){
        buttonIcon = new ImageIcon("src/main/resources/img/login-button.png");
        buttonIcon = new ImageIcon(buttonIcon.getImage().getScaledInstance(loginButtonWidth, loginButtonHeight, Image.SCALE_SMOOTH));

        loginButton = new JButton("INICIAR");
        loginButton.setBackground(new Color(0,0,0, 55));
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(0x3c7181),10,true));
        loginButton.setIcon(buttonIcon);
        loginButton.setBounds((windowWidth/2)-(loginButtonWidth/2), windowHeight-250, loginButtonWidth, loginButtonHeight);

        add(loginButton);

        loginButton.addActionListener(new LoginButtonController(this));
    }
    private void ejecutarAcciones(){
        LoginButtonController loginButtonController = new LoginButtonController(this);
        loginButtonController.escucharEventos();
    }

    public JButton getLoginButton() {
        return loginButton;
    }
}
