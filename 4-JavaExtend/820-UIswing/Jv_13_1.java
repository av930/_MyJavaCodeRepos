import java.awt.*;
import java.awt.event.*;  

public class Jv_13_1 {

      static Label lab = new Label("버튼을 누르세요.");

      public static void main(String[] args) {
       	Frame frm = new Frame("AWT 프레임");
        Button bt = new Button("버튼");

        frm.add("North", lab);
        frm.add("South", bt);
        
        frm.setSize(500, 300);
        frm.setVisible(true);

        frm.addWindowListener(new WindowAdapter() {
       	     public void windowClosing(WindowEvent e) {	   
                    System.exit(0);
             }          
        });
         
        bt.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
              	     lab.setText("버튼이 눌러진 상태입니다.");
             }	
        });
     }
}