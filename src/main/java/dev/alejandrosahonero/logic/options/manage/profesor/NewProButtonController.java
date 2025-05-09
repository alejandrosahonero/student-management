package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.profesor.NewProView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

public class NewProButtonController implements ActionListener {
    NewProView newProView;
    public NewProButtonController(NewProView newProView) {
        this.newProView = newProView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        String n_dni = newProView.getDni().getText();
        String n_aPaterno = newProView.getApellidoPaterno().getText();
        String n_aMaterno = newProView.getApellidoMaterno().getText();
        String n_nombres = newProView.getNombres().getText();
        String n_fechaNacimiento = newProView.getFechaNac().getText();
        String n_sexo = newProView.getSexo().getText();
        ArrayList<Modulo> n_modulos = AddModProController.getModulosImparte();
        String n_nuss = newProView.getNuss().getText();
        String n_email = newProView.getEmail().getText();
        String n_tlf = newProView.getTelefono().getText();

        try {
            em.getTransaction().begin();
            Profesor pNew = new Profesor(n_dni, n_aPaterno, n_aMaterno, n_nombres, Date.valueOf(n_fechaNacimiento), n_sexo, n_email, Integer.parseInt(n_tlf), n_nuss, n_modulos);
            em.persist(pNew);
            em.getTransaction().commit();

            JOptionPane.showMessageDialog(newProView, "Se añadió al profesor con DNI: "+n_dni+" correctamente", "¡Exito!", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(newProView, "Error al cargar datos", "Algo salio mal", JOptionPane.ERROR_MESSAGE);
        }

        newProView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        newProView.getDni().setText("DNI");
        newProView.getDni().setForeground(MainView.getTextFieldColor());
        newProView.getApellidoPaterno().setText("Apellido Paterno");
        newProView.getApellidoPaterno().setForeground(MainView.getTextFieldColor());
        newProView.getApellidoMaterno().setText("Apellido Materno");
        newProView.getApellidoMaterno().setForeground(MainView.getTextFieldColor());
        newProView.getNombres().setText("Nombres");
        newProView.getNombres().setForeground(MainView.getTextFieldColor());
        newProView.getFechaNac().setText("AAAA-MM-DD");
        newProView.getFechaNac().setForeground(MainView.getTextFieldColor());
        newProView.getSexo().setText("Sexo");
        newProView.getSexo().setForeground(MainView.getTextFieldColor());
        newProView.getNuss().setText("NUSS");
        newProView.getNuss().setForeground(MainView.getTextFieldColor());
        newProView.getEmail().setText("Email");
        newProView.getEmail().setForeground(MainView.getTextFieldColor());
        newProView.getTelefono().setText("Teléfono");
        newProView.getTelefono().setForeground(MainView.getTextFieldColor());
    }
}
