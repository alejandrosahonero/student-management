package dev.alejandrosahonero.logic.options.manage.matricular;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatricularButtonController implements ActionListener {
    private MatricularView matricularView;

    public MatricularButtonController(MatricularView matricularView) {
        this.matricularView = matricularView;
    }
    public void actionPerformed(ActionEvent e) {
        /*//Connect to the db
        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();
        String dni = matricularView.getDni().getText();
        String aPaterno = matricularView.getApellidoPaterno().getText();
        String aMaterno = matricularView.getApellidoMaterno().getText();
        String nombres = matricularView.getNombres().getText();
        String dni = matricularView.getFechaNac().getText();
        String dni = matricularView.getSexo().getText();
        String dni = matricularView.getModulo().getText();
        String dni = matricularView.getNuss().getText();
        String dni = matricularView.getEmail().getText();
        String dni = matricularView.getTelefono().getText();*/
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
