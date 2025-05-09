package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.profesor.ModProView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RmButtonController implements ActionListener {
    private ModProView modProView;
    public RmButtonController(ModProView modProView) {
        this.modProView = modProView;
    }
    public void actionPerformed(ActionEvent e) {
        EntityManager em = Conector.getEntityManager();
        try {
            em.getTransaction().begin();

            String s_dni = modProView.getSearchBar().getText();
            Profesor proAux = em.find(Profesor.class, s_dni);

            em.remove(proAux);
            em.getTransaction().commit();
            em.close();

            JOptionPane.showMessageDialog(modProView, "La eliminación se realizó correctamente", "¡Eliminación exitosa!", JOptionPane.PLAIN_MESSAGE);
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
        modProView.getApellidoPaterno().setText("Apellido Paterno");
        modProView.getApellidoPaterno().setForeground(MainView.getTextFieldColor());
        modProView.getApellidoMaterno().setText("Apellido Materno");
        modProView.getApellidoMaterno().setForeground(MainView.getTextFieldColor());
        modProView.getNombres().setText("Nombres");
        modProView.getNombres().setForeground(MainView.getTextFieldColor());
        modProView.getFechaNac().setText("AAAA-MM-DD");
        modProView.getFechaNac().setForeground(MainView.getTextFieldColor());
        modProView.getSexo().setText("Sexo");
        modProView.getSexo().setForeground(MainView.getTextFieldColor());
        modProView.getNuss().setText("NUSS");
        modProView.getNuss().setForeground(MainView.getTextFieldColor());
        modProView.getEmail().setText("Email");
        modProView.getEmail().setForeground(MainView.getTextFieldColor());
        modProView.getTelefono().setText("Teléfono");
        modProView.getTelefono().setForeground(MainView.getTextFieldColor());
    }
}
