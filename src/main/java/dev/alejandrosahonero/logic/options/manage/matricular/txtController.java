package dev.alejandrosahonero.logic.options.manage.matricular;

import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class txtController implements MouseListener
{
    MatricularView matricularView;

    public txtController(MatricularView matricularView)
    {
        this.matricularView = matricularView;
    }
    public void mouseClicked(MouseEvent e)
    {
        if(((JTextField)e.getSource()).getBackground() == Color.WHITE) {
            ((JTextField) e.getSource()).setText("");
            ((JTextField) e.getSource()).setBackground(new Color(255, 255, 254));
        }
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
