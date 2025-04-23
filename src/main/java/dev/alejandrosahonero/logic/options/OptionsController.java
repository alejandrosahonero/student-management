package dev.alejandrosahonero.logic.options;

import dev.alejandrosahonero.gui.options.*;
import dev.alejandrosahonero.gui.options.list.ListAlumView;
import dev.alejandrosahonero.gui.options.list.ListAsigView;
import dev.alejandrosahonero.gui.options.list.ListModView;
import dev.alejandrosahonero.gui.options.list.ListProView;
import dev.alejandrosahonero.gui.options.manage.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsController implements ActionListener {
    OptionsView optionsView;
    public OptionsController(OptionsView optionsView) {
        this.optionsView = optionsView;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == optionsView.getMatricularButton()){
            new MatricularView().setVisible(true);
        }
        if(e.getSource() == optionsView.getModAlumButton()){
            new ModAlumView().setVisible(true);
        }
        if(e.getSource() == optionsView.getModProButton()){
            new ModProView().setVisible(true);
        }
        if(e.getSource() == optionsView.getModModButton()){
            new ModModView().setVisible(true);
        }
        if(e.getSource() == optionsView.getModAsigButton()){
            new ModAsigView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListAlumButton()){
            new ListAlumView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListProButton()){
            new ListProView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListModButton()){
            new ListModView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListAsigButton()){
            new ListAsigView().setVisible(true);
        }
    }
}
