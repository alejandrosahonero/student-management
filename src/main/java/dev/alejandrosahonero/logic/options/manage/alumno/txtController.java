package dev.alejandrosahonero.logic.options.manage.alumno;

import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class txtController extends MouseAdapter {
    MatricularView matricularView;

    public txtController(){}
    public void mouseClicked(MouseEvent e) {
        if(((JTextField)e.getSource()).getBackground() == Color.WHITE) {
            ((JTextField) e.getSource()).setText("");
            ((JTextField) e.getSource()).setBackground(new Color(255, 255, 254));
        }
    }
}
