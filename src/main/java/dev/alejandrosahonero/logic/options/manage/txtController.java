package dev.alejandrosahonero.logic.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.alumno.MatricularView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class txtController extends MouseAdapter {

    public txtController(){}
    public void mouseClicked(MouseEvent e) {
        if(((JTextField)e.getSource()).getForeground() == MainView.getTextFieldColor()) {
            ((JTextField) e.getSource()).setText("");
            ((JTextField) e.getSource()).setForeground(Color.BLACK);
        }
    }
}
