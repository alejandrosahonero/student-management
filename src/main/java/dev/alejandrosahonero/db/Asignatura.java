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
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getHoras() {return horas;}
}
