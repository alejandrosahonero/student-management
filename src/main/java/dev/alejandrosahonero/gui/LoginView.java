package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.LoginButtonController;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    private JLayeredPane loginPanel;
    private ImageIcon icon, background, buttonIcon;
    private JButton loginButton;

    public LoginView() {
        setTitle("CO-Gestor");
        setSize(1152, 768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);


        initComponents();
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
        background = new ImageIcon(background.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH));

        JLabel backgroundLabel = new JLabel(background);
        backgroundLabel.setBounds(0, 0, this.getWidth(), this.getHeight());

        add(backgroundLabel);
    }

    /**
     * Crea el botón de inicio
     * Añade el boton a un panel para poder alinearlo correctamente y a la vez tener un tamaño especificado
     */
    private void loginButton(){
        loginButton = new JButton();
        loginButton.setBackground(new Color(0x758A45));
        loginButton.setBounds(this.getWidth()/2, this.getHeight()-250, 180, 90);
        loginButton.addActionListener(new LoginButtonController(this));

        buttonIcon = new ImageIcon("src/main/resources/img/login-button.png");
        buttonIcon = new ImageIcon(buttonIcon.getImage().getScaledInstance(loginButton.getWidth(), loginButton.getHeight(), Image.SCALE_SMOOTH));
        loginButton.setIcon(buttonIcon);

        add(loginButton);
    }
}
