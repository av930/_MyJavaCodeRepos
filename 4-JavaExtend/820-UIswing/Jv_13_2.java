import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_2 {

      static JLabel lab = new JLabel("버튼을 누르세요.");

      public static void main(String[] args) {
       	JFrame frm = new JFrame("SWING 프레임");
        JButton bt = new JButton("버튼");
        bt.setToolTipText("이것은 풍선 도움말(ToolTip)");
        frm.getContentPane().add("North", lab);
        frm.getContentPane().add("South", bt);
        
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