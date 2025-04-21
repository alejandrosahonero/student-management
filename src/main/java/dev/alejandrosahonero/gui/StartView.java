package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.LoginButtonController;
import dev.alejandrosahonero.logic.RegisterButtonController;

import javax.swing.*;
import java.awt.*;

public class StartView extends MainView {
    final int buttonPanelHeight = 80;

    private JLabel background;
    private JButton loginButton, registerButton;
    private JPanel buttonPanel;

    public StartView() {
        super("CO-Gestor");
        setBackgroundImage("src/main/resources/img/background-day-comercio.png");

        initComponents();
    }

    /**
     * Método que inicializa todos los demás métodos para aligerar la carga al constructor
     */
    private void initComponents() {
        ImageIcon newBackground = new ImageIcon(getBackgroundImage().getImage().getScaledInstance(getWidth(),getHeight()-buttonPanelHeight, Image.SCALE_SMOOTH));
        background = new JLabel(newBackground);
        buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setPreferredSize(new Dimension(getWidth(),buttonPanelHeight));

        registerButton();
        loginButton();

        add(background, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }


    /**
     * Crea el botón de inicio
     */
    private void loginButton() {
        int thiswidth = 260;
        int thisheight = 60;

        loginButton = new JButton("INICIAR SESION");
        loginButton.addActionListener(new LoginButtonController(this));

        loginButton.setPreferredSize(new Dimension(thiswidth,thisheight));
        loginButton.setFont(new Font("Arial", Font.BOLD, 28));
        loginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        loginButton.setBackground(new Color(0x2C3E50));
        loginButton.setForeground(new Color(0xffffff));
        loginButton.setFocusPainted(false);

        buttonPanel.add(loginButton);
    }
    private void registerButton() {
        int thiswidth = 260;
        int thisheight = 60;

        registerButton = new JButton("REGISTRARSE");
        registerButton.addActionListener(new RegisterButtonController(this));

        registerButton.setPreferredSize(new Dimension(thiswidth,thisheight));
        registerButton.setFont(new Font("Arial", Font.BOLD, 14));
        registerButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        registerButton.setBackground(new Color(0x5A4E44));
        registerButton.setForeground(new Color(0xffffff));
        registerButton.setFocusPainted(false);

        buttonPanel.add(registerButton);
    }
}
