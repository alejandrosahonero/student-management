package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.options.manage.profesor.ModProView;

import javax.persistence.EntityManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchButtonController implements ActionListener {
    private ModProView modProView;
    public SearchButtonController(ModProView modProView) {
        this.modProView = modProView;
    }
    public void actionPerformed(ActionEvent e) {
        try {
            EntityManager em = Conector.getEntityManager();
            em.getTransaction().begin();

            String s_dni = modProView.getSearchBar().getText();
            Profesor proAux = em.find(Profesor.class, s_dni);

            modProView.getDni().setText(proAux.getDni());
            modProView.getDni().setForeground(Color.BLACK);
            modProView.getApellidoPaterno().setText(proAux.getApellidoPaterno());
            modProView.getApellidoPaterno().setForeground(Color.BLACK);
            modProView.getApellidoMaterno().setText(proAux.getApellidoMaterno());
            modProView.getApellidoMaterno().setForeground(Color.BLACK);
            modProView.getNombres().setText(proAux.getNombres());
            modProView.getNombres().setForeground(Color.BLACK);
            modProView.getFechaNac().setText(proAux.getFechaNacimiento().toString());
            modProView.getFechaNac().setForeground(Color.BLACK);
            modProView.getSexo().setText(proAux.getSexo());
            modProView.getSexo().setForeground(Color.BLACK);
            modProView.getNuss().setText(proAux.getNuss());
            modProView.getNuss().setForeground(Color.BLACK);
            modProView.getEmail().setText(proAux.getEmail());
            modProView.getEmail().setForeground(Color.BLACK);
            modProView.getTelefono().setText(String.valueOf(proAux.getTlf()));
            modProView.getTelefono().setForeground(Color.BLACK);
            modProView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));

            em.getTransaction().commit();
            em.close();
            JOptionPane.showMessageDialog(modProView, "Datos recuperados correctamente", "¡Éxito!", JOptionPane.PLAIN_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(modProView, "Fallo al recuperar los datos", "Algo salió mal", JOptionPane.ERROR_MESSAGE);
        }
    }
}
