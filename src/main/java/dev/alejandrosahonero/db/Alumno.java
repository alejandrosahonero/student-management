package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Alumno extends Persona implements Serializable {
    private int id;
    private ArrayList<String> modulosCursa = new ArrayList<String>();

    public Alumno() {}
    public Alumno(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, int edad, String sexo, int id, ArrayList<String> modulosCursa) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, edad, sexo);
        this.id = id;
        this.modulosCursa = modulosCursa;
    }

    //Getters
    public int getId() {
        return id;
    }
    public ArrayList<String> getModulosCursa() {
        return modulosCursa;
    }
}
