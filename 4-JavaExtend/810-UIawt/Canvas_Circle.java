import java.awt.*;

class pCanvas extends Canvas {
      public pCanvas() {
      }
      public void paint(Graphics g) {
         g.drawOval(0,0,399,299);
      }
}

public class Canvas_Circle extends Frame {
       private pCanvas c;
       private ScrollPane sp;

       public Canvas_Circle(String title) {
         super(title);
         setSize(400,300); 
         setVisible(true);
         c = new pCanvas();
         c.setSize(400, 300);
         sp = new ScrollPane();
         sp.add(c);
         sp.setSize(200,100);
         add(sp);
         setVisible(true);
      }

     public static void main(String[] args) { 
         new Canvas_Circle("스크롤 페인(ScrollPane)에 온 것을 환영합니다!");  
     }
} 