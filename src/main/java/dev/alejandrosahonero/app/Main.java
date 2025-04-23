package dev.alejandrosahonero.app;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.welcome.StartView;

import javax.persistence.EntityManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StartView startView = new StartView();
        startView.setVisible(true);

        /*//Alumnos de ejemplo para tener una base de datos
        EntityManager em = Conector.getEntityManager();
        em.getTransaction().begin();
        Alumno a1 = new Alumno("12345678A", "García", "López", "Ana", 19, "Femenino", 1001, new ArrayList<>(List.of("Programación", "Bases de Datos")));
        Alumno a2 = new Alumno("87654321B", "Pérez", "Ramírez", "Carlos", 20, "Masculino", 1002, new ArrayList<>(List.of("Entornos de Desarrollo", "Sistemas Informáticos")));
        Alumno a3 = new Alumno("45678912C", "López", "Martínez", "María", 18, "Femenino", 1003, new ArrayList<>(List.of("Lenguajes de Marcas", "FOL")));
        Alumno a4 = new Alumno("78945612D", "Sánchez", "Castillo", "Luis", 21, "Masculino", 1004, new ArrayList<>(List.of("Programación", "Sistemas Informáticos")));
        Alumno a5 = new Alumno("32165487E", "Martínez", "Gómez", "Lucía", 22, "Femenino", 1005, new ArrayList<>(List.of("Bases de Datos", "FOL")));
        Alumno a6 = new Alumno("14785236F", "Fernández", "Navarro", "Javier", 19, "Masculino", 1006, new ArrayList<>(List.of("Lenguajes de Marcas", "Entornos de Desarrollo")));
        Alumno a7 = new Alumno("96325874G", "Torres", "Moreno", "Elena", 20, "Femenino", 1007, new ArrayList<>(List.of("Programación", "FOL")));
        Alumno a8 = new Alumno("85274196H", "Ramírez", "Silva", "Sergio", 23, "Masculino", 1008, new ArrayList<>(List.of("Bases de Datos", "Entornos de Desarrollo")));
        Alumno a9 = new Alumno("15975348I", "Morales", "Cruz", "Andrea", 18, "Femenino", 1009, new ArrayList<>(List.of("Sistemas Informáticos", "Lenguajes de Marcas")));
        Alumno a10 = new Alumno("35795126J", "Castro", "Hernández", "David", 21, "Masculino", 1010, new ArrayList<>(List.of("FOL", "Programación")));
        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        em.persist(a4);
        em.persist(a5);
        em.persist(a6);
        em.persist(a7);
        em.persist(a8);
        em.persist(a9);
        em.persist(a10);
        em.getTransaction().commit();
        em.close();*/

    }
}