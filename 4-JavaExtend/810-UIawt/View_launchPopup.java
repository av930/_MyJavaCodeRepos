import java.awt.*;
import java.awt.event.*;

public class View_launchPopup extends Frame implements ActionListener {
      private Frame f, frm;
      private Panel pa1, pa2, pa3;
      private Button bt1, bt2, bt3, bt4, bt5, bt6;
      private Button bt7, bt8, bt9, bt10, bt11, bt12;

      public View_launchPopup() {
    	f = new Frame("컨테이너(Container)에 온 것을 환영합니다!");
        pa1 = new Panel();
        pa2 = new Panel();
        pa3 = new Panel();

        bt1 = new Button("button 1(프레임 생성)");
        bt2 = new Button("button 2(프레임 삭제)");
        bt3 = new Button("button 3(종료)");
        bt4 = new Button("button 4");
        bt5 = new Button("button 5");
        bt6 = new Button("button 6");
        bt7 = new Button("button 7");
        bt8 = new Button("button 8");
        bt9 = new Button("button 9");
        bt10 = new Button("button 10");
        bt11 = new Button("button 11");
        bt12 = new Button("button 12");
    }

      public void startFrame() {
        pa1.setLayout(new FlowLayout());
        pa1.setBackground(Color.red);
        pa1.add(bt1);
        pa1.add(bt2);
        pa1.add(bt3);

        pa2.setLayout(new BorderLayout());
        pa2.setBackground(Color.green);
        pa2.add("West", bt4);
        pa2.add("Center", bt5);
        pa2.add("East", bt6);

        pa3.setLayout(new GridLayout(3,2));
        pa3.setBackground(Color.red);
        pa3.add(bt7);
        pa3.add(bt8);
        pa3.add(bt9);
        pa3.add(bt10);
        pa3.add(bt11);
        pa3.add(bt12);
  
        f.add(pa1, BorderLayout.EAST);  
        f.add(pa2, BorderLayout.CENTER);  
        f.add(pa3, BorderLayout.WEST);  
        f.pack();
        f.setSize(700,500);
        f.setVisible(true);

        bt1.addActionListener(this);         
        bt2.addActionListener(this);
        bt3.addActionListener(this);
     }
    
      public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("button 3(종료)")) { 
            System.exit(0);
        }

        if (ae.getSource() == bt1) {
            bt1.setEnabled(false);   
            bt2.setEnabled(true);   
            frm = new Frame("New Frame");
            frm.setBounds(200,200,160,160);
            frm.setVisible(true);
           }
        else if (ae.getSource() == bt2) {
            bt1.setEnabled(true);   
            bt2.setEnabled(false);   
            frm.dispose();
        } 
      }

      public static void main(String[] args) {
        View_launchPopup kkk = new View_launchPopup();
        kkk.startFrame();       	   
     }
}