package dev.alejandrosahonero.gui.options.list;

import dev.alejandrosahonero.gui.MainView;

import javax.swing.*;
import java.awt.*;

public class ListAlumView extends MainView {
    private JLabel background;
    private JTable listAlum;
    private JPanel tablePanel;

    public ListAlumView() {
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

        String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
        Object[][] data = {
                {"Kathy", "Smith",
                        "Snowboarding", 5, false},
                {"John", "Doe",
                        "Rowing", 3, true},
                {"Sue", "Black",
                        "Knitting", 2, false},
                {"Jane", "White",
                        "Speed reading", 20, true},
                {"Joe", "Brown",
                        "Pool", 10, false}
        };

        listAlum = new JTable(data, columnNames);

        JScrollPane scrollPane = new JScrollPane(listAlum);
        tablePanel.add(scrollPane);

        background.add(tablePanel);
    }
}
