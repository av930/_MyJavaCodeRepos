import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_4 {

      static JLabel lab1 = new JLabel("버튼(1)을 누르세요.");
      static JLabel lab2 = new JLabel("버튼(2)을 누르세요.");

      public static void main(String[] args) {
       	JFrame frm = new JFrame("SWING 프레임");
        JPanel leftp = new JPanel();
        JPanel rightp = new JPanel();
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true,  leftp, rightp); 
        sp.setDividerLocation(300);  

        JButton bt1 = new JButton("버튼(1)");
        bt1.setToolTipText("이것은 풍선 도움말(ToolTip)(1)");
        leftp.setLayout(new BorderLayout());
        leftp.add("North", lab1);
        leftp.add("South", bt1);
 
        JButton bt2 = new JButton("버튼(2)");
        bt2.setToolTipText("이것은 풍선 도움말(ToolTip)(2)");
        rightp.setLayout(new BorderLayout());
        rightp.add("North", lab2);
        rightp.add("South", bt2);

        frm.setSize(700, 400);
        frm.getContentPane().add(sp);
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