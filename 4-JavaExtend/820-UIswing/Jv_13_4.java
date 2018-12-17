import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_4 {

      static JLabel lab1 = new JLabel("��ư(1)�� ��������.");
      static JLabel lab2 = new JLabel("��ư(2)�� ��������.");

      public static void main(String[] args) {
       	JFrame frm = new JFrame("SWING ������");
        JPanel leftp = new JPanel();
        JPanel rightp = new JPanel();
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true,  leftp, rightp); 
        sp.setDividerLocation(300);  

        JButton bt1 = new JButton("��ư(1)");
        bt1.setToolTipText("�̰��� ǳ�� ����(ToolTip)(1)");
        leftp.setLayout(new BorderLayout());
        leftp.add("North", lab1);
        leftp.add("South", bt1);
 
        JButton bt2 = new JButton("��ư(2)");
        bt2.setToolTipText("�̰��� ǳ�� ����(ToolTip)(2)");
        rightp.setLayout(new BorderLayout());
        rightp.add("North", lab2);
        rightp.add("South", bt2);

        frm.setSize(700, 400);
        frm.getContentPane().add(sp);
        frm.setVisible(true);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        bt1.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
              	     lab1.setText("��ư(1)�� ������ �����Դϴ�.");
             }	
        });
 
        bt2.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
              	     lab2.setText("��ư(2)�� ������ �����Դϴ�.");
             }	
        });
     }
}