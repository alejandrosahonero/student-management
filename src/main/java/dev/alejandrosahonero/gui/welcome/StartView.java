package dev.alejandrosahonero.gui.welcome;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.welcome.LoginButtonController;
import dev.alejandrosahonero.logic.welcome.ChangeButtonController;
import dev.alejandrosahonero.logic.welcome.SettingsButtonController;

import javax.swing.*;
import java.awt.*;

public class StartView extends MainView {
    final int buttonPanelHeight = 80;
    final int buttonsWidth = 260;

    private JLabel background;
    private JButton loginButton, changeButton, settingsButton;
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
        loginButton = createButton("INICIAR SESION",40, 0x2E8B57, 0xffffff);
        loginButton.setPreferredSize(new Dimension(buttonsWidth,0));
        loginButton.setBorder(BorderFactory.createLineBorder(new Color(0x276b45),3));
        loginButton.addActionListener(new LoginButtonController(this));

        buttonPanel.add(loginButton, BorderLayout.CENTER);
    }
    private void registerButton() {
        changeButton = createButton("CAMBIAR CLAVE",25, 0xEEE7CC, 0x2E8B57);
        changeButton.setPreferredSize(new Dimension(buttonsWidth,0));
        changeButton.setBorder(BorderFactory.createLineBorder(new Color(0x2E8B57),3));
        changeButton.addActionListener(new ChangeButtonController(this));

        buttonPanel.add(changeButton, BorderLayout.EAST);
    }
    private void settingsButton() {
        settingsButton = createButton("AJUSTES",25, 0xEEE7CC, 0x2E8B57);
        settingsButton.setPreferredSize(new Dimension(buttonsWidth,0));
        settingsButton.setBorder(BorderFactory.createLineBorder(new Color(0x2E8B57),3));
        settingsButton.addActionListener(new SettingsButtonController(this));

        buttonPanel.add(settingsButton , BorderLayout.WEST);
    }

    //Getters
    public JButton getLoginButton() {
        return loginButton;
    }
    public JButton getChangeButton() {
        return changeButton;
    }
    public JButton getSettingsButton() {
        return settingsButton;
    }
}
