package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Profesor extends Persona implements Serializable {
    private int id;
    private ArrayList<Modulo> modulosImparte = new ArrayList<>();

    public Profesor() {}
    public Profesor(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, short edad, String sexo, int id, ArrayList<Modulo> modulosImparte) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, edad, sexo);
        this.id = id;
        this.modulosImparte = modulosImparte;
    }

    //Getters
    public int getId() {
        return id;
    }
    public ArrayList<Modulo> getModulosImparte() {
        return modulosImparte;
    }
}
