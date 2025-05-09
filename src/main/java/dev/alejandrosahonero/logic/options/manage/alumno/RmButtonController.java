package dev.alejandrosahonero.logic.options.manage.alumno;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.alumno.ModAlumView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RmButtonController implements ActionListener {
    private ModAlumView modAlumView;
    public RmButtonController(ModAlumView modAlumView) {
        this.modAlumView = modAlumView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        try {
            em.getTransaction().begin();

            String s_dni = modAlumView.getSearchBar().getText();
            Alumno aAux = em.find(Alumno.class, s_dni);

            int confirm = JOptionPane.showConfirmDialog(modAlumView, "¿Seguro que desea eliminar el alumno con DNI: " + s_dni+"?", "¡Cuidado!", JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                em.remove(aAux);
                em.getTransaction().commit();
                em.close();

                JOptionPane.showMessageDialog(modAlumView, "La eliminación se realizó correctamente", "¡Eliminación exitosa!", JOptionPane.PLAIN_MESSAGE);

                //Reset JTextFields texts
                modAlumView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
                modAlumView.getSearchBar().setText("");
                modAlumView.getSearchBar().setForeground(MainView.getTextFieldColor());
                modAlumView.getDni().setText("DNI");
                modAlumView.getDni().setForeground(MainView.getTextFieldColor());
                modAlumView.getApellidoPaterno().setText("APELLIDO PATERNO");
                modAlumView.getApellidoPaterno().setForeground(MainView.getTextFieldColor());
                modAlumView.getApellidoMaterno().setText("APELLIDO MATERNO");
                modAlumView.getApellidoMaterno().setForeground(MainView.getTextFieldColor());
                modAlumView.getNombres().setText("NOMBRES");
                modAlumView.getNombres().setForeground(MainView.getTextFieldColor());
                modAlumView.getFechaNac().setText("AAAA-MM-DD");
                modAlumView.getFechaNac().setForeground(MainView.getTextFieldColor());
                modAlumView.getSexo().setText("SEXO");
                modAlumView.getSexo().setForeground(MainView.getTextFieldColor());
                modAlumView.getNuss().setText("NUSS");
                modAlumView.getNuss().setForeground(MainView.getTextFieldColor());
                modAlumView.getEmail().setText("EMAIL");
                modAlumView.getEmail().setForeground(MainView.getTextFieldColor());
                modAlumView.getTelefono().setText("TELÉFONO");
                modAlumView.getTelefono().setForeground(MainView.getTextFieldColor());
            }
            else {
                em.getTransaction().commit();
                em.close();
                JOptionPane.showMessageDialog(modAlumView, "Se canceló la eliminación", "¡Eliminación cancelada!", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modAlumView, "Error al cargar datos: " + ex.getMessage(), "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            em.close();
        }
    }
}
