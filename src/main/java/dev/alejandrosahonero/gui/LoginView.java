package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    //Tamaño de la ventana de inicio
    final int windowWidth=1152;
    final int windowHeight=768;
    //Tamaño del boton
    final int loginButtonWidth=150;
    final int loginButtonHeight=70;
    //Tamaño del contenedor del boton
    final int loginPanelWidth=0;
    final int loginPanelHeight=110;

    ImageIcon icon, background;
    JPanel loginPanel;
    JButton login;

    public LoginView() {
        setTitle("CO-Gestor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(windowWidth, windowHeight);
        setLayout(new BorderLayout());
        initComponents();
    }

    /**
     * Método que inicializa todos los demás métodos para aligerar la carga al constructor
     */
    public void initComponents() {
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
        background = new ImageIcon(background.getImage().getScaledInstance(windowWidth, windowHeight-loginButtonHeight-loginButtonHeight, Image.SCALE_SMOOTH));

        JLabel backgroundLabel = new JLabel(background);

        add(backgroundLabel, BorderLayout.CENTER);
    }

    /**
     * Crea el botón de inicio
     * Añade el boton a un panel para poder alinearlo correctamente y a la vez tener un tamaño especificado
     */
    public void loginButton(){
        login = new JButton("Iniciar");
        login.setFont(new Font("Arial", Font.BOLD, 20));
        login.setPreferredSize(new Dimension(loginButtonWidth, loginButtonHeight));

        loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setPreferredSize(new Dimension(loginPanelWidth, loginPanelHeight));
        loginPanel.add(login);

        add(loginPanel, BorderLayout.SOUTH);
    }
}
