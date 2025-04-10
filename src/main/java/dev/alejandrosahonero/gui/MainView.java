package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public abstract class MainView extends JFrame {
    final int windowsWidth = 1280;
    final int windowsHeight = 720;

    private ImageIcon icon, backgroundImage;

    public MainView(String title) {
        setTitle(title);
        setSize(windowsWidth, windowsHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        setWindowIcon("src/main/resources/img/icon-comercio.png");
    }
    /**
     * Establece el ícono de la ventana y de la aplicación
     */
    public void setWindowIcon(String path){
        icon = new ImageIcon(path);
        setIconImage(icon.getImage());
    }
    /**
     * Establece la imagen de fondo
     */
    public void setBackgroundImage(String path) {
        backgroundImage = new ImageIcon(path);
        backgroundImage = new ImageIcon(backgroundImage.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH));
    }

    public ImageIcon getBackgroundImage() {
        return backgroundImage;
    }
}
