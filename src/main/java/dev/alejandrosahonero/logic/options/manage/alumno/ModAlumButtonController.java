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

            int s_id = Integer.parseInt(modAlumView.getSearchBar().getText());
            Query query = em.createQuery("SELECT a FROM Alumno a WHERE a.id = :s_id");
            query.setParameter("s_id", s_id);
            Alumno alumAux = (Alumno) query.getSingleResult();

            query = em.createQuery("SELECT m FROM Modulo m WHERE m.siglas = :sig");
            query.setParameter("sig", n_modulo);
            Modulo mAux = (Modulo) query.getSingleResult();

            query = em.createQuery("UPDATE Alumno a SET a.dni = :n_dni, a.apellidoPaterno = :n_aPaterno, a.apellidoMaterno = :n_aMaterno, a.nombres = :n_nombres, a.fechaNacimiento = :n_fechaNacimiento, a.sexo = :n_sexo, a.modulo = :n_modulo, a.nuss = :n_nuss, a.email = :n_email, a.tlf = :n_tlf  WHERE a.id = :s_id");
            query.setParameter("n_dni", n_dni);
            query.setParameter("n_aPaterno", n_aPaterno);
            query.setParameter("n_aMaterno", n_aMaterno);
            query.setParameter("n_nombres", n_nombres);
            query.setParameter("n_fechaNacimiento", Date.valueOf(n_fechaNacimiento));
            query.setParameter("n_sexo", n_sexo);
            query.setParameter("n_modulo", mAux);
            query.setParameter("n_nuss", n_nuss);
            query.setParameter("n_email", n_email);
            query.setParameter("n_tlf", Integer.parseInt(n_tlf));
            query.setParameter("s_id", s_id);
            query.executeUpdate();

            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(modAlumView, "La modificación se realizó correctamente", "¡Modificación exitosa!", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modAlumView, "Error al cargar datos: " + ex.getMessage(), "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            em.close();
        }

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
}
