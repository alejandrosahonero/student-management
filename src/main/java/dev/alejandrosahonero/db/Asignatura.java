package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asignatura {
    @Id
    private int id;
    private String siglas;
    private String nombre;
    private String descripcion;

    public Asignatura() {}
    public Asignatura(int id, String siglas, String nombre, String descripcion) {
        this.id = id;
        this.siglas = siglas;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //Getters
    public int getId() {
        return id;
    }
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
