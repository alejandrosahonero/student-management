package dev.alejandrosahonero.gui.options.manage.modulo;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.gui.options.manage.MainManageView;
import dev.alejandrosahonero.logic.options.manage.modulo.AddAsigModController;
import dev.alejandrosahonero.logic.options.manage.profesor.AddModProController;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AddAsigModView extends MainView {
    private JPanel backPanel, asigPanel, buttonPanel;
    private JButton acceptButton;
    private JButton cancelButton;
    private MainManageView mainManageView;

    public AddAsigModView(MainManageView mainManageView) {
        super("Añadir las asignaturas");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(getWindowsWidth()/2, getWindowsHeight()/2);

        this.mainManageView = mainManageView;

        initComponents();
    }
    private void initComponents(){
        backPanel = new JPanel(new BorderLayout());
        asigPanel = new JPanel(new FlowLayout());
        buttonPanel = new JPanel(new FlowLayout());

        asignaturas();
        acceptButton();
        cancelButton();

        backPanel.add(asigPanel, BorderLayout.CENTER);
        backPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(backPanel);
    }
    private void asignaturas(){
        if(mainManageView instanceof ModModView){
            List<String> asignaturas = AddAsigModController.getAllAsignaturas();
            List<String> asignaturasActuales = AddAsigModController.getSearchedAsignaturas(this);
            for(String a : asignaturas){
                JCheckBox asignatura = new JCheckBox(a);
                asignatura.setFont(new Font("Tahoma", Font.BOLD, 20));
                asignatura.setForeground(new Color(0x3D5A40));
                asignatura.setPreferredSize(new Dimension(getButtonsWidth()/2, getButtonsHeight()/2));
                if(asignaturasActuales.contains(a)){
                    asignatura.setSelected(true);
                }
                asigPanel.add(asignatura);
            }
        }
        else if(mainManageView instanceof NewModView){
            List<String> asignaturas = AddAsigModController.getAllAsignaturas();
            for(String a : asignaturas){
                JCheckBox asignatura = new JCheckBox(a);
                asignatura.setFont(new Font("Tahoma", Font.BOLD, 20));
                asignatura.setForeground(new Color(0x3D5A40));
                asignatura.setPreferredSize(new Dimension(getButtonsWidth()/2, getButtonsHeight()/2));
                asigPanel.add(asignatura);
            }
        }
    }
    private void acceptButton(){
        acceptButton = createButton("ACEPTAR", 20, 0x3D5A40, 0xffffff);
        acceptButton.setPreferredSize(new Dimension(getButtonsWidth(), getButtonsHeight()/2));
        acceptButton.addActionListener(new AddAsigModController(this));
        buttonPanel.add(acceptButton);
    }
    private void cancelButton(){
        cancelButton = createButton("CANCELAR", 20, 0x3D5A40, 0xffffff);
        cancelButton.setPreferredSize(new Dimension(getButtonsWidth(), getButtonsHeight()/2));
        cancelButton.addActionListener(new AddAsigModController(this));
        buttonPanel.add(cancelButton);
    }

    //Getters
    public JButton getAcceptButton() {
        return acceptButton;
    }
    public JButton getCancelButton() {
        return cancelButton;
    }
    public JPanel getAsigPanel() {
        return asigPanel;
    }
    public MainManageView getMainManageView() {
        return mainManageView;
    }
}
