package dev.alejandrosahonero.app;

import dev.alejandrosahonero.gui.LoginView;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File database = new File("src/main/java/dev/alejandrosahonero/db/database.odb");
        File databaseOpen = new File("src/main/java/dev/alejandrosahonero/db/database.odb$");
        if (database.exists())
            database.delete();
        if (databaseOpen.exists())
            databaseOpen.delete();

        LoginView loginView = new LoginView();
        loginView.setVisible(true);
    }
}