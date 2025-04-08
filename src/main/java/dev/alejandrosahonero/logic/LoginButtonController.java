package dev.alejandrosahonero.logic;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Persona;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.LoginView;
import dev.alejandrosahonero.gui.OptionsView;

import javax.persistence.EntityManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

            /*//    Prueba conexion base de datos
            EntityManager em = Conector.getEntityManager();
            em.getTransaction().begin();
            Persona persona = new Persona("2956864X", "Hernesto", "Pablo", 34, "femenino");
            em.persist(persona);
            ArrayList<String> modulos = new ArrayList<>();
            modulos.add("mates");
            modulos.add("bio");
            Profesor profesor = new Profesor("2956864Z", "Hernesto", "Pablo", 34, "femenino", modulos);
            em.persist(profesor);
            em.getTransaction().commit();
            em.close();*/


            loginView.setVisible(false);
            new OptionsView().setVisible(true);
        }
    }
}
