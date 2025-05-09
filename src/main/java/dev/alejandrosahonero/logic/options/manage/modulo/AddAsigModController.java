package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.db.Asignatura;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.modulo.AddAsigModView;
import dev.alejandrosahonero.gui.options.manage.profesor.AddModProView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AddAsigModController implements ActionListener {
    private AddAsigModView addAsigModView;
    private static ArrayList<Asignatura> asignaturasContiene;

    public AddAsigModController(AddAsigModView addAsigModView) {
        this.addAsigModView = addAsigModView;
    }

    public void actionPerformed(ActionEvent e) {
        asignaturasContiene = new ArrayList<>();
        EntityManager em = Conector.getEntityManager();

        if (e.getSource() == addAsigModView.getAcceptButton()) {
            em.getTransaction().begin();

            Component[] boxes = addAsigModView.getAsigPanel().getComponents();

            for (Component box : boxes) {
                if (box instanceof JCheckBox) {
                    if (((JCheckBox) box).isSelected()) {
                        String siglas = ((JCheckBox) box).getText();
                        Asignatura aAux = em.find(Asignatura.class, siglas);
                        asignaturasContiene.add(aAux);
                    }
                }
            }

            em.getTransaction().commit();
            addAsigModView.setVisible(false);
        }
        if (e.getSource() == addAsigModView.getCancelButton()) {
            addAsigModView.dispose();
        }
    }

    public static List<String> getAllAsignaturas() {
        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT a.siglas FROM Asignatura a");
        List<String> allAsignaturas = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return allAsignaturas;
    }

    public static List<String> getSearchedAsignaturas(AddAsigModView addAsigModView) {
        List<String> asigNames = new ArrayList<>();
        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();

        String s_siglas = addAsigModView.getMainManageView().getSearchBar().getText();

        Modulo mAux = em.find(Modulo.class, s_siglas);
        List<Asignatura> allAsignaturas = mAux.getAsignaturasArray();
        for (Asignatura a : allAsignaturas) {
            asigNames.add(a.getSiglas());
        }
        em.getTransaction().commit();
        em.close();
        return asigNames;
    }

    public static ArrayList<Asignatura> getAsignaturasContiene(){
        return asignaturasContiene;
    }
}
