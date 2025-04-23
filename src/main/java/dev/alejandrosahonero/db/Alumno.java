package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Alumno extends Persona implements Serializable {
    private int IDMatricula;
    private ArrayList<String> modulosCursa = new ArrayList<String>();

    public Alumno() {}
    public Alumno(String dni, String apellido, String nombre, int edad, String sexo, int IDMatricula, ArrayList<String> modulosCursa) {
        super(dni, apellido, nombre, edad, sexo);
        this.IDMatricula = IDMatricula;
        this.modulosCursa = modulosCursa;
    }
}
