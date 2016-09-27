

/**
 * Created by SanderD on 14-9-2016.
 */
 package oefenen;

import java.applet.Applet;
import java.awt.*;

public class oefenen extends Applet {

    Color achtergrond;
    Color tekst;
    int getal1;
    int getal2;

    //override
    public void init() {
        super.init();
        achtergrond = new Color(255, 99, 18);
        tekst = new Color(0, 32, 120);
        getal1 = 20;
        getal2 = 30;
        setBackground(achtergrond);
    }

    //override
    public void paint(Graphics g) {
        super.paint(g);
        int x = 50;
        int y = 50;
        g.drawString("Som is: " + (getal1 + getal2), x, y);
    }
}
