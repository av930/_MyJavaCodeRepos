import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_2 {

      static JLabel lab = new JLabel("��ư�� ��������.");

      public static void main(String[] args) {
       	JFrame frm = new JFrame("SWING ������");
        JButton bt = new JButton("��ư");
        bt.setToolTipText("�̰��� ǳ�� ����(ToolTip)");
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
              	     lab.setText("��ư�� ������ �����Դϴ�.");
             }	
        });
     }
}