package H04;

//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Ovaal extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawOval(10, 10, 50, 100);
        g.fillOval(100, 20, 50, 100);
    }
}