import java.awt.*;
import java.awt.event.*;

public class Popup_FileOpen extends Frame  implements ActionListener {
      Panel p;
      Button b1, b2;
      private FileDialog fdia;  
      private Frame f;

      public Popup_FileOpen() {
          f = new Frame();
          p = new Panel();
          add(p, "South");
          b1 = new Button("파일(file) 대화상자 생성 버튼");
          b2 = new Button("종료 버튼");
          p.add(b1);
          p.add(b2);
          add(p);

          b1.addActionListener(this);
          b2.addActionListener(this);
      }

      public void actionPerformed(ActionEvent e) {
          if (e.getSource() == b1) {     
              fdia = new FileDialog(f, "열기 대화 창에 온 것을 환영합니다", FileDialog.LOAD);
              fdia.setVisible(true);
              b1.requestFocus();
           }

          if (e.getSource() == b2) {
 		System.exit(0);
          }
      }

      public static void main(String[] args) {
         Popup_FileOpen win = new Popup_FileOpen();
         win.setTitle("File Dialog sample");
         win.setSize(500,300);
         win.setVisible(true); 
      }
}