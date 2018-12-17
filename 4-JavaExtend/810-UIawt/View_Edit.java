import java.awt.*;
import java.awt.event.*;

public class View_Edit extends Frame implements KeyListener {
      private Window w;
      private TextArea ta;
      private TextField tf; 
 
      public View_Edit() {
        w = new Window(this);
        w.setLayout(new FlowLayout());
        w.add(new Label("New Window")); 
      }
  
      public void startFrame() {
        tf = new TextField(20);
        tf.addKeyListener(this);
        w.add(tf);
        ta = new TextArea(5,20);
        ta.setEditable(false);
        w.add(ta);         

        w.setLocation(100,150);  
        w.setBackground(Color.cyan);
        w.setSize(500,300);
        w.setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        addItem(e, "keyTyped");
    }

    public void keyPressed(KeyEvent e) {
        addItem(e, "keyPressed");
    }

    public void keyReleased(KeyEvent e) {
        addItem(e, "keyReleased");
    }

    protected void addItem(KeyEvent e, String s) {
        char c = e.getKeyChar();
        int kcode = e.getKeyCode();
        ta.append(s + " " + c + " " + kcode + " " + "\n");
    }

    public static void main(String[] args) {
        View_Edit kkk = new View_Edit();

        kkk.setLocation(50,100);  
        kkk.setSize(500,300);
        kkk.setVisible(true);

        kkk.startFrame();       	   
     }
}