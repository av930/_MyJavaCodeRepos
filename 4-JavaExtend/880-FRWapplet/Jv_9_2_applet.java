import java.applet.*;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;

public class Jv_9_2_applet extends Applet {
    Graphics g;
    String str;
    Font aP, sB, tI, aN;
    Color c1, c2, c3, c4;

    public void init() {
        aP = new Font("Arial", Font.PLAIN, 24);

        c1 = new Color(255, 0, 0);
        sB = new Font("Serif", Font.BOLD, 20);

        c2 = new Color(0, 255, 0);
        tI = new Font("TimesRoman", Font.ITALIC, 16);
        aN = new Font("Arial", 3, 24);
    }

    public void paint(Graphics g) {
        g.setFont(aP);
        g.setColor(c1);
        str = "<Font Name:Arial / Style:PLAIN / layoutSize:24>";
        g.drawString(str, 5, 100);

        g.setFont(sB);
        g.setColor(c2);
        str = "<Font Name:Serif / Style:Bold / layoutSize:20>";
        g.drawString(str, 5, 150);

        g.setFont(tI);
        g.setColor(Color.blue);
        str = "<Font Name:TimesRoman / Style:ITALIC / layoutSize:16>";
        g.drawString(str, 5, 200);

        g.setFont(aN);
        str = "<Font Name:Arial / Style:3 / layoutSize:24>";
        g.drawString(str, 5, 250);
    }
} 