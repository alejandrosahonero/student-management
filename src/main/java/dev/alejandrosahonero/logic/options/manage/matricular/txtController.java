package dev.alejandrosahonero.logic.options.manage.matricular;

import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
