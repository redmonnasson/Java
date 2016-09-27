package H04;


import java.applet.*;

import java.awt.*;

public class Vlag extends Applet

{

    public void paint(Graphics g)

    {

        Color c;

        c = Color.black;

        g.setColor(c);

        g.fillRect(237, 104, 10, 500);

        c = Color.red;

        g.setColor(c);

        g.fillRect(248, 125, 200, 25);

        c = Color.white;

        g.setColor(c);

        g.fillRect(248, 150, 200, 25);

        c = Color.blue;

        g.setColor(c);

        g.fillRect(248, 175, 200, 25);


    }

}