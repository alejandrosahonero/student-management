package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.options.manage.ModAlumView;
import dev.alejandrosahonero.gui.options.manage.ModProView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
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

            int s_id = Integer.parseInt(modProView.getSearchBar().getText());
            Query query = em.createQuery("SELECT p FROM Profesor p WHERE p.id = :s_id");
            query.setParameter("s_id", s_id);
            Profesor proAux = (Profesor) query.getSingleResult();

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
