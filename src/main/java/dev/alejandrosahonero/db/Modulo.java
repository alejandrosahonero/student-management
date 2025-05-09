package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
public class Modulo implements Serializable {
    @Id
    private String siglas;
    private String nombre;
    private String descripcion;
    @ManyToMany
    private ArrayList<Asignatura> asignaturas;

    public Modulo() {}
    public Modulo(String siglas, String nombre, String descripcion, ArrayList<Asignatura> asignaturas) {
        this.siglas = siglas;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return siglas;
    }

    //Getters and Setters
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
    public ArrayList<Asignatura> getAsignaturasArray() {
        return asignaturas;
    }
    public String getAsignaturas() {
        String mensaje = "";
        for(int i=0; i<asignaturas.size(); i++){
            if(i==asignaturas.size()-1)
                mensaje+=asignaturas.get(i).toString();
            else
                mensaje+=asignaturas.get(i).toString()+", ";
        }
        return mensaje;
    }
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
