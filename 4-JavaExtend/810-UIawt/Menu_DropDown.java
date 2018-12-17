import java.awt.*;
import java.awt.event.*;

public class Menu_DropDown extends Frame implements ActionListener {
       Frame f;
       MenuBar mb;
       Menu fm, em, fsm;
       Label lb;
       String msg = " ";

       MenuItem m11, m12, m13, m14, m15, m16;
       MenuItem m21, m22, m23, m24;
       MenuItem m31, m32, m33, m34, m35, m36;
 
       public Menu_DropDown() {
         f = new Frame("메뉴에 온것을 환영합니다!");
         mb = new MenuBar();
         fm = new Menu("파일");
         em = new Menu("편집");
         fsm = new Menu("파일 단축키");
       }

       public void startFrame() { 
         f.setMenuBar(mb);
         mb.add(fm);  
         fm.add(m11 = new MenuItem("새글 작성"));
         fm.add(m12 = new MenuItem("파일 열기"));
         fm.add(m13 = new MenuItem("파일 저장"));
         fm.add(m14 = new MenuItem("파일 다른 이름 저장"));
         fm.addSeparator();
         fm.add(m15 = new MenuItem("내용 출력"));
         fm.addSeparator();
         fm.add(m16 = new MenuItem("끝내기"));
 
         mb.add(em);  
         em.add(m21 = new CheckboxMenuItem("복사"));
         em.add(m22 = new CheckboxMenuItem("붙여넣기"));
         em.addSeparator();
         em.add(m23 = new CheckboxMenuItem("부분 검색"));
         em.add(m24 = new CheckboxMenuItem("전체 검색"));

         mb.add(fsm);  
         fsm.add(m31 = new MenuItem("새글 작성", new MenuShortcut('N')));
         fsm.add(m32 = new MenuItem("파일 열기", new MenuShortcut('O')));
 
         MenuItem m33 = new MenuItem("파일 저장");
         m33.setShortcut(new MenuShortcut('S'));
 
         MenuShortcut sas = new MenuShortcut('S', true);
         MenuItem m34 = new MenuItem("파일 다른 이름 저장", sas);
         fsm.add(m34);

         fsm.addSeparator();

         fsm.add(m35 = new MenuItem("내용 출력", new
                        MenuShortcut(KeyEvent.VK_P)));

         fsm.addSeparator();
         fsm.add(m36 = new MenuItem("끝내기", new MenuShortcut('X')));

         lb = new Label
              ("                                                       ");
         lb.setBackground(Color.yellow);
         f.add(lb); 

	 f.setSize(500,300);
         f.setVisible(true);
         
         m11.addActionListener(this);
         m12.addActionListener(this);
         m13.addActionListener(this);
         m14.addActionListener(this);
         m15.addActionListener(this);
         m16.addActionListener(this);
    }

     public void actionPerformed(ActionEvent ae) {
           msg = "선택 항목 ==> ";
 
          if (ae.getSource() == m11)
              msg += "새글 작성";
          else if (ae.getSource() == m12)
              msg += "파일 열기";
          else if (ae.getSource() == m13)
              msg += "파일 저장";
          else if (ae.getSource() == m14)
              msg += "파일 다른 이름 저장";
          else if (ae.getSource() == m15)
              msg += "내용 출력";
          else if (ae.getSource() == m16)
              msg += "끝내기";
 
           lb.setText(msg);          
     }

    public static void main(String[] args) { 
         Menu_DropDown kkk = new Menu_DropDown();
          kkk.startFrame();
     }
}