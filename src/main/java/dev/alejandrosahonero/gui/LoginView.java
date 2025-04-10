package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.LoginButtonController;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    private JLabel background;
    private ImageIcon icon, backgroundImage, buttonIcon;
    private JButton loginButton;

    public LoginView() {
        setTitle("CO-Gestor");
        // TAMAÑO MÁS COMUN 1280x720 -> HACER UNA SUPERCLASE
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

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
        backgroundImage = new ImageIcon("src/main/resources/img/background-day-comercio.png");
        backgroundImage = new ImageIcon(backgroundImage.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));

        background = new JLabel(backgroundImage);
        background.setSize(getWidth(), getHeight());

        add(background, BorderLayout.CENTER);
    }

    /**
     * Crea el botón de inicio
     * Añade el boton a un panel para poder alinearlo correctamente y a la vez tener un tamaño especificado
     */
    private void loginButton(){
        loginButton = new JButton();
        loginButton.addActionListener(new LoginButtonController(this));
        loginButton.setBounds(getWidth()/2, getHeight()/2, 180, 90);

        buttonIcon = new ImageIcon("src/main/resources/img/login-button.png");
        buttonIcon = new ImageIcon(buttonIcon.getImage().getScaledInstance(loginButton.getWidth(), loginButton.getHeight(), Image.SCALE_SMOOTH));
        loginButton.setIcon(buttonIcon);

        background.add(loginButton);
    }
}
