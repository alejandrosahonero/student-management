package dev.alejandrosahonero.logic;

import dev.alejandrosahonero.gui.MatriculacionView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhotoButtonController implements ActionListener {
    private MatriculacionView matriculacionView;
    private JFileChooser photoChooser;

    public PhotoButtonController(MatriculacionView matriculacionView) {
        this.matriculacionView = matriculacionView;
    }
    public void actionPerformed(ActionEvent e) {
        photoChooser = new JFileChooser();
        if(photoChooser.showOpenDialog(matriculacionView) == JFileChooser.APPROVE_OPTION) {
            matriculacionView.setPhoto(new ImageIcon(photoChooser.getSelectedFile().getAbsolutePath()));
        }
    }
}
