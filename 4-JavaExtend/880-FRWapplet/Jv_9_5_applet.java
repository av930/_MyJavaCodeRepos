import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Jv_9_5_applet extends Applet implements MouseListener {
    Image img0, img1;
    String iname = " ";
    int a = 1;

    public void init() {
        addMouseListener(this);
    }

    public void mouseEntered(MouseEvent me) {
        iname = getParameter("img" + a);
        img1 = getImage(getDocumentBase(), iname);
        repaint();
        a++;
        if (a == 4) a = 1;
    }

    public void mouseExited(MouseEvent me) {
    }

    public void mouseClicked(MouseEvent me) {
    }

    public void mousePressed(MouseEvent me) {
    }

    public void mouseReleased(MouseEvent me) {
    }

    public void paint(Graphics g) {
        img0 = getImage(getDocumentBase(), "ken0.jpg");
        g.drawImage(img0, 10, 10, this);

        g.drawImage(img1, 300, 300, this);
    }
} 