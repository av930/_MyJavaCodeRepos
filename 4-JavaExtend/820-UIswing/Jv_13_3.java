import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_3 {

      static JLabel lab1 = new JLabel("��ư(1)�� ��������.");
      static JLabel lab2 = new JLabel("��ư(2)�� ��������.");

      public static void main(String[] args) {
        JFrame frm = new JFrame("SWING ������");
        JDesktopPane dp = new JDesktopPane();
        JInternalFrame ifrm1 = new JInternalFrame("First JInternalFrame", true, true, true);               
        JInternalFrame ifrm2 = new JInternalFrame("Second JInternalFrame", true, true, true);               

        JButton bt1 = new JButton("��ư(1)");
        bt1.setToolTipText("�̰��� ǳ�� ����(ToolTip)(1)");
        ifrm1.getContentPane().add("North", lab1);
        ifrm1.getContentPane().add("South", bt1);
        ifrm1.setSize(200, 100);
        ifrm1.setVisible(true);
        dp.add(ifrm1);
 
        JButton bt2 = new JButton("��ư(2)");
        bt2.setToolTipText("�̰��� ǳ�� ����(ToolTip)(2)");
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