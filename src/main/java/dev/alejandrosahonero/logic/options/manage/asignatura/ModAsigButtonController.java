package dev.alejandrosahonero.logic.options.manage.asignatura;

import dev.alejandrosahonero.db.Asignatura;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.asignatura.ModAsigView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModAsigButtonController implements ActionListener {
    ModAsigView modAsigView;
    public ModAsigButtonController(ModAsigView modAsigView) {
        this.modAsigView = modAsigView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        String n_siglas = modAsigView.getSiglas().getText();
        String n_nombre = modAsigView.getNombre().getText();
        int n_horas = Integer.parseInt(modAsigView.getHoras().getText());
        String n_descripcion = modAsigView.getDescripcion().getText();

        try {
            em.getTransaction().begin();

            String s_siglas = modAsigView.getSearchBar().getText();
            Asignatura aAux = em.find(Asignatura.class, s_siglas);

            aAux.setSiglas(n_siglas);
            aAux.setNombre(n_nombre);
            aAux.setDescripcion(n_descripcion);
            aAux.setHoras(n_horas);

            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(modAsigView, "La modificación se realizó correctamente", "¡Modificación exitosa!", JOptionPane.PLAIN_MESSAGE);

            //Reset fields
            modAsigView.getSiglas().setText("SIGLAS");
            modAsigView.getSiglas().setForeground(MainView.getTextFieldColor());
            modAsigView.getNombre().setText("Nombre");
            modAsigView.getNombre().setForeground(MainView.getTextFieldColor());
            modAsigView.getDescripcion().setText("");
            modAsigView.getHoras().setText("Horas");
            modAsigView.getHoras().setForeground(MainView.getTextFieldColor());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modAsigView, "Error al cargar datos: " + ex.getMessage(), "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            em.close();
        }
    }
}
