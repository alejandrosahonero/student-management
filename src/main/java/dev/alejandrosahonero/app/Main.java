package dev.alejandrosahonero.app;

import dev.alejandrosahonero.db.*;
import dev.alejandrosahonero.gui.welcome.StartView;


public class Main {
    public static void main(String[] args) {
        StartView startView = new StartView();
        startView.setVisible(true);

        //Example database (use only if dont have "database.odb" file)
        ExampleDB.create();
    }
}