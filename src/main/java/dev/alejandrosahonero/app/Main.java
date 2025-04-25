package dev.alejandrosahonero.app;

import dev.alejandrosahonero.db.*;
import dev.alejandrosahonero.gui.welcome.StartView;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StartView startView = new StartView();
        startView.setVisible(true);

        ExampleDB.create();
    }
}