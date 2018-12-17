import java.applet.*;
import java.awt.*;
import java.awt.Graphics;

public class Jv_9_4_applet extends Applet {
    public void paint(Graphics g) {
        g.drawLine(10, 20, 30, 40);
        g.drawLine(50, 20, 70, 40);
        g.drawLine(110, 20, 130, 40);

        g.setColor(Color.blue);
        g.drawRect(10, 60, 40, 50);
        g.fillRect(70, 60, 40, 50);
        g.drawRoundRect(150, 60, 40, 50, 30, 40);
        g.fillRoundRect(200, 60, 40, 50, 30, 40);

        g.setColor(Color.red);
        Polygon p = new Polygon();
        p.addPoint(30, 130);
        p.addPoint(10, 230);
        p.addPoint(50, 230);
        p.addPoint(30, 130);
        g.drawPolygon(p);

        int[] xPoints = {130, 80, 105, 155, 170, 130};
        int[] yPoints = {130, 180, 230, 230, 170, 130};
        int nPoints = xPoints.length;
        g.drawPolygon(xPoints, yPoints, nPoints);

        g.setColor(Color.green);
        g.drawOval(10, 250, 40, 40);
        g.fillOval(70, 250, 40, 40);
        g.fillOval(130, 250, 40, 60);
        g.drawArc(200, 250, 40, 40, 0, 90);
        g.drawArc(260, 250, 40, 40, 120, -180);
        g.fillArc(330, 250, 40, 40, 0, 90);
        g.fillArc(400, 250, 40, 40, 120, -180);
    }
}