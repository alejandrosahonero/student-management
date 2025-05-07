package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.manage.ModModView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ModModButtonController implements ActionListener {
    ModModView modModView;
    public ModModButtonController(ModModView modModView) {
        this.modModView = modModView;
    }
    public void actionPerformed(ActionEvent e) {}

    public static List<String> getAllModulos(){
        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT m.siglas FROM Modulo m");
        List<String> allModulos = query.getResultList();
        em.getTransaction().commit();
        em.close();
        return allModulos;
    }
}
