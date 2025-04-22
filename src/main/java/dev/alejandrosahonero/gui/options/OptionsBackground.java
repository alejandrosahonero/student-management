package dev.alejandrosahonero.gui.options;

import dev.alejandrosahonero.gui.MainView;

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
        g.fillRect(windowsWidth/2, windowsHeight/12, 4, windowsHeight/6*4);
    }
}
