import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_6 {

      static JLabel lab = new JLabel("��ư�� ��������.");
 
      public static void main(String[] args) {
       	JFrame frm = new JFrame("SWING ������");

        DefaultMutableTreeNode rnode = new DefaultMutableTreeNode("������ 2006 32��");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A��");
        DefaultMutableTreeNode f = new DefaultMutableTreeNode("F��");
        DefaultMutableTreeNode g = new DefaultMutableTreeNode("G��");
        rnode.add(a); 
        rnode.add(f); 
        rnode.add(g); 
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("����");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("�ڽ�Ÿ��ī");
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("���⵵��");
        DefaultMutableTreeNode a4 = new DefaultMutableTreeNode("������");
        a.add(a1); 
        a.add(a2); 
        a.add(a3); 
        a.add(a4); 
        DefaultMutableTreeNode f1 = new DefaultMutableTreeNode("ȣ��");
        DefaultMutableTreeNode f2 = new DefaultMutableTreeNode("�Ϻ�");
        DefaultMutableTreeNode f3 = new DefaultMutableTreeNode("�����");
        DefaultMutableTreeNode f4 = new DefaultMutableTreeNode("ũ�ξ�Ƽ��");
        f.add(f1); 
        f.add(f2); 
        f.add(f3); 
        f.add(f4); 
        DefaultMutableTreeNode g1 = new DefaultMutableTreeNode("���ѹα�");
        DefaultMutableTreeNode g2 = new DefaultMutableTreeNode("������");
        DefaultMutableTreeNode g3 = new DefaultMutableTreeNode("������");
        DefaultMutableTreeNode g4 = new DefaultMutableTreeNode("���");
        g.add(g1); 
        g.add(g2); 
        g.add(g3); 
        g.add(g4); 
  
        JTree tr = new JTree(rnode);   
        JScrollPane sc2 = new JScrollPane(tr);  


        String[] title = {"������G�� ������", "�ֵ�����", "����"};
        Object [][] data = {
                {"�ѱ�", "�����", new Integer(9)},
                {"������", "������", new Integer(4)},
                {"������", "��â��", new Integer(3)},
                {"���", "������", new Integer(0)}
         }; 

         JTable table = new JTable(data, title);
         JScrollPane sc = new JScrollPane(table);  

        JButton bt = new JButton("��ư");
        bt.setToolTipText("�̰��� ǳ�� ����(ToolTip)");

        frm.setLayout(new BorderLayout());
        frm.getContentPane().add("North", lab);
        frm.getContentPane().add("South", bt);
        frm.getContentPane().add("Center", sc2);
        frm.getContentPane().add("East", sc);
        
        frm.setSize(700, 400);
        frm.setVisible(true);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        bt.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
              	     lab.setText("��ư�� ������ �����Դϴ�.");
             }	
        });
     }
}