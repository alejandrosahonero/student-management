package dev.alejandrosahonero.gui.options.list;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.list.ListModController;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ListModView extends MainView {
    private JLabel background;
    private JTable listAlum;
    private JPanel tablePanel;
    private DefaultTableModel model;
    private ListModController listModController;

    public ListModView() {
        super("Módulos");
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

        model = new DefaultTableModel(new String[]{"Siglas", "Nombre", "Descripción", "Asignaturas"}, 0);
        listAlum = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(listAlum);
        tablePanel.add(scrollPane);

        listModController = new ListModController(this);
        listModController.cargarDatos(model);

        background.add(tablePanel);
    }
}
