package dev.alejandrosahonero.logic.options.manage.alumno;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.manage.alumno.ModAlumView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchButtonController implements ActionListener {
    private ModAlumView modAlumView;
    public SearchButtonController(ModAlumView modAlumView) {
        this.modAlumView = modAlumView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        try {
            em.getTransaction().begin();

            String s_dni = modAlumView.getSearchBar().getText();
            Alumno alumAux = em.find(Alumno.class, s_dni);

            modAlumView.getDni().setText(alumAux.getDni());
            modAlumView.getDni().setForeground(Color.BLACK);
            modAlumView.getApellidoPaterno().setText(alumAux.getApellidoPaterno());
            modAlumView.getApellidoPaterno().setForeground(Color.BLACK);
            modAlumView.getApellidoMaterno().setText(alumAux.getApellidoMaterno());
            modAlumView.getApellidoMaterno().setForeground(Color.BLACK);
            modAlumView.getNombres().setText(alumAux.getNombres());
            modAlumView.getNombres().setForeground(Color.BLACK);
            modAlumView.getFechaNac().setText(alumAux.getFechaNacimiento().toString());
            modAlumView.getFechaNac().setForeground(Color.BLACK);
            modAlumView.getSexo().setText(alumAux.getSexo());
            modAlumView.getSexo().setForeground(Color.BLACK);
            modAlumView.getModulo().setSelectedItem(alumAux.getModulo().getSiglas());
            modAlumView.getNuss().setText(alumAux.getNuss());
            modAlumView.getNuss().setForeground(Color.BLACK);
            modAlumView.getEmail().setText(alumAux.getEmail());
            modAlumView.getEmail().setForeground(Color.BLACK);
            modAlumView.getTelefono().setText(String.valueOf(alumAux.getTlf()));
            modAlumView.getTelefono().setForeground(Color.BLACK);
            modAlumView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));

            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(modAlumView, "Datos recuperados correctamente", "¡Éxito!", JOptionPane.PLAIN_MESSAGE);

        } catch (Exception ex) {
            em.close();
            JOptionPane.showMessageDialog(modAlumView, "Fallo al recuperar los datos", "Algo salió mal", JOptionPane.ERROR_MESSAGE);
        }
    }
}
