package dev.alejandrosahonero.logic.options.manage.matricular;

import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.swing.*;
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
        ((JTextField)e.getSource()).setText("");
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
