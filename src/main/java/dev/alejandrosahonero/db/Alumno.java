package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Alumno extends Persona implements Serializable {
    private ArrayList<String> modulosCursa = new ArrayList<String>();
    public Alumno() {}
    public Alumno(String dni, String apellido, String nombre, int edad, String sexo, ArrayList<String> modulosCursa) {
        super(dni, apellido, nombre, edad, sexo);
        this.modulosCursa = modulosCursa;
    }
}
