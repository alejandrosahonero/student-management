package dev.alejandrosahonero.logic.options.manage.matricular;

import dev.alejandrosahonero.gui.options.manage.MatricularView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatricularController implements ActionListener {
    private MatricularView matricularView;

    public MatricularController(MatricularView matricularView) {
        this.matricularView = matricularView;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == matricularView.getMatricularButton()) {
            matricularView.setPhoto(new ImageIcon("src/main/resources/img/photo-default.jpg"));
            matricularView.getDni().setText("DNI");
            matricularView.getApellidoPaterno().setText("Apellido Paterno");
            matricularView.getApellidoMaterno().setText("Apellido Materno");
            matricularView.getNombres().setText("Nombres");
            matricularView.getFechaNac().setText("Fecha de Nacimiento");
            matricularView.getSexo().setText("Sexo");
            matricularView.getModulo().setText("Módulo");
            matricularView.getNuss().setText("NUSS");
            matricularView.getEmail().setText("Email");
            matricularView.getTelefono().setText("Teléfono");
        }
    }
}
