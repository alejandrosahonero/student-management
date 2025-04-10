package dev.alejandrosahonero.logic;

import dev.alejandrosahonero.gui.StartView;
import dev.alejandrosahonero.gui.OptionsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButtonController implements ActionListener {
    private StartView startView;

    public LoginButtonController(StartView startView) {
        this.startView = startView;
    }

    public void actionPerformed(ActionEvent e) {
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

        startView.setVisible(false);
        new OptionsView().setVisible(true);

    }
}
