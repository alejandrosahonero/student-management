package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Modulo implements Serializable {
    @Id
    private int id;
    private String siglas;
    private String nombre;
    private String descripcion;
    private int totalAlumnos;

    public Modulo() {}
    public Modulo(int id, String siglas, String nombre, String descripcion, int totalAlumnos) {
        this.id = id;
        this.siglas = siglas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.totalAlumnos = totalAlumnos;
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
    public int getTotalAlumnos() {
        return totalAlumnos;
    }
}
