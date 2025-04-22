package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.LoginButtonController;
import dev.alejandrosahonero.logic.RegisterButtonController;

import javax.swing.*;
import java.awt.*;

public class StartView extends MainView {
    final int buttonPanelHeight = 80;
    final int buttonsWidth = 260;

    private JLabel background;
    private JButton loginButton, registerButton, settingsButton;
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
        view();
        registerButton();
        loginButton();
        settingsButton();

        add(background, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void view(){
        ImageIcon newBackground = new ImageIcon(getBackgroundImage().getImage().getScaledInstance(getWidth(),getHeight()-buttonPanelHeight, Image.SCALE_SMOOTH));
        background = new JLabel(newBackground);

        buttonPanel = new JPanel(new BorderLayout(10,10));
        buttonPanel.setPreferredSize(new Dimension(getWidth(),buttonPanelHeight));
        buttonPanel.setBackground(new Color(0x888d81));
    }


    /**
     * Crea el botón de inicio
     */
    private void loginButton() {
        loginButton = new JButton("INICIAR SESION");
        loginButton.addActionListener(new LoginButtonController(this));

        loginButton.setPreferredSize(new Dimension(buttonsWidth,0));
        loginButton.setFont(new Font("Arial", Font.BOLD, 25));
        loginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        loginButton.setBackground(new Color(0x2C3E50));
        loginButton.setForeground(new Color(0xffffff));
        loginButton.setFocusPainted(false);
        loginButton.setVerticalAlignment(SwingConstants.CENTER);

        buttonPanel.add(loginButton, BorderLayout.CENTER);
    }
    private void registerButton() {
        registerButton = new JButton("REGISTRARSE");
        registerButton.addActionListener(new RegisterButtonController(this));

        registerButton.setPreferredSize(new Dimension(buttonsWidth,0));
        registerButton.setFont(new Font("Arial", Font.BOLD, 25));
        registerButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        registerButton.setBackground(new Color(0x5A4E44));
        registerButton.setForeground(new Color(0xffffff));
        registerButton.setFocusPainted(false);
        registerButton.setVerticalAlignment(SwingConstants.CENTER);

        buttonPanel.add(registerButton , BorderLayout.EAST);
    }
    private void settingsButton() {
        settingsButton = new JButton("AJUSTES");
        settingsButton.addActionListener(new RegisterButtonController(this));

        settingsButton.setPreferredSize(new Dimension(buttonsWidth,0));
        settingsButton.setFont(new Font("Arial", Font.BOLD, 25));
        settingsButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        settingsButton.setBackground(new Color(0x5A4E44));
        settingsButton.setForeground(new Color(0xffffff));
        settingsButton.setFocusPainted(false);
        settingsButton.setVerticalAlignment(SwingConstants.CENTER);

        buttonPanel.add(settingsButton , BorderLayout.WEST);
    }
}
