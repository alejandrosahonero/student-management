package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.logic.options.manage.alumno.ModAlumController;

public class ModAlumView extends MainManageView {
    public ModAlumView(){
        super("Modificar Alumno");
        super.doneButton("MODIFICAR");

        searchTitle();
        searchBar();
        searchButton();
    }
    @Override
    protected void doneButton(String nameButton){
        doneButton = createButton(nameButton, 0, 0, 20, 0x3D5A40, 0xffffff);
        doneButton.setBounds(margin*13/3+getButtonsWidth()*3, margin*2+photoHeight, getButtonsWidth(), getButtonsHeight());
        doneButton.addActionListener(new ModAlumController(this));

        background.add(doneButton);
    }
}
