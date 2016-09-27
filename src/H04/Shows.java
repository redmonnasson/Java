package H05;



import java.awt.*;
import java.applet.*;

public class Shows extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20, 20, 100, 50);
        g.drawArc(140, 20, 100, 50, 360, 360);
        g.drawArc(140, 20, 100, 50, 360, 360);
        g.fillArc(140, 20, 100, 50, 135, 120);
        g.drawArc(140, 20, 100, 50, 360, 360);
        g.fillArc(300, 20, 100, 50, 360, 360);
        g.drawArc(140, 120, 100, 50, 360, 360);
        g.drawArc(20, 120, 100, 50, 360, 360);
        g.drawRoundRect(20, 120, 100, 50, 10, 10);
        g.fillArc(20, 120, 100, 50, 10, 10);
        g.drawRoundRect(280, 120, 100, 50, 10, 10);



    }
}