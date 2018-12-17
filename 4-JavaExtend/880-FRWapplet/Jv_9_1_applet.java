import java.applet.*;
import java.awt.*;

public class Jv_9_1_applet extends Applet {
    String str = " ";

    public void init() {
        str += "==init()메소드 실행==   ";
    }

    public void start() {
        str += "**start()메소드 실행**   ";
    }

    public void stop() {
        str += "--stop()메소드 실행--   ";
    }

    public void destroy() {
        System.out.println("++destroy() 메소드 실행++   ");
    }

    public void paint(Graphics g) {
        g.drawString("<애플릿의 주기(생성부터 종료까지)>", 30, 50);
        str += "&&paint()메소드 실행&&   ";
        g.drawString(str, 30, 100);
    }
}