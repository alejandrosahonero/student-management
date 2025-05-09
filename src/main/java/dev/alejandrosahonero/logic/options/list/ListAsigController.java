package dev.alejandrosahonero.logic.options.list;

import dev.alejandrosahonero.db.Asignatura;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.list.ListAsigView;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListAsigController {
    private ListAsigView listAsigView;

    public ListAsigController(ListAsigView listAsigView){
        this.listAsigView = listAsigView;
    }
    public void cargarDatos(DefaultTableModel model){
        EntityManager em = Conector.getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<Asignatura> query = em.createQuery("SELECT a FROM Asignatura a ORDER BY a.siglas", Asignatura.class);
            List<Asignatura> lista = query.getResultList();
            for (Asignatura a : lista) {
                model.addRow(new Object[]{a.getSiglas(), a.getNombre(), a.getDescripcion()});
            }
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(listAsigView, "Error al cargar datos: " + e.getMessage());
            em.close();
        }
    }
}
