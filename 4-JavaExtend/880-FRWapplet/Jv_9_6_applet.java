import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Jv_9_6_applet extends Applet implements ActionListener, TextListener {
    private Label lb, lb0, lb1, lb2, lb3, lb4, lb5;
    private Label lb6, lb7, label1, label2, label3;
    private Button bt1, bt2, bt3, bt4, bt5;
    private TextField t;
    private TextArea ta1, ta2;
    int m = 0, n = 0;
    int i = 0, j = 0;

    public void init() {
        lb = new Label("����� �����ϴ� ������ �����ϼ���?");

        lb1 = new Label("õ�� ��ư:");
        bt1 = new Button("õ��");

        lb2 = new Label("���� ��ư:", Label.LEFT);
        lb2.setBackground(Color.red);
        bt2 = new Button("����");
        bt2.setBackground(Color.red);

        lb3 = new Label("���� ��ư:", Label.CENTER);
        lb3.setBackground(Color.green);
        bt3 = new Button("����");
        bt3.setBackground(Color.green);

        lb4 = new Label("���� ��ư:", Label.RIGHT);
        lb4.setBackground(Color.blue);
        bt4 = new Button("����");
        bt4.setBackground(Color.blue);

        lb5 = new Label("���� ��ư:");
        lb5.setBackground(Color.yellow);
        bt5 = new Button("����");
        bt5.setBackground(Color.yellow);

        label3 = new Label("����� �����ϴ� ������ �Է��ϼ���?");
        t = new TextField(30);
        t.setText("õ�� / ���� / ���� / ���� / ����");
        t.setBackground(Color.green);

        ta1 = new TextArea("õ��\n����", 3, 20);
        ta2 = new TextArea("õ��\n����\n���� \n����", 5, 20);
        m = ta1.getRows();
        n = ta1.getColumns();
        lb6 = new Label("1st�ؽ�Ʈ����(��:" + m + " ��:" + n + ")");
        lb6.setBackground(Color.green);
        i = ta2.getRows();
        j = ta2.getColumns();
        lb7 = new Label("2nd�ؽ�Ʈ����(��:" + i + " ��:" + j + ")");
        lb7.setBackground(Color.yellow);

        label1 = new Label("���� ���==>");
        label1.setBackground(Color.green);
        label2 = new Label("            ");
        label2.setBackground(Color.green);

        setLayout(new FlowLayout());

        add(lb);

        add(lb1);
        add(bt1);

        add(lb2);
        add(bt2);

        add(lb3);
        add(bt3);

        add(lb4);
        add(bt4);

        add(lb5);
        add(bt5);

        add(label3);
        add(t);
        add(lb6);
        add(ta1);
        add(lb7);
        add(ta2);


        add(label1);
        add(label2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        t.addActionListener(this);
        t.addTextListener(this);
    }

    public void actionPerformed(ActionEvent evt) {
        label2.setText(evt.getActionCommand());
    }

    public void textValueChanged(TextEvent tevt) {
        ta1.append("textfield ����: " + t.getText() + "\n");
        ta2.append("textfield ����: " + t.getText() + "\n");
    }
}