package H08;
/**
 * Created by SanderD on 22-9-2016.
 */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knop1 extends Applet {

    TextField tekstvak;
    Label label;
    Button knop1;
    Button knop2;
    String s;

    public void init() {
        tekstvak = new TextField("", 40);
        tekstvak.addActionListener(new TekstvakListener());
// de knoppen
        knop1 = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop1.addActionListener(kl);

        knop2 = new Button("Reset");
        KnopListener1 rs = new KnopListener1();
        knop2.addActionListener(rs);

        label = new Label("Type iets " +
                "en druk op enter " + "klik op Ok");
        add(label);
        add(tekstvak);
        add(knop1);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 40, 100);
    }
// knop1
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
// knop 2
    class KnopListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                s = "";
            repaint();
        }
    }
// tekst vak
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
}
