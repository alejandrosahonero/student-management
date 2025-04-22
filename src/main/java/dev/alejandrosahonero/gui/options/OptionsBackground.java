package dev.alejandrosahonero.gui.options;

import javax.swing.*;
import java.awt.*;

public class OptionsBackground extends JLabel {
    public OptionsBackground() {
        super();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Color c = new Color(0x000000);
        g.setColor(c);
        g.fillOval(10,10, 50, 50);
    }
}
