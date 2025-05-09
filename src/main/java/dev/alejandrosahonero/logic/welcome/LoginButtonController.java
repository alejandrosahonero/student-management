package dev.alejandrosahonero.logic.welcome;

import dev.alejandrosahonero.db.Admin;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.OptionsView;
import dev.alejandrosahonero.gui.welcome.LoginView;
import dev.alejandrosahonero.gui.welcome.StartView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButtonController implements ActionListener {
    private LoginView loginView;
    private StartView startView;
    public LoginButtonController(LoginView loginView, StartView startView) {
        this.loginView = loginView;
        this.startView = startView;
    }
    public void actionPerformed(ActionEvent e) {

        String user = loginView.getUser().getText();
        char[] p = loginView.getPass().getPassword();
        String pass = new String(p);

        if(user.equals(Admin.getUser()) && pass.equals(Admin.getPassword())){
            loginView.dispose();
            startView.dispose();
            new OptionsView().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(loginView, "Credenciales incorrectas, saliendo del programa", "¡OJO!", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
    }
}
