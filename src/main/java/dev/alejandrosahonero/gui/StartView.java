package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.LoginButtonController;
import dev.alejandrosahonero.logic.RegisterButtonController;

import javax.swing.*;
import java.awt.*;

public class StartView extends MainView {
    private JLabel background;
    private ImageIcon loginIcon;
    private JButton loginButton, registerButton;

    public StartView() {
        super("CO-Gestor");
        setBackgroundImage("src/main/resources/img/background-day-comercio.png");

        initComponents();
    }

    /**
     * Método que inicializa todos los demás métodos para aligerar la carga al constructor
     */
    private void initComponents() {
        background = new JLabel(getBackgroundImage());

        loginButton();
        registerButton();

        add(background, BorderLayout.CENTER);
    }


    /**
     * Crea el botón de inicio
     */
    private void loginButton() {
        loginButton = new JButton();
        loginButton.addActionListener(new LoginButtonController(this));
        loginButton.setBounds(getWidth()/4+getButtonsWidth()/2, (getHeight()/2+getHeight()/3)-getButtonsHeight()/2, getButtonsWidth(), getButtonsHeight());

        loginIcon = new ImageIcon("src/main/resources/img/login-button-normal.png");
        loginIcon = new ImageIcon(loginIcon.getImage().getScaledInstance(loginButton.getWidth(), loginButton.getHeight(), Image.SCALE_SMOOTH));
        loginButton.setIcon(loginIcon);

        background.add(loginButton);
    }
    private void registerButton() {
        registerButton = new JButton();
        registerButton.addActionListener(new RegisterButtonController(this));
        registerButton.setBounds(getWidth()/2+getButtonsWidth()/2, (getHeight()/2+getHeight()/3)-getButtonsHeight()/2, getButtonsWidth(), getButtonsHeight());

        loginIcon = new ImageIcon("src/main/resources/img/register-button-normal.png");
        loginIcon = new ImageIcon(loginIcon.getImage().getScaledInstance(loginButton.getWidth(), loginButton.getHeight(), Image.SCALE_SMOOTH));
        registerButton.setIcon(loginIcon);

        background.add(registerButton);
    }
}
