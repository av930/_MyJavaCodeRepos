import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_5 {

      static JLabel lab = new JLabel("��ư�� ��������.");

      public static void main(String[] args) {
       	JFrame frm = new JFrame("SWING ������");

         JTabbedPane tp = new JTabbedPane();
         JPanel p1 = new JPanel();
         JPanel p2 = new JPanel();
         JPanel p3 = new JPanel();
         p1.add(new JButton("Display")); 
         p2.add(new JButton("Option")); 
         p3.add(new JButton("Help")); 
         tp.addTab("TAB 1", p1);
         tp.addTab("TAB 2", p2);
         tp.addTab("TAB 3", p3);

         JToolBar tb = new JToolBar();
         tb.add(new JButton("Toolbar 1")); 
         tb.add(new JButton("Toolbar 2")); 
         tb.add(new JButton("Toolbar 3")); 
         tb.add(new JButton("Toolbar 4")); 

        JButton bt = new JButton("��ư");
        bt.setToolTipText("�̰��� ǳ�� ����(ToolTip)");

        frm.setLayout(new BorderLayout());
        frm.getContentPane().add("North", lab);
        frm.getContentPane().add("South", bt);
        frm.getContentPane().add("Center", tp);
        frm.getContentPane().add("East", tb);
        
        frm.setSize(500, 300);
        frm.setVisible(true);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        bt.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
              	     lab.setText("��ư�� ������ �����Դϴ�.");
             }	
        });
     }
}