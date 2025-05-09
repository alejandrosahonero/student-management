package dev.alejandrosahonero.gui;

import javax.swing.*;
import java.awt.*;

public abstract class MainView extends JFrame {
    private final int windowsWidth = 1280;
    private final int windowsHeight = 720;

    private final int buttonsWidth = 250;
    private final int buttonsHeight = 80;

    private final int margin = 50;

    private static final Color textFieldColor = new Color(0x8C8C8C);

    private ImageIcon icon, backgroundImage;

    public MainView(String title) {
        setTitle(title);
        setSize(windowsWidth, windowsHeight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());

        setWindowIcon("src/main/resources/img/icon-comercio.png");
        setBackgroundImage("src/main/resources/img/background-windows.png");
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
    public JButton createButton(String name, int size, int backColor, int foreColor){
        JButton button = new JButton(name);
        button.setFont(new Font("Tahoma", Font.BOLD, size));
        button.setBackground(new Color(backColor));
        button.setForeground(new Color(foreColor));
        button.setFocusPainted(false);
        button.setVerticalAlignment(SwingConstants.CENTER);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        return button;
    }
    public JLabel createTitle(String name, int size, int foreColor){
        JLabel title = new JLabel(name);
        title.setFont(new Font("Tahoma", Font.BOLD, size));
        title.setForeground(new Color(foreColor));
        title.setVerticalAlignment(SwingConstants.CENTER);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        return title;
    }
    public JTextField createTextField(String text, int size){
        JTextField field = new JTextField(text);
        field.setFont(new Font("Tahoma", Font.BOLD, size));
        field.setHorizontalAlignment(SwingConstants.CENTER);
        field.setForeground(textFieldColor);
        return field;
    }

    //Getters

    public int getWindowsWidth() {
        return windowsWidth;
    }
    public int getWindowsHeight() {
        return windowsHeight;
    }
    public int getButtonsWidth() {
        return buttonsWidth;
    }
    public int getButtonsHeight() {
        return buttonsHeight;
    }
    public int getMargin(){
        return margin;
    }
    public static Color getTextFieldColor(){
        return textFieldColor;
    }
    public ImageIcon getBackgroundImage(){
        return backgroundImage;
    }
}
