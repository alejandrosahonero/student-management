package dev.alejandrosahonero.logic.options.manage.profesor;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.db.Modulo;
import dev.alejandrosahonero.gui.options.manage.ModProView;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ModProButtonController implements ActionListener {
    ModProView modProView;
    public ModProButtonController(ModProView modProView) {
        this.modProView = modProView;
    }
    public void actionPerformed(ActionEvent e) {}
}
