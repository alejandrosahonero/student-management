package dev.alejandrosahonero.logic.options.list;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.options.list.ListProView;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class ListProController {
    private ListProView listProView;

    public ListProController(ListProView listProView){
        this.listProView = listProView;
    }
    public void cargarDatos(DefaultTableModel model){
        EntityManager em = Conector.getEntityManager();
        try {
            em.getTransaction().begin();
            TypedQuery<Profesor> query = em.createQuery("SELECT p FROM Profesor p ORDER BY p.id", Profesor.class);
            List<Profesor> lista = query.getResultList();
            for (Profesor p : lista) {
                model.addRow(new Object[]{p.getId(), p.getDni(), p.getApellidoPaterno(), p.getApellidoMaterno(), p.getNombres(), p.getFechaNacimiento(), p.getNuss(), p.getEmail(), p.getTlf(), p.getModulosImparte()});
            }
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(listProView, "Error al cargar datos: " + e.getMessage());
            em.close();
        }
    }
}
