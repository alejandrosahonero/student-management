package dev.alejandrosahonero.logic.options.manage.asignatura;

import dev.alejandrosahonero.db.Asignatura;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.asignatura.ModAsigView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RmButtonController implements ActionListener {
    private ModAsigView modAsigView;
    public RmButtonController(ModAsigView modAsigView) {
        this.modAsigView = modAsigView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        try {
            em.getTransaction().begin();

            String s_siglas = modAsigView.getSearchBar().getText();
            Asignatura aAux = em.find(Asignatura.class, s_siglas);

            int confirm = JOptionPane.showConfirmDialog(modAsigView, "¿Seguro que desea eliminar la asignatura: " + s_siglas+"?", "¡Cuidado!", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                em.remove(aAux);
                em.getTransaction().commit();
                em.close();

                JOptionPane.showMessageDialog(modAsigView, "La eliminación se realizó correctamente", "¡Eliminación exitosa!", JOptionPane.PLAIN_MESSAGE);

                //Reset fields
                modAsigView.getSiglas().setText("SIGLAS");
                modAsigView.getSiglas().setForeground(MainView.getTextFieldColor());
                modAsigView.getNombre().setText("Nombre");
                modAsigView.getNombre().setForeground(MainView.getTextFieldColor());
                modAsigView.getDescripcion().setText("");
                modAsigView.getHoras().setText("Horas");
                modAsigView.getHoras().setForeground(MainView.getTextFieldColor());
            }
            else {
                em.getTransaction().commit();
                em.close();
                JOptionPane.showMessageDialog(modAsigView, "Se canceló la eliminación", "¡Eliminación cancelada!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modAsigView, "Error al cargar datos: " + ex.getMessage(), "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            em.close();
        }
    }
}
