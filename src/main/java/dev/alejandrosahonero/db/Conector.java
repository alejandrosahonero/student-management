package dev.alejandrosahonero.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conector {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("src/main/java/dev/alejandrosahonero/db/database.odb");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public static void close(){
        emf.close();
    }

}
