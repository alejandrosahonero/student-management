package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.db.Asignatura;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.modulo.ModModView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ModModButtonController implements ActionListener {
    ModModView modModView;
    public ModModButtonController(ModModView modModView) {
        this.modModView = modModView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        String n_siglas = modModView.getSiglas().getText();
        String n_nombre = modModView.getNombre().getText();
        String n_descripcion = modModView.getDescripcion().getText();
        ArrayList<Asignatura> n_asignaturas = AddAsigModController.getAsignaturasContiene();

        try{
            em.getTransaction().begin();

            String s_siglas = modModView.getSearchBar().getText();
            Modulo mAux = em.find(Modulo.class, s_siglas);

            mAux.setSiglas(n_siglas);
            mAux.setNombre(n_nombre);
            mAux.setDescripcion(n_descripcion);
            mAux.setAsignaturas(n_asignaturas);

            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(modModView, "La modificación se realizó correctamente", "¡Modificación exitosa!", JOptionPane.PLAIN_MESSAGE);

            //Reset fields
            modModView.getSearchBar().setText("SIGLAS");
            modModView.getSearchBar().setForeground(MainView.getTextFieldColor());
            modModView.getSiglas().setText("SIGLAS");
            modModView.getSiglas().setForeground(MainView.getTextFieldColor());
            modModView.getNombre().setText("Nombre");
            modModView.getNombre().setForeground(MainView.getTextFieldColor());
            modModView.getDescripcion().setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modModView, "Error al cargar datos: " + ex.getMessage(), "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            em.close();
        }
    }

    public static List<String> getAllModulos(){
        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT m.siglas FROM Modulo m");
        List<String> allModulos = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return allModulos;
    }
}
