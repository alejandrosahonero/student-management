package dev.alejandrosahonero.logic.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.alumno.MatricularView;
import dev.alejandrosahonero.gui.options.manage.alumno.ModAlumView;
import dev.alejandrosahonero.gui.options.manage.profesor.ModProView;
import dev.alejandrosahonero.gui.options.manage.profesor.NewProView;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PhotoButtonController implements ActionListener {
    private MainView mainView;
    private JFileChooser chooser;

    public PhotoButtonController(MainView mainView) {
        this.mainView = mainView;
    }
    public void actionPerformed(ActionEvent e) {
        chooser = new JFileChooser();
        chooser.setDialogTitle("Escoge la imagen del alumno");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG JPGE PNG", "jpg", "jpge", "png");
        chooser.setFileFilter(filter);
        if(mainView instanceof MatricularView) {
            if (gestionar())
                ((MatricularView)mainView).setPhoto(new ImageIcon(chooser.getSelectedFile().getPath()));
            else
                ((MatricularView)mainView).setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        }
        else if(mainView instanceof ModAlumView) {
            if (gestionar())
                ((ModAlumView)mainView).setPhoto(new ImageIcon(chooser.getSelectedFile().getPath()));
            else
                ((ModAlumView)mainView).setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        }
        else if(mainView instanceof NewProView) {
            if (gestionar())
                ((NewProView)mainView).setPhoto(new ImageIcon(chooser.getSelectedFile().getPath()));
            else
                ((NewProView)mainView).setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        }
        else if(mainView instanceof ModProView) {
            if (gestionar())
                ((ModProView)mainView).setPhoto(new ImageIcon(chooser.getSelectedFile().getPath()));
            else
                ((ModProView)mainView).setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
        }
    }
    public boolean gestionar(){
        return chooser.showOpenDialog(mainView) == JFileChooser.APPROVE_OPTION;
    }
}
