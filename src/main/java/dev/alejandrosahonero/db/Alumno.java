package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.sql.Date;

@Entity
public class Alumno extends Persona implements Serializable {
    @ManyToOne
    private Modulo modulo;
    private String nuss;

    public Alumno() {}
    public Alumno(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, Date fechaNacimiento, String sexo, String email, int tlf, Modulo modulo, String nuss) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, fechaNacimiento, sexo, email, tlf);
        this.modulo = modulo;
        this.nuss = nuss;
    }

    //Getters
    public Modulo getModulo() {
        return modulo;
    }
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public String getNuss() {
        return nuss;
    }
    public void setNuss(String nuss) {
        this.nuss = nuss;
    }
}
