package dev.alejandrosahonero.gui.options;

import dev.alejandrosahonero.gui.options.OptionsView;

import javax.swing.*;
import java.awt.*;

public class OptionsBackground extends JLabel {
    private int windowsWidth;
    private int windowsHeight;

    public OptionsBackground(int windowsWidth, int windowsHeight) {
        super();
        this.windowsWidth = windowsWidth;
        this.windowsHeight = windowsHeight;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color c = new Color(0x3D5A40);
        g.setColor(c);
        //Línea del medio
        g.fillRect(windowsWidth/2, OptionsView.getMarginTitle(), OptionsView.getLineWidth(), windowsHeight-OptionsView.getMarginTitle()*3);
        //Lina debajo title1
        g.fillRect(windowsWidth/12, OptionsView.getMarginTitle()*5/2, windowsWidth/3, OptionsView.getLineWidth());
        //Línea debajo title2
        g.fillRect(windowsWidth/2+windowsWidth/12, OptionsView.getMarginTitle()*5/2, windowsWidth/3, OptionsView.getLineWidth());
    }
}
