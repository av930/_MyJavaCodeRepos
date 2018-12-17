import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_6 {

      static JLabel lab = new JLabel("버튼을 누르세요.");
 
      public static void main(String[] args) {
       	JFrame frm = new JFrame("SWING 프레임");

        DefaultMutableTreeNode rnode = new DefaultMutableTreeNode("월드컵 2006 32강");
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A조");
        DefaultMutableTreeNode f = new DefaultMutableTreeNode("F조");
        DefaultMutableTreeNode g = new DefaultMutableTreeNode("G조");
        rnode.add(a); 
        rnode.add(f); 
        rnode.add(g); 
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("독일");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("코스타리카");
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("에콰도르");
        DefaultMutableTreeNode a4 = new DefaultMutableTreeNode("폴란드");
        a.add(a1); 
        a.add(a2); 
        a.add(a3); 
        a.add(a4); 
        DefaultMutableTreeNode f1 = new DefaultMutableTreeNode("호주");
        DefaultMutableTreeNode f2 = new DefaultMutableTreeNode("일본");
        DefaultMutableTreeNode f3 = new DefaultMutableTreeNode("브라질");
        DefaultMutableTreeNode f4 = new DefaultMutableTreeNode("크로아티아");
        f.add(f1); 
        f.add(f2); 
        f.add(f3); 
        f.add(f4); 
        DefaultMutableTreeNode g1 = new DefaultMutableTreeNode("대한민국");
        DefaultMutableTreeNode g2 = new DefaultMutableTreeNode("스위스");
        DefaultMutableTreeNode g3 = new DefaultMutableTreeNode("프랑스");
        DefaultMutableTreeNode g4 = new DefaultMutableTreeNode("토고");
        g.add(g1); 
        g.add(g2); 
        g.add(g3); 
        g.add(g4); 
  
        JTree tr = new JTree(rnode);   
        JScrollPane sc2 = new JScrollPane(tr);  


        String[] title = {"월드컵G조 국가명", "주득점원", "승점"};
        Object [][] data = {
                {"한국", "고수지", new Integer(9)},
                {"스위스", "고유진", new Integer(4)},
                {"프랑스", "부창미", new Integer(3)},
                {"토고", "고응남", new Integer(0)}
         }; 

         JTable table = new JTable(data, title);
         JScrollPane sc = new JScrollPane(table);  

        JButton bt = new JButton("버튼");
        bt.setToolTipText("이것은 풍선 도움말(ToolTip)");

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
              	     lab.setText("버튼이 눌러진 상태입니다.");
             }	
        });
     }
}