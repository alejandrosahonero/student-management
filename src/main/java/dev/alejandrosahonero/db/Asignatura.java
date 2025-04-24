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
    private int totalAlumnos;

    public Asignatura() {}
    public Asignatura(int id, String siglas, String nombre, String descripcion, int totalAlumnos) {
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
