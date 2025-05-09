package dev.alejandrosahonero.logic.options.manage.asignatura;

import dev.alejandrosahonero.db.Asignatura;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.manage.asignatura.ModAsigView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

public class SearchButtonController implements ActionListener {
    private ModAsigView modAsigView;
    public SearchButtonController(ModAsigView modAsigView) {
        this.modAsigView = modAsigView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        try {
            em.getTransaction().begin();

            String s_siglas = modAsigView.getSearchBar().getText();
            Asignatura aAux = em.find(Asignatura.class, s_siglas);

            modAsigView.getSiglas().setText(aAux.getSiglas());
            modAsigView.getSiglas().setForeground(Color.BLACK);
            modAsigView.getNombre().setText(aAux.getNombre());
            modAsigView.getNombre().setForeground(Color.BLACK);
            modAsigView.getDescripcion().setText(aAux.getDescripcion());
            modAsigView.getHoras().setText(String.valueOf(aAux.getHoras()));
            modAsigView.getHoras().setForeground(Color.BLACK);

            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(modAsigView, "Datos recuperados correctamente", "¡Éxito!", JOptionPane.PLAIN_MESSAGE);

        } catch (Exception ex) {
            em.close();
            JOptionPane.showMessageDialog(modAsigView, "Fallo al recuperar los datos", "Algo salió mal", JOptionPane.ERROR_MESSAGE);
        }
    }
}
