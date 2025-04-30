package dev.alejandrosahonero.logic.options.manage;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ModModController {
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
