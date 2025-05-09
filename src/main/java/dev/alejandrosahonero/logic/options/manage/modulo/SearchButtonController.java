package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.gui.options.manage.modulo.ModModView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchButtonController implements ActionListener {
    private ModModView modModView;
    public SearchButtonController(ModModView modModView) {
        this.modModView = modModView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        try {
            em.getTransaction().begin();
            String s_siglas = modModView.getSearchBar().getText();
            Modulo mAux = em.find(Modulo.class, s_siglas);

            modModView.getSiglas().setText(mAux.getSiglas());
            modModView.getSiglas().setForeground(Color.BLACK);
            modModView.getNombre().setText(mAux.getNombre());
            modModView.getNombre().setForeground(Color.BLACK);
            modModView.getDescripcion().setText(mAux.getDescripcion());

            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(modModView, "Datos recuperados correctamente", "¡Éxito!", JOptionPane.PLAIN_MESSAGE);

        } catch (Exception ex) {
            em.close();
            JOptionPane.showMessageDialog(modModView, "Fallo al recuperar los datos", "Algo salió mal", JOptionPane.ERROR_MESSAGE);
        }
    }
}
