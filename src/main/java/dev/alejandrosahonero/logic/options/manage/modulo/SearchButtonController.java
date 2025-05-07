package dev.alejandrosahonero.logic.options.manage.modulo;

import dev.alejandrosahonero.db.Alumno;
import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.manage.ModModView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchButtonController implements ActionListener {
    private ModModView modModView;
    public SearchButtonController(ModModView modModView) {
        this.modModView = modModView;
    }
    public void actionPerformed(ActionEvent e) {}
}
