import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_7 {

      static JLabel lab = new JLabel("��ư�� ��������.");
      static JFrame frm;
      static JOptionPane op; 
      static JButton bt1, bt2, bt3, bt4; 

      public static void main(String[] args) {
        frm = new JFrame("SWING ������");
        bt1 = new JButton("��� ��ȭ���� ��ư");
        bt1.setToolTipText("��� ��ȭ���� ��ư ǳ�� ����(ToolTip)");

        bt2 = new JButton("Ȯ�� ��ȭ���� ��ư");
        bt2.setToolTipText("Ȯ�� ��ȭ���� ��ư ǳ�� ����(ToolTip)");

        bt3 = new JButton("���� ��ȭ���� ��ư");
        bt3.setToolTipText("���� ��ȭ���� ��ư ǳ�� ����(ToolTip)");

        bt4 = new JButton("�Է� ��ȭ���� ��ư");
        bt4.setToolTipText("�Է� ��ȭ���� ��ư ǳ�� ����(ToolTip)");

        op = new JOptionPane();
 
        frm.getContentPane().add("North", lab);
        frm.getContentPane().add("West", bt1);
        frm.getContentPane().add("Center", bt2);
        frm.getContentPane().add("East", bt3);
        frm.getContentPane().add("South", bt4);
         
        frm.setSize(500, 300);
        frm.setVisible(true);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        bt1.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
                 lab.setText("��� ��ȭ���� ��ư�� ������ �����Դϴ�.");
                 op.showMessageDialog(frm, "This is a warning","��� ��ȭ����", JOptionPane.WARNING_MESSAGE);
             }	
        } );

        bt2.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
           	 lab.setText("Ȯ�� ��ȭ���� ��ư�� ������ �����Դϴ�.");
                 op.showConfirmDialog(frm, "This is right or wrong.","Ȯ�� ��ȭ����", JOptionPane.YES_NO_OPTION);
             }	
        } );

        bt3.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
                 String[] choices = {"Ȯ��", "����"};
              	 lab.setText("���� ��ȭ���� ��ư�� ������ �����Դϴ�.");
                 op.showOptionDialog(frm, "This is an option","���� ��ȭ����", 
                       JOptionPane.YES_NO_OPTION,
                       JOptionPane.QUESTION_MESSAGE, 
                       null, choices, choices[1]);
             }	
        } );

        bt4.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
                String[] choices = {"Ȯ��", "�ణȮ��", "�ణ����", "����"};
                lab.setText("�Է� ��ȭ���� ��ư�� ������ �����Դϴ�.");
                op.showInputDialog(frm, "����?","�Է� ��ȭ����", 
                JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]); }	
        } );

     }
}