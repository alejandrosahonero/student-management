package dev.alejandrosahonero.logic.options.list;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.list.ListAlumView;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListAlumController {
    private ListAlumView listAlumView;

    public ListAlumController(ListAlumView listAlumView){
        this.listAlumView = listAlumView;
    }
    public void cargarDatos(DefaultTableModel model){
        EntityManager em = Conector.getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<Alumno> query = em.createQuery("SELECT a FROM Alumno a ORDER BY a.id", Alumno.class);
            List<Alumno> lista = query.getResultList();
            for (Alumno a : lista) {
                model.addRow(new Object[]{a.getId(), a.getDni(), a.getApellidoPaterno(), a.getApellidoMaterno(), a.getNombres(), a.getEdad(), a.getNuss(), a.getModulo()});
            }
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(listAlumView, "Error al cargar datos: " + e.getMessage());
            em.close();
        }
    }
}
