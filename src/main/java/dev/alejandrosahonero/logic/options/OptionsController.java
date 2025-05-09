package dev.alejandrosahonero.logic.options;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.*;
import dev.alejandrosahonero.gui.options.list.ListAlumView;
import dev.alejandrosahonero.gui.options.list.ListAsigView;
import dev.alejandrosahonero.gui.options.list.ListModView;
import dev.alejandrosahonero.gui.options.list.ListProView;
import dev.alejandrosahonero.gui.options.manage.alumno.MatricularView;
import dev.alejandrosahonero.gui.options.manage.alumno.ModAlumView;
import dev.alejandrosahonero.gui.options.manage.asignatura.ModAsigView;
import dev.alejandrosahonero.gui.options.manage.asignatura.NewAsigView;
import dev.alejandrosahonero.gui.options.manage.modulo.ModModView;
import dev.alejandrosahonero.gui.options.manage.modulo.NewModView;
import dev.alejandrosahonero.gui.options.manage.profesor.ModProView;
import dev.alejandrosahonero.gui.options.manage.profesor.NewProView;

import java.awt.event.*;

public class OptionsController extends WindowAdapter implements ActionListener{
    OptionsView optionsView;
    public OptionsController(OptionsView optionsView) {
        this.optionsView = optionsView;
    }

    public void windowClosing(WindowEvent e) {
        Conector.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == optionsView.getMatricularButton())
            new MatricularView().setVisible(true);
        if(e.getSource() == optionsView.getModAlumButton())
            new ModAlumView().setVisible(true);
        if(e.getSource() == optionsView.getNewProButton())
            new NewProView().setVisible(true);
        if(e.getSource() == optionsView.getModProButton())
            new ModProView().setVisible(true);
        if(e.getSource() == optionsView.getNewModButton())
            new NewModView().setVisible(true);
        if(e.getSource() == optionsView.getModModButton())
            new ModModView().setVisible(true);
        if(e.getSource() == optionsView.getNewAsigButton())
            new NewAsigView().setVisible(true);
        if(e.getSource() == optionsView.getModAsigButton())
            new ModAsigView().setVisible(true);
        if(e.getSource() == optionsView.getListAlumButton())
            new ListAlumView().setVisible(true);
        if(e.getSource() == optionsView.getListProButton())
            new ListProView().setVisible(true);
        if(e.getSource() == optionsView.getListModButton())
            new ListModView().setVisible(true);
        if(e.getSource() == optionsView.getListAsigButton())
            new ListAsigView().setVisible(true);
    }
}
