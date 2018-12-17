import java.awt.*;
import java.awt.event.*;

public class Popup_General extends Frame  implements ActionListener {
      SimpleDialog sdia;
      Panel p;
      Button b1, b2;

      public Popup_General() {
          p = new Panel();
          add(p, "South");
          b1 = new Button("대화상자 생성 버튼");
          b2 = new Button("종료 버튼");
          b1.addActionListener(this);
          b2.addActionListener(this);
          p.add(b1);
          p.add(b2);
      }

      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == b1) {     
             if (sdia == null) {      
                sdia = new SimpleDialog(this, "Simple Dialog sample");
                }
             else
             {
                sdia.setVisible(true);
                b1.requestFocus();
             }
          } 

          if (e.getSource() == b2) {
 		System.exit(0);
          }
      }

      public static void main(String[] args) {
         Popup_General win = new Popup_General();
         win.setTitle("Dialog sample");
         win.setSize(500,300);
         win.setVisible(true); 
      }

class SimpleDialog extends Dialog implements ActionListener {  
      SimpleDialog ssdia;
      Panel p1, p2;
      Label lb;
      Button okbt, cancelbt;
      String msg1 = " ";
       
      SimpleDialog(Frame parent, String str) {
           super(parent, str, true);
           p1 = new Panel();
           p1.setLayout(new BorderLayout());
           p1.setBackground(Color.yellow);
           lb = new Label("간단한 대화 상자", Label.CENTER);
           p1.add(lb, "Center");

           p2 = new Panel();
           p2.setLayout(new FlowLayout());
           p2.setBackground(Color.green);
           p1.add(p2, "South");
           okbt = new Button("OK");
           cancelbt = new Button("Cancel");      
           p2.add(okbt);
           p2.add(cancelbt);
           okbt.addActionListener(this);
           cancelbt.addActionListener(this);
           addWindowListener(new MyWinListener());
  
           add(p1, BorderLayout.NORTH);
           add(p2, BorderLayout.SOUTH);
           setSize(300,200); 
           setVisible(true);

     }

     public void actionPerformed(ActionEvent e) {
         if (e.getSource() == okbt) {
           p1 = new Panel();
           p1.setLayout(new BorderLayout());
           p1.setBackground(Color.red);
           lb = new Label("OK 버튼");
           p1.add(lb);
           add(p1);
           setSize(300,200); 
           setVisible(true);
           addWindowListener(new MyWinListener());
           okbt.requestFocus();
          } 

          if (e.getSource() == cancelbt) {
             dispose();
          }
     }

     class MyWinListener extends WindowAdapter { 
           public void windowClosing(WindowEvent e) {
           dispose();
       }
    }
 }
}