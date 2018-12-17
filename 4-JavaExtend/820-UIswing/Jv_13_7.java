import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

public class Jv_13_7 {

      static JLabel lab = new JLabel("버튼을 누르세요.");
      static JFrame frm;
      static JOptionPane op; 
      static JButton bt1, bt2, bt3, bt4; 

      public static void main(String[] args) {
        frm = new JFrame("SWING 프레임");
        bt1 = new JButton("경고 대화상자 버튼");
        bt1.setToolTipText("경고 대화상자 버튼 풍선 도움말(ToolTip)");

        bt2 = new JButton("확인 대화상자 버튼");
        bt2.setToolTipText("확인 대화상자 버튼 풍선 도움말(ToolTip)");

        bt3 = new JButton("선택 대화상자 버튼");
        bt3.setToolTipText("선택 대화상자 버튼 풍선 도움말(ToolTip)");

        bt4 = new JButton("입력 대화상자 버튼");
        bt4.setToolTipText("입력 대화상자 버튼 풍선 도움말(ToolTip)");

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
                 lab.setText("경고 대화상자 버튼이 눌러진 상태입니다.");
                 op.showMessageDialog(frm, "This is a warning","경고 대화상자", JOptionPane.WARNING_MESSAGE);
             }	
        } );

        bt2.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
           	 lab.setText("확인 대화상자 버튼이 눌러진 상태입니다.");
                 op.showConfirmDialog(frm, "This is right or wrong.","확인 대화상자", JOptionPane.YES_NO_OPTION);
             }	
        } );

        bt3.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
                 String[] choices = {"확신", "부정"};
              	 lab.setText("선택 대화상자 버튼이 눌러진 상태입니다.");
                 op.showOptionDialog(frm, "This is an option","선택 대화상자", 
                       JOptionPane.YES_NO_OPTION,
                       JOptionPane.QUESTION_MESSAGE, 
                       null, choices, choices[1]);
             }	
        } );

        bt4.addActionListener(new ActionListener() { 
             public void actionPerformed(ActionEvent ae) {  
                String[] choices = {"확신", "약간확신", "약간부정", "부정"};
                lab.setText("입력 대화상자 버튼이 눌러진 상태입니다.");
                op.showInputDialog(frm, "선택?","입력 대화상자", 
                JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]); }	
        } );

     }
}