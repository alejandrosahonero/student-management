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
    private int horas;

    public Asignatura() {}
    public Asignatura(String siglas, String nombre, String descripcion, int horas) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
    }

    @Override
    public String toString() {
        return siglas;
    }

    //Getters
    public String getSiglas() {
        return siglas;
    }
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getHoras() {return horas;}
    public void setHoras(int horas) {this.horas = horas;}
}
