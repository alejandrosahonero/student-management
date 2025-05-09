package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.gui.MainView;
import dev.alejandrosahonero.logic.options.manage.profesor.AddModProController;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AddModProView extends MainView {
    private JPanel backPanel, modPanel, buttonPanel;
    private JButton acceptButton;
    private JButton cancelButton;
    private MainManageView mainManageView;

    public AddModProView(MainManageView mainManageView) {
        super("Añadir módulos que imparte");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setSize(getWindowsWidth()/2, getWindowsHeight()/2);

        this.mainManageView = mainManageView;

        initComponents();
    }
    private void initComponents(){
        backPanel = new JPanel(new BorderLayout());
        modPanel = new JPanel(new FlowLayout());
        buttonPanel = new JPanel(new FlowLayout());

        modulos();
        acceptButton();
        cancelButton();

        backPanel.add(modPanel, BorderLayout.CENTER);
        backPanel.add(buttonPanel, BorderLayout.SOUTH);
        add(backPanel);
    }
    private void modulos(){
        if(mainManageView instanceof ModProView){
            List<String> modulos = AddModProController.getAllModulos();
            List<String> modulosActuales = AddModProController.getSearchedModulos(this);
            for(String m : modulos){
                JCheckBox modulo = new JCheckBox(m);
                modulo.setFont(new Font("Tahoma", Font.BOLD, 20));
                modulo.setForeground(new Color(0x3D5A40));
                modulo.setPreferredSize(new Dimension(getButtonsWidth()/2, getButtonsHeight()/2));
                if(modulosActuales.contains(m)){
                    modulo.setSelected(true);
                }
                modPanel.add(modulo);
            }
        }
        else if(mainManageView instanceof NewProView){
            List<String> modulos = AddModProController.getAllModulos();
            for(String m : modulos){
                JCheckBox modulo = new JCheckBox(m);
                modulo.setFont(new Font("Tahoma", Font.BOLD, 20));
                modulo.setForeground(new Color(0x3D5A40));
                modulo.setPreferredSize(new Dimension(getButtonsWidth()/2, getButtonsHeight()/2));
                modPanel.add(modulo);
            }
        }
    }
    private void acceptButton(){
        acceptButton = createButton("ACEPTAR", 20, 0x3D5A40, 0xffffff);
        acceptButton.setPreferredSize(new Dimension(getButtonsWidth(), getButtonsHeight()/2));
        acceptButton.addActionListener(new AddModProController(this));
        buttonPanel.add(acceptButton);
    }
    private void cancelButton(){
        cancelButton = createButton("CANCELAR", 20, 0x3D5A40, 0xffffff);
        cancelButton.setPreferredSize(new Dimension(getButtonsWidth(), getButtonsHeight()/2));
        cancelButton.addActionListener(new AddModProController(this));
        buttonPanel.add(cancelButton);
    }

    //Getters
    public JButton getAcceptButton() {
        return acceptButton;
    }
    public JButton getCancelButton() {
        return cancelButton;
    }
    public JPanel getModPanel() {
        return modPanel;
    }
    public MainManageView getMainManageView() {
        return mainManageView;
    }
}
