package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.db.Asignatura;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.modulo.NewModView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NewModButtonController implements ActionListener {
    NewModView newModView;
    public NewModButtonController(NewModView newModView) {
        this.newModView = newModView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        String n_siglas = newModView.getSiglas().getText();
        String n_nombre = newModView.getNombre().getText();
        String n_descripcion = newModView.getDescripcion().getText();
        ArrayList<Asignatura> n_asignaturas = AddAsigModController.getAsignaturasContiene();

        try {
            em.getTransaction().begin();
            Modulo mAux = new Modulo(n_siglas, n_nombre, n_descripcion, n_asignaturas);
            em.persist(mAux);
            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(newModView, "Se añadió el módulo: "+n_nombre.toUpperCase()+" correctamente", "¡Exito!", JOptionPane.PLAIN_MESSAGE);

            //Reset fields
            newModView.getSearchBar().setText("SIGLAS");
            newModView.getSearchBar().setForeground(MainView.getTextFieldColor());
            newModView.getSiglas().setText("SIGLAS");
            newModView.getSiglas().setForeground(MainView.getTextFieldColor());
            newModView.getNombre().setText("Nombre");
            newModView.getNombre().setForeground(MainView.getTextFieldColor());
            newModView.getDescripcion().setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(newModView, "Error al cargar datos", "Algo salio mal", JOptionPane.ERROR_MESSAGE);
        }

    }
}
