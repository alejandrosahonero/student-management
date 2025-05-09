package dev.alejandrosahonero.logic.options.manage.asignatura;

import dev.alejandrosahonero.db.Asignatura;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.asignatura.NewAsigView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewAsigButtonController implements ActionListener {
    NewAsigView newAsigView;
    public NewAsigButtonController(NewAsigView newAsigView) {
        this.newAsigView = newAsigView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        String n_siglas = newAsigView.getSiglas().getText();
        String n_nombre = newAsigView.getNombre().getText();
        int n_horas = Integer.parseInt(newAsigView.getHoras().getText());
        String n_descripcion = newAsigView.getDescripcion().getText();

        try {
            em.getTransaction().begin();

            Asignatura aAux = new Asignatura(n_siglas, n_nombre, n_descripcion, n_horas);
            em.persist(aAux);

            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(newAsigView, "Se añadió la asignatura: "+n_nombre.toUpperCase()+" correctamente", "¡Exito!", JOptionPane.PLAIN_MESSAGE);

            //Reset fields
            newAsigView.getSiglas().setText("SIGLAS");
            newAsigView.getSiglas().setForeground(MainView.getTextFieldColor());
            newAsigView.getNombre().setText("Nombre");
            newAsigView.getNombre().setForeground(MainView.getTextFieldColor());
            newAsigView.getDescripcion().setText("");
            newAsigView.getHoras().setText("Horas");
            newAsigView.getHoras().setForeground(MainView.getTextFieldColor());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(newAsigView, "Error al cargar datos", "Algo salio mal", JOptionPane.ERROR_MESSAGE);
        }
    }
}
