package dev.alejandrosahonero.gui.welcome;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;
import java.awt.*;

public class LoginView extends MainView {
    final int margin = 25;

    private JLabel background, title, user_l, pass_l;
    private JTextField user;
    private JPasswordField pass;
    private JButton loginButton;

    public LoginView() {
        super("Iniciar Sesión");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(new Dimension(getWindowsWidth()/2, getWindowsHeight()/2));
        setLocation(getWindowsWidth()/2-getWidth()/2, getWindowsHeight()/2-getHeight()/2);

        initComponents();
    }
    private void initComponents() {
        background = new JLabel(getBackgroundImage());

        title();
        subTitles();
        data();

        add(background);
    }
    private void title(){
        title = createTitle("INGRESE LAS CREDENCIALES", 25, 0x3D5A40);
        title.setBounds(getWidth()/2-getButtonsWidth(), margin, getButtonsWidth()*2, getButtonsHeight()/2);
        background.add(title);
    }
    private void subTitles(){
        user_l = createTitle("USUARIO:", 18, 0x3D5A40);
        user_l.setHorizontalAlignment(SwingConstants.RIGHT);
        user_l.setBounds(margin-margin/3, margin*2+getButtonsHeight()/2, getButtonsWidth()/2+getButtonsWidth()/10, getButtonsHeight()/2);
        background.add(user_l);

        pass_l = createTitle("CONTRASEÑA:", 18, 0x3D5A40);
        pass_l.setHorizontalAlignment(SwingConstants.RIGHT);
        pass_l.setBounds(margin-margin/3, margin*4+getButtonsHeight(), getButtonsWidth()/2+getButtonsWidth()/10, getButtonsHeight()/2);
        background.add(pass_l);
    }
    private void data(){
        user = createTextField("", 15);
        user.setForeground(Color.BLACK);
        user.setBounds(margin*2+getButtonsWidth()/2, margin*2+getButtonsHeight()/2, getButtonsWidth()+getButtonsWidth()/2, getButtonsHeight()/2);
        background.add(user);

        pass = new JPasswordField();
        pass.setFont(new Font("Tahoma", Font.BOLD, 15));
        pass.setHorizontalAlignment(SwingConstants.CENTER);
        pass.setBounds(margin*2+getButtonsWidth()/2, margin*4+getButtonsHeight(), getButtonsWidth()+getButtonsWidth()/2, getButtonsHeight()/2);
        background.add(pass);

        loginButton = createButton("INGRESAR", 20, 0x3D5A40, 0xffffff);
        loginButton.setBounds(getWidth()/2-getButtonsWidth()/2, margin*11/2+getButtonsHeight()/2*3, getButtonsWidth(), getButtonsHeight()/2);
        background.add(loginButton);
    }
}
