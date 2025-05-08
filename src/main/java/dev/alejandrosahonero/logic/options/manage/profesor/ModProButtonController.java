package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.ModProView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ModProButtonController implements ActionListener {
    ModProView modProView;
    public ModProButtonController(ModProView modProView) {
        this.modProView = modProView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();

        String n_dni = modProView.getDni().getText();
        String n_aPaterno = modProView.getApellidoPaterno().getText();
        String n_aMaterno = modProView.getApellidoMaterno().getText();
        String n_nombres = modProView.getNombres().getText();
        String n_fechaNacimiento = modProView.getFechaNac().getText();
        String n_sexo = modProView.getSexo().getText();
        ArrayList<Modulo> n_modulos = AddModProController.getModulosImparte();
        String n_nuss = modProView.getNuss().getText();
        String n_email = modProView.getEmail().getText();
        String n_tlf = modProView.getTelefono().getText();

        try {
            em.getTransaction().begin();

            int s_id = Integer.parseInt(modProView.getSearchBar().getText());
            Query query = em.createQuery("SELECT p FROM Profesor p WHERE p.id = :s_id");
            query.setParameter("s_id", s_id);
            Profesor proAux = (Profesor) query.getSingleResult();

            proAux.setDni(n_dni);
            proAux.setApellidoPaterno(n_aPaterno);
            proAux.setApellidoMaterno(n_aMaterno);
            proAux.setNombres(n_nombres);
            proAux.setFechaNacimiento(Date.valueOf(n_fechaNacimiento));
            proAux.setSexo(n_sexo);
            proAux.setModulosImparte(n_modulos);
            proAux.setNuss(n_nuss);
            proAux.setEmail(n_email);
            proAux.setTlf(Integer.parseInt(n_tlf));

            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(modProView, "La modificación se realizó correctamente", "¡Modificación exitosa!", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modProView, "Error al cargar datos: " + ex.getMessage(), "Algo salió mal", JOptionPane.ERROR_MESSAGE);
            em.close();
        }

        //Reset JTextFields texts
        modProView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        modProView.getSearchBar().setText("ID");
        modProView.getSearchBar().setForeground(MainView.getTextFieldColor());
        modProView.getDni().setText("DNI");
        modProView.getDni().setForeground(MainView.getTextFieldColor());
        modProView.getApellidoPaterno().setText("APELLIDO PATERNO");
        modProView.getApellidoPaterno().setForeground(MainView.getTextFieldColor());
        modProView.getApellidoMaterno().setText("APELLIDO MATERNO");
        modProView.getApellidoMaterno().setForeground(MainView.getTextFieldColor());
        modProView.getNombres().setText("NOMBRES");
        modProView.getNombres().setForeground(MainView.getTextFieldColor());
        modProView.getFechaNac().setText("AAAA-MM-DD");
        modProView.getFechaNac().setForeground(MainView.getTextFieldColor());
        modProView.getSexo().setText("SEXO");
        modProView.getSexo().setForeground(MainView.getTextFieldColor());
        modProView.getNuss().setText("NUSS");
        modProView.getNuss().setForeground(MainView.getTextFieldColor());
        modProView.getEmail().setText("EMAIL");
        modProView.getEmail().setForeground(MainView.getTextFieldColor());
        modProView.getTelefono().setText("TELÉFONO");
        modProView.getTelefono().setForeground(MainView.getTextFieldColor());
    }
}
