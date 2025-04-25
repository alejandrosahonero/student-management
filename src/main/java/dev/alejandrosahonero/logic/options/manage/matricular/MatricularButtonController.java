package dev.alejandrosahonero.logic.options.manage.matricular;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.persistence.EntityManager;
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
        /*//Connect to the db
        String dni = matricularView.getDni().getText();
        String aPaterno = matricularView.getApellidoPaterno().getText();
        String aMaterno = matricularView.getApellidoMaterno().getText();
        String nombres = matricularView.getNombres().getText();
        String fechaNacimiento = matricularView.getFechaNac().getText();
        String sexo = matricularView.getSexo().getText();
        String modulo = matricularView.getModulo().getText();
        String nuss = matricularView.getNuss().getText();
        String email = matricularView.getEmail().getText();
        String tlf = matricularView.getTelefono().getText();

        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();
        Alumno newAlumno = new Alumno(dni, aPaterno, aMaterno, nombres, fechaNacimiento, sexo, modulo, nuss, email, tlf);*/

        //Reset JTextFields texts
        matricularView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        matricularView.getDni().setText("DNI");
        matricularView.getApellidoPaterno().setText("Apellido Paterno");
        matricularView.getApellidoMaterno().setText("Apellido Materno");
        matricularView.getNombres().setText("Nombres");
        matricularView.getFechaNac().setText("Fecha de Nacimiento");
        matricularView.getSexo().setText("Sexo");
        matricularView.getModulo().setText("Módulo");
        matricularView.getNuss().setText("NUSS");
        matricularView.getEmail().setText("Email");
        matricularView.getTelefono().setText("Teléfono");
    }
}
