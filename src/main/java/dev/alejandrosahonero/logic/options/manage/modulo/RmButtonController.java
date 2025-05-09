package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.modulo.ModModView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RmButtonController implements ActionListener {
    private ModModView modModView;
    public RmButtonController(ModModView modModView) {
        this.modModView = modModView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        try {
            em.getTransaction().begin();

            String s_siglas = modModView.getSearchBar().getText();
            Modulo mAux = em.find(Modulo.class, s_siglas);

            int confirm = JOptionPane.showConfirmDialog(modModView, "¿Seguro que desea eliminar el módulo: " + s_siglas+"?", "¡Cuidado!", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                em.remove(mAux);
                em.getTransaction().commit();
                em.close();
                JOptionPane.showMessageDialog(modModView, "La eliminación se realizó correctamente", "¡Eliminación exitosa!", JOptionPane.PLAIN_MESSAGE);

                //Reset fields
                modModView.getSearchBar().setText("SIGLAS");
                modModView.getSearchBar().setForeground(MainView.getTextFieldColor());
                modModView.getSiglas().setText("SIGLAS");
                modModView.getSiglas().setForeground(MainView.getTextFieldColor());
                modModView.getNombre().setText("Nombre");
                modModView.getNombre().setForeground(MainView.getTextFieldColor());
                modModView.getDescripcion().setText("");
            }
            else {
                em.getTransaction().commit();
                em.close();
                JOptionPane.showMessageDialog(modModView, "Se canceló la eliminación", "¡Eliminación cancelada!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modModView, "Error al cargar datos: " + ex.getMessage(), "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            em.close();
        }

    }
}
