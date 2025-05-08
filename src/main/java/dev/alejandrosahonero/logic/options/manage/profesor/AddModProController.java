package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.db.Profesor;
import dev.alejandrosahonero.gui.options.manage.AddModProView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AddModProController implements ActionListener {
    private AddModProView addModProView;
    private static ArrayList<Modulo> modulosImparte;
    public AddModProController(AddModProView addModProView) {
        this.addModProView = addModProView;
    }
    public void actionPerformed(ActionEvent e) {
        modulosImparte = new ArrayList<>();
        EntityManager em = Conector.getEntityManager();

        if(e.getSource() == addModProView.getAcceptButton()){
            em.getTransaction().begin();

            Component[] boxes = addModProView.getModPanel().getComponents();

            for(Component box : boxes){
                if(box instanceof JCheckBox){
                    if(((JCheckBox)box).isSelected()){
                        String siglas = ((JCheckBox) box).getText();
                        Query query = em.createQuery("SELECT m FROM Modulo m WHERE m.siglas = :siglas");
                        query.setParameter("siglas", siglas);
                        Modulo mAux = (Modulo) query.getSingleResult();
                        modulosImparte.add(mAux);
                    }
                }
            }

            em.getTransaction().commit();
            addModProView.setVisible(false);
        }
        if(e.getSource() == addModProView.getCancelButton()){
            addModProView.dispose();
        }
    }
    public static List<String> getAllModulos(){
        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT m.siglas FROM Modulo m");
        List<String> allModulos = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return allModulos;
    }
    public static List<String> getSearchedModulos(AddModProView addModProView){
        List<String> modulosNames = new ArrayList<>();
        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();

        String s_dni = addModProView.getModProView().getSearchBar().getText();

        Profesor pAux = em.find(Profesor.class, s_dni);
        List<Modulo> allModulos = pAux.getModulosImparteArray();
        for(Modulo m : allModulos){
            modulosNames.add(m.getSiglas());
        }
        em.getTransaction().commit();
        em.close();
        return modulosNames;
    }
    public static ArrayList<Modulo> getModulosImparte(){
        return modulosImparte;
    }
}
