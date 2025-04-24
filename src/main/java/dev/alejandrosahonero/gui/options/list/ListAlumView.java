package dev.alejandrosahonero.gui.options.list;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.list.ListAlumController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ListAlumView extends MainView {
    private JLabel background;
    private JTable listAlum;
    private JPanel tablePanel;
    private DefaultTableModel model;
    private ListAlumController listAlumController;

    public ListAlumView() {
        super("Alumnos");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        initComponents();
    }
    private void initComponents(){
        background = new JLabel(getBackgroundImage());

        table();

        add(background);
    }
    private void table(){
        tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBounds(getWindowsWidth()/30, getWindowsHeight()/20, getWindowsWidth()-getWindowsWidth()/25*2, getWindowsHeight()-getWindowsHeight()/3);

        model = new DefaultTableModel(new String[]{"ID Matrícula", "DNI", "Apellido Paterno", "Apellido Materno", "Nombres", "Edad", "NUSS", "Módulo Actual"}, 0);
        listAlum = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(listAlum);
        tablePanel.add(scrollPane);

        listAlumController = new ListAlumController(this);
        listAlumController.cargarDatos(model);

        background.add(tablePanel);
    }

    public JTable getListAlum() {
        return listAlum;
    }
}
