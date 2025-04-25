package dev.alejandrosahonero.logic.options;

import dev.alejandrosahonero.db.Conector;
import dev.alejandrosahonero.gui.options.*;
import dev.alejandrosahonero.gui.options.list.ListAlumView;
import dev.alejandrosahonero.gui.options.list.ListAsigView;
import dev.alejandrosahonero.gui.options.list.ListModView;
import dev.alejandrosahonero.gui.options.list.ListProView;
import dev.alejandrosahonero.gui.options.manage.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OptionsController implements ActionListener, WindowListener {
    OptionsView optionsView;
    public OptionsController(OptionsView optionsView) {
        this.optionsView = optionsView;
    }

    public void windowClosing(WindowEvent e) {
        Conector.close();
    }
    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == optionsView.getMatricularButton())
            new MatricularView().setVisible(true);
        if(e.getSource() == optionsView.getModAlumButton())
            new ModAlumView().setVisible(true);
        if(e.getSource() == optionsView.getModProButton())
            new ModProView().setVisible(true);
        if(e.getSource() == optionsView.getModModButton())
            new ModModView().setVisible(true);
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
