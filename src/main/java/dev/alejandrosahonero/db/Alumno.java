package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.ArrayList;
import java.sql.Date;

@Entity
public class Alumno extends Persona implements Serializable {;
    @ManyToOne
    private Modulo modulo;
    private String nuss;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    public Alumno() {}
    public Alumno(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, Date fechaNacimiento, String sexo, String email, int tlf, Modulo modulo, String nuss) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, fechaNacimiento, sexo, email, tlf);
        this.modulo = modulo;
        this.nuss = nuss;
        this.asignaturas = new ArrayList<>();
    }
    public Alumno(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, Date fechaNacimiento, String sexo, String email, int tlf, Modulo modulo, String nuss, ArrayList<Asignatura> asignaturas) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, fechaNacimiento, sexo, email, tlf);
        this.modulo = modulo;
        this.nuss = nuss;
        this.asignaturas = asignaturas;
    }

    //Getters
    public Modulo getModulo() {
        return modulo;
    }
    public String getNuss() {
        return nuss;
    }
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}
