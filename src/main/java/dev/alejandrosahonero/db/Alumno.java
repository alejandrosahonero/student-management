package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Alumno extends Persona implements Serializable {
    private int IDMatricula;
    private ArrayList<String> modulosCursa = new ArrayList<String>();

    public Alumno() {}
    public Alumno(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, int edad, String sexo, int IDMatricula, ArrayList<String> modulosCursa) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, edad, sexo);
        this.IDMatricula = IDMatricula;
        this.modulosCursa = modulosCursa;
    }

    //Getters
    public int getIDMatricula() {
        return IDMatricula;
    }
    public ArrayList<String> getModulosCursa() {
        return modulosCursa;
    }
}
