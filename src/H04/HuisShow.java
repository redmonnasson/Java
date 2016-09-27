package H04;

import java.awt.*;
import java.applet.*;

public class HuisShow extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground (Color.black);
        g.setColor(Color.cyan);
        g.drawLine(80, 100, 320, 100);
        g.drawLine(80, 100, 200, 40);
        g.drawLine(200, 40, 320, 100);
        g.drawRect(100, 100, 200, 100);
        g.drawRect(180, 130, 40, 70);
        g.drawRect(120, 130, 40, 40);
    }
}
