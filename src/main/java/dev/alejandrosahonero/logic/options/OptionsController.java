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
            optionsView.setVisible(false);
            new MatricularView().setVisible(true);
        }
        if(e.getSource() == optionsView.getModAlumButton()){
            optionsView.setVisible(false);
            new ModAlumView().setVisible(true);
        }
        if(e.getSource() == optionsView.getModProButton()){
            optionsView.setVisible(false);
            new ModProView().setVisible(true);
        }
        if(e.getSource() == optionsView.getModModButton()){
            optionsView.setVisible(false);
            new ModModView().setVisible(true);
        }
        if(e.getSource() == optionsView.getModAsigButton()){
            optionsView.setVisible(false);
            new ModAsigView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListAlumButton()){
            optionsView.setVisible(false);
            new ListAlumView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListProButton()){
            optionsView.setVisible(false);
            new ListProView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListModButton()){
            optionsView.setVisible(false);
            new ListModView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListAsigButton()){
            optionsView.setVisible(false);
            new ListAsigView().setVisible(true);
        }
    }
}
