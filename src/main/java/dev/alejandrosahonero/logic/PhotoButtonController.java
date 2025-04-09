package dev.alejandrosahonero.logic;

import dev.alejandrosahonero.gui.MatriculacionView;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class PhotoButtonController implements ActionListener {
    private MatriculacionView matriculacionView;
    private JFileChooser chooser;

    public PhotoButtonController(MatriculacionView matriculacionView) {
        this.matriculacionView = matriculacionView;
    }
    public void actionPerformed(ActionEvent e) {
        chooser = new JFileChooser();
        chooser.setDialogTitle("Escoge la imagen del alumno");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG JPGE PNG", "jpg", "jpge", "png");
        chooser.setFileFilter(filter);

        if(gestionar())
        {
            matriculacionView.setPhoto(new ImageIcon(chooser.getSelectedFile().getPath()));
        }
        else
        {
            matriculacionView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        }
    }
    public boolean gestionar(){
        if(chooser.showOpenDialog(matriculacionView) == JFileChooser.APPROVE_OPTION) {
            return true;
        }
        else
            return false;
    }
}
