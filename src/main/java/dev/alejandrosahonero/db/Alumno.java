package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Alumno extends Persona implements Serializable {
    @GeneratedValue
    private int id;
    private String modulo;
    private String nuss;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    public Alumno() {}
    public Alumno(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, short edad, String sexo, String modulo, String nuss, ArrayList<Asignatura> asignaturas) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, edad, sexo);
        this.modulo = modulo;
        this.nuss = nuss;
        this.asignaturas = asignaturas;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getModulo() {
        return modulo;
    }
    public String getNuss() {
        return nuss;
    }
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}
