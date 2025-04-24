package dev.alejandrosahonero.gui.options.list;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.list.ListProController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ListProView extends MainView {
    private JLabel background;
    private JTable listAlum;
    private JPanel tablePanel;
    private DefaultTableModel model;
    private ListProController listProController;

    public ListProView() {
        super("Profesores");
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

        model = new DefaultTableModel(new String[]{"ID Profesor", "DNI", "Apellido Paterno", "Apellido Materno", "Nombres", "Edad"}, 0);
        listAlum = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(listAlum);
        tablePanel.add(scrollPane);

        listProController = new ListProController(this);
        listProController.cargarDatos(model);

        background.add(tablePanel);
    }
}
