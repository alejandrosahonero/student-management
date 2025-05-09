package dev.alejandrosahonero.logic.options.list;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.gui.options.list.ListModView;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListModController {
    private ListModView listModView;

    public ListModController(ListModView listModView){
        this.listModView = listModView;
    }
    public void cargarDatos(DefaultTableModel model){
        EntityManager em = Conector.getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<Modulo> query = em.createQuery("SELECT m FROM Modulo m ORDER BY m.siglas", Modulo.class);
            List<Modulo> lista = query.getResultList();
            for (Modulo m : lista) {
                model.addRow(new Object[]{m.getSiglas(), m.getNombre(), m.getDescripcion(), m.getAsignaturas()});
            }
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(listModView, "Error al cargar datos: " + e.getMessage());
            em.close();
        }
    }
}
