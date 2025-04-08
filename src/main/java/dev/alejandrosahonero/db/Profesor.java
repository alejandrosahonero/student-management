package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Profesor extends Persona implements Serializable {
    private ArrayList<String> modulosImparte = new ArrayList<String>();

    public Profesor() {}
    public Profesor(String dni, String apellido, String nombre, int edad, String sexo, ArrayList<String> modulosImparte) {
        super(dni, apellido, nombre, edad, sexo);
        this.modulosImparte = modulosImparte;
    }
}
