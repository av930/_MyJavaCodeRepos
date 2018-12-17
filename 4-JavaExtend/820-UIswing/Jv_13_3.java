import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_3 {

      static JLabel lab1 = new JLabel("버튼(1)을 누르세요.");
      static JLabel lab2 = new JLabel("버튼(2)을 누르세요.");

      public static void main(String[] args) {
        JFrame frm = new JFrame("SWING 프레임");
        JDesktopPane dp = new JDesktopPane();
        JInternalFrame ifrm1 = new JInternalFrame("First JInternalFrame", true, true, true);               
        JInternalFrame ifrm2 = new JInternalFrame("Second JInternalFrame", true, true, true);               

        JButton bt1 = new JButton("버튼(1)");
        bt1.setToolTipText("이것은 풍선 도움말(ToolTip)(1)");
        ifrm1.getContentPane().add("North", lab1);
        ifrm1.getContentPane().add("South", bt1);
        ifrm1.setSize(200, 100);
        ifrm1.setVisible(true);
        dp.add(ifrm1);
 
        JButton bt2 = new JButton("버튼(2)");
        bt2.setToolTipText("이것은 풍선 도움말(ToolTip)(2)");
        ifrm2.getContentPane().add("North", lab2);
        ifrm2.getContentPane().add("South", bt2);
        ifrm2.setSize(200, 100);
        ifrm2.setBounds(250, 50, 300, 200);
        ifrm2.setVisible(true);
        dp.add(ifrm2);

        frm.setSize(600, 350);
        frm.getContentPane().add(dp);
        frm.setVisible(true);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        bt1.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
              	     lab1.setText("버튼(1)이 눌러진 상태입니다.");
             }	
        });
 
        bt2.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
              	     lab2.setText("버튼(2)이 눌러진 상태입니다.");
             }	
        });
     }
}