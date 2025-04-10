package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.LoginButtonController;

import javax.swing.*;
import java.awt.*;

public class LoginView extends MainView {
    private JLabel background;
    private ImageIcon buttonIcon;
    private JButton loginButton;

    public LoginView() {
        super("CO-Gestor");
        setWindowIcon("src/main/resources/img/icon-comercio.png");
        setBackgroundImage("src/main/resources/img/background-day-comercio.png");

        initComponents();
    }

    /**
     * Método que inicializa todos los demás métodos para aligerar la carga al constructor
     */
    private void initComponents() {
        background = new JLabel(getBackgroundImage());

        loginButton();

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
