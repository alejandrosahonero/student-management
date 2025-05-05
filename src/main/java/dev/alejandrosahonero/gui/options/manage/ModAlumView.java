package dev.alejandrosahonero.gui.options.manage;

import dev.alejandrosahonero.logic.options.manage.alumno.SearchButtonController;

public class ModAlumView extends MainManageView {
    public ModAlumView(){
        super("Modificar Alumno");
        super.doneButton("MODIFICAR");

        searchBar();
        searchButton();
    }
    @Override
    protected void doneButton(String nameButton){
        doneButton = createButton(nameButton, 0, 0, 20, 0x3D5A40, 0xffffff);
        doneButton.setBounds(margin*13/3+getButtonsWidth()*3, margin*2+photoHeight, getButtonsWidth(), getButtonsHeight());
        //doneButton.addActionListener(new SearchButtonController(this));

        background.add(doneButton);
    }
    @Override
    protected void searchButton(){
        searchButton = createButton("BUSQ", getButtonsWidth()/20, getButtonsHeight()/2, 15, 0x3D5A40, 0xffffff);
        searchButton.setBounds(getWindowsWidth()/2+margin*2+getButtonsWidth()/2, margin+margin/2, getButtonsWidth()/3, getButtonsHeight()/2);
        searchButton.addActionListener(new SearchButtonController(this));
        background.add(searchButton);
    }
}
