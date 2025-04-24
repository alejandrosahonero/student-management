package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Modulo implements Serializable {
    @Id
    private int id;
    private String siglas;
    private String nombre;
    private String descripcion;
    @ManyToMany
    private ArrayList<Asignatura> asignaturas;

    public Modulo() {}
    public Modulo(int id, String siglas, String nombre, String descripcion) {
        this.id = id;
        this.siglas = siglas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.asignaturas = new ArrayList<>();
    }
    private void addAsignatura(Asignatura asignatura) {
        this.asignaturas.add(asignatura);
    }
    private void removeAsignatura(Asignatura asignatura) {
        this.asignaturas.remove(asignatura);
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
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}
