package dev.alejandrosahonero.gui;

import dev.alejandrosahonero.logic.LoginButtonController;
import dev.alejandrosahonero.logic.RegisterButtonController;
import dev.alejandrosahonero.logic.SettingsButtonController;

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
        loginButton.setFont(new Font("Tahoma", Font.BOLD, 40));
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(0x276b45),3));
        loginButton.setBackground(new Color(0x2E8B57));
        loginButton.setForeground(new Color(0xffffff));
        loginButton.setFocusPainted(false);
        loginButton.setVerticalAlignment(SwingConstants.CENTER);

        buttonPanel.add(loginButton, BorderLayout.CENTER);
    }
    private void registerButton() {
        registerButton = new JButton("REGISTRARSE");
        registerButton.addActionListener(new RegisterButtonController(this));

        registerButton.setPreferredSize(new Dimension(buttonsWidth,0));
        registerButton.setFont(new Font("Tahoma", Font.BOLD, 25));
        registerButton.setBorder(BorderFactory.createLineBorder(new Color(0x2E8B57),3));
        registerButton.setBackground(new Color(0xEEE7CC));
        registerButton.setForeground(new Color(0x2E8B57));
        registerButton.setFocusPainted(false);
        registerButton.setVerticalAlignment(SwingConstants.CENTER);

        buttonPanel.add(registerButton , BorderLayout.EAST);
    }
    private void settingsButton() {
        settingsButton = new JButton("AJUSTES");
        settingsButton.addActionListener(new SettingsButtonController(this));

        settingsButton.setPreferredSize(new Dimension(buttonsWidth,0));
        settingsButton.setFont(new Font("Tahoma", Font.BOLD, 25));
        settingsButton.setBorder(BorderFactory.createLineBorder(new Color(0x2E8B57),3));
        settingsButton.setBackground(new Color(0xEEE7CC));
        settingsButton.setForeground(new Color(0x2E8B57));
        settingsButton.setFocusPainted(false);
        settingsButton.setVerticalAlignment(SwingConstants.CENTER);

        buttonPanel.add(settingsButton , BorderLayout.WEST);
    }

    //Getters
    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public JButton getSettingsButton() {
        return settingsButton;
    }
}
