package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Profesor extends Persona implements Serializable {
    private int id;
    private ArrayList<String> modulosImparte = new ArrayList<String>();

    public Profesor() {}
    public Profesor(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, int edad, String sexo, int id, ArrayList<String> modulosImparte) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, edad, sexo);
        this.id = id;
        this.modulosImparte = modulosImparte;
    }

    //Getters
    public int getId() {
        return id;
    }
    public ArrayList<String> getModulosImparte() {
        return modulosImparte;
    }
}
