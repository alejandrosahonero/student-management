package dev.alejandrosahonero.logic.options.manage.alumno;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;

public class MatricularButtonController implements ActionListener {
    private MatricularView matricularView;

    public MatricularButtonController(MatricularView matricularView) {
        this.matricularView = matricularView;
    }
    public void actionPerformed(ActionEvent e) {
        //Connect to the db
        EntityManager em = Conector.getEntityManager();

        String n_dni = matricularView.getDni().getText();
        String n_aPaterno = matricularView.getApellidoPaterno().getText();
        String n_aMaterno = matricularView.getApellidoMaterno().getText();
        String n_nombres = matricularView.getNombres().getText();
        String n_fechaNacimiento = matricularView.getFechaNac().getText();
        String n_sexo = matricularView.getSexo().getText();
        String n_modulo = matricularView.getModulo().getSelectedItem().toString();
        String n_nuss = matricularView.getNuss().getText();
        String n_email = matricularView.getEmail().getText();
        String n_tlf = matricularView.getTelefono().getText();

        try {
            em.getTransaction().begin();

            Query query = em.createQuery("SELECT m FROM Modulo m WHERE m.siglas = :sig");
            query.setParameter("sig", n_modulo);
            Modulo mAux = (Modulo) query.getSingleResult();

            Alumno newAlumno = new Alumno(n_dni, n_aPaterno, n_aMaterno, n_nombres, Date.valueOf(n_fechaNacimiento), n_sexo, n_email, Integer.parseInt(n_tlf), mAux, n_nuss);
            em.persist(newAlumno);

            JOptionPane.showMessageDialog(matricularView, "La matriculación se realizó correctamente", "¡Matriculación exitosa!", JOptionPane.PLAIN_MESSAGE);

            em.getTransaction().commit();
            em.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(matricularView, "Error al cargar datos: " + ex.getMessage());
            em.close();
        }

        //Reset JTextFields texts
        matricularView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        matricularView.getDni().setText("DNI");
        matricularView.getDni().setForeground(MainView.getTextFieldColor());
        matricularView.getApellidoPaterno().setText("Apellido Paterno");
        matricularView.getApellidoPaterno().setForeground(MainView.getTextFieldColor());
        matricularView.getApellidoMaterno().setText("Apellido Materno");
        matricularView.getApellidoMaterno().setForeground(MainView.getTextFieldColor());
        matricularView.getNombres().setText("Nombres");
        matricularView.getNombres().setForeground(MainView.getTextFieldColor());
        matricularView.getFechaNac().setText("AAAA-MM-DD");
        matricularView.getFechaNac().setForeground(MainView.getTextFieldColor());
        matricularView.getSexo().setText("Sexo");
        matricularView.getSexo().setForeground(MainView.getTextFieldColor());
        matricularView.getNuss().setText("NUSS");
        matricularView.getNuss().setForeground(MainView.getTextFieldColor());
        matricularView.getEmail().setText("Email");
        matricularView.getEmail().setForeground(MainView.getTextFieldColor());
        matricularView.getTelefono().setText("Teléfono");
        matricularView.getTelefono().setForeground(MainView.getTextFieldColor());
    }
}
