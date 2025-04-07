package dev.alejandrosahonero.logic;

import dev.alejandrosahonero.gui.LoginView;
import dev.alejandrosahonero.gui.OptionsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButtonController implements ActionListener {
    LoginView loginView;

    public LoginButtonController(LoginView loginView) {
        this.loginView = loginView;
    }

    public void escucharEventos(){
        loginView.getLoginButton().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginView.getLoginButton()){
            loginView.setVisible(false);
            new OptionsView().setVisible(true);
        }
    }
}
