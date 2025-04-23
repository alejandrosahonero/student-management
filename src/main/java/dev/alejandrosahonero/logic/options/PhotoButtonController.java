package dev.alejandrosahonero.logic.options;

import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhotoButtonController implements ActionListener {
    private MatricularView matricularView;
    private JFileChooser chooser;

    public PhotoButtonController(MatricularView matricularView) {
        this.matricularView = matricularView;
    }
    public void actionPerformed(ActionEvent e) {
        chooser = new JFileChooser();
        chooser.setDialogTitle("Escoge la imagen del alumno");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG JPGE PNG", "jpg", "jpge", "png");
        chooser.setFileFilter(filter);

        if(gestionar())
            matricularView.setPhoto(new ImageIcon(chooser.getSelectedFile().getPath()));
        else
            matricularView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
    }
    public boolean gestionar(){
        return chooser.showOpenDialog(matricularView) == JFileChooser.APPROVE_OPTION;
    }
}
