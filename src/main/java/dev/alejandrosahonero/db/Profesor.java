package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Profesor extends Persona implements Serializable {
    @GeneratedValue
    private int id;
    private String nuss;
    private ArrayList<Modulo> modulosImparte = new ArrayList<>();

    public Profesor() {}
    public Profesor(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, short edad, String sexo, String nuss, ArrayList<Modulo> modulosImparte) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, edad, sexo);
        this.nuss = nuss;
        this.modulosImparte = modulosImparte;
    }

    //Getters
    public int getId() {
        return id;
    }
    public String getNuss() {
        return nuss;
    }
    public ArrayList<Modulo> getModulosImparte() {
        return modulosImparte;
    }
}
