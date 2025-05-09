package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asignatura {
    @Id
    private String siglas;
    private String nombre;
    private String descripcion;

    public Asignatura() {}
    public Asignatura(String siglas, String nombre, String descripcion) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return siglas;
    }

    //Getters
    public String getSiglas() {
        return siglas;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
}
