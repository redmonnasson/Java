package H04;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Show extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(10, 10, 300, 10);
        g.drawLine(10, 10, 150, 300);
        g.drawLine(150, 300, 300, 10);
    }
}
