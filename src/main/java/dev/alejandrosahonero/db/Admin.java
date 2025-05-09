package dev.alejandrosahonero.db;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Admin {
    @Id
    private static String password = "admin";
    private static String user = "admin";
    protected Admin() {}
    public static String getUser() {return user;}
    public static String getPassword() {
        return password;
    }
}
