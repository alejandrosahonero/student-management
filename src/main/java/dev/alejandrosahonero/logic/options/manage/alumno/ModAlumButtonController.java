package dev.alejandrosahonero.logic.options.manage.alumno;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.alumno.ModAlumView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class ModAlumButtonController implements ActionListener {
    private ModAlumView modAlumView;
    public ModAlumButtonController(ModAlumView modAlumView) {
        this.modAlumView = modAlumView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        String n_dni = modAlumView.getDni().getText();
        String n_aPaterno = modAlumView.getApellidoPaterno().getText();
        String n_aMaterno = modAlumView.getApellidoMaterno().getText();
        String n_nombres = modAlumView.getNombres().getText();
        String n_fechaNacimiento = modAlumView.getFechaNac().getText();
        String n_sexo = modAlumView.getSexo().getText();
        String n_modulo = modAlumView.getModulo().getSelectedItem().toString();
        String n_nuss = modAlumView.getNuss().getText();
        String n_email = modAlumView.getEmail().getText();
        String n_tlf = modAlumView.getTelefono().getText();

        try {
            em.getTransaction().begin();

            String s_dni = modAlumView.getSearchBar().getText();
            Alumno aAux = em.find(Alumno.class, s_dni);

            Modulo mAux = em.find(Modulo.class, n_modulo);

            aAux.setDni(n_dni);
            aAux.setApellidoPaterno(n_aPaterno);
            aAux.setApellidoMaterno(n_aMaterno);
            aAux.setNombres(n_nombres);
            aAux.setFechaNacimiento(Date.valueOf(n_fechaNacimiento));
            aAux.setSexo(n_sexo);
            aAux.setModulo(mAux);
            aAux.setNuss(n_nuss);
            aAux.setEmail(n_email);
            aAux.setTlf(Integer.parseInt(n_tlf));

            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(modAlumView, "La modificación se realizó correctamente", "¡Modificación exitosa!", JOptionPane.PLAIN_MESSAGE);

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
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modAlumView, "Error al cargar datos: " + ex.getMessage(), "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            em.close();
        }
    }
}
