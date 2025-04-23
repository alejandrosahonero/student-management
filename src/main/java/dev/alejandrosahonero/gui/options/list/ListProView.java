package dev.alejandrosahonero.gui.options.list;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;
import java.awt.*;

public class ListProView extends MainView {
    private JLabel background;
    private JTable listAlum;
    private JPanel tablePanel;

    public ListProView() {
        super("Modificar Alumno");

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

        String[] columnNames = {"ID Matrícula", "Apellido Paterno", "Apellido Materno", "Nombres", "Edad"};
        Object[][] data = {
                {"1000", "Smith", "Smith",
                        "Juan", 5},
                {"1001", "Doe", "Smith",
                        "Pepe", 3},
                {"1002", "Black", "Smith",
                        "Victor", 2},
                {"1003", "White", "Smith",
                        "Andres Vicent", 20},
                {"1004", "Brown", "Smith",
                        "Paul", 10}
        };

        listAlum = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(listAlum);
        tablePanel.add(scrollPane);

        background.add(tablePanel);
    }
}
