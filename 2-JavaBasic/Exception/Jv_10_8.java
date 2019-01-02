import java.io.*;

class Jv_10_8 {
   public static void main(String[] args) throws java.io.IOException {	
	int in_char = 0; 
	System.out.println("===== 입출력 프로그램(입력: 키보드 / 출력: 화면) =====");
	System.out.println("== 바이트 스트림(InputStream / OutputStream / PrintStream 클래스) ==");
 	System.out.print("한 개의 문자 입력(read() 메소드 사용): ");
        in_char = System.in.read();
 	System.out.print("한 개의 문자 출력(write() 메소드 사용): ");
        System.out.write(in_char);   
        System.out.println();   
        System.out.print("한 개의 ASCII 코드 문자 출력 (print() 메소드 사용): " + in_char);   
        System.out.println();   
        System.out.println("한 개의 문자 출력(println() 메소드 사용): " + (char)in_char);   
   }
}