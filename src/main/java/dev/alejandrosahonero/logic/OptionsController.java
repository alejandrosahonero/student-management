package dev.alejandrosahonero.logic;

import dev.alejandrosahonero.gui.*;

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
            new MatriculacionView().setVisible(true);
        }
        if(e.getSource() == optionsView.getListarButton()){
            optionsView.setVisible(false);
            new ListarView().setVisible(true);
        }
        if(e.getSource() == optionsView.getAddProButton()){
            optionsView.setVisible(false);
            new AddProfesorView().setVisible(true);
        }
        if(e.getSource() == optionsView.getAddModButton()){
            optionsView.setVisible(false);
            new AddModuloView().setVisible(true);
        }
    }
}
