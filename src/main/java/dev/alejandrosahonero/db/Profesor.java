package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.sql.Date;

@Entity
public class Profesor extends Persona implements Serializable {
    @GeneratedValue
    private int id;
    private String nuss;
    private ArrayList<Modulo> modulosImparte = new ArrayList<>();

    public Profesor() {}
    public Profesor(String dni, String apellidoPaterno, String apellidoMaterno, String nombre, Date fechaNacimiento, String sexo, String email, int tlf, String nuss, ArrayList<Modulo> modulosImparte) {
        super(dni, apellidoPaterno, apellidoMaterno, nombre, fechaNacimiento, sexo, email, tlf);
        this.nuss = nuss;
        this.modulosImparte = modulosImparte;
    }

    //Getters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNuss() {
        return nuss;
    }
    public void setNuss(String nuss) {
        this.nuss = nuss;
    }
    public String getModulosImparte() {
        String mensaje = "";
        for(int i=0; i<modulosImparte.size(); i++){
            if(i==modulosImparte.size()-1)
                mensaje+=modulosImparte.get(i).toString();
            else
                mensaje+=modulosImparte.get(i).toString()+", ";
        }
        return mensaje;
    }
    public void setModulosImparte(ArrayList<Modulo> modulosImparte) {
        this.modulosImparte = modulosImparte;
    }
}
