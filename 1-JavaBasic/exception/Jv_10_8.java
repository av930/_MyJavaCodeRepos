import java.io.*;

class Jv_10_8 {
   public static void main(String[] args) throws java.io.IOException {	
	int in_char = 0; 
	System.out.println("===== ����� ���α׷�(�Է�: Ű���� / ���: ȭ��) =====");
	System.out.println("== ����Ʈ ��Ʈ��(InputStream / OutputStream / PrintStream Ŭ����) ==");
 	System.out.print("�� ���� ���� �Է�(read() �޼ҵ� ���): ");
        in_char = System.in.read();
 	System.out.print("�� ���� ���� ���(write() �޼ҵ� ���): ");
        System.out.write(in_char);   
        System.out.println();   
        System.out.print("�� ���� ASCII �ڵ� ���� ��� (print() �޼ҵ� ���): " + in_char);   
        System.out.println();   
        System.out.println("�� ���� ���� ���(println() �޼ҵ� ���): " + (char)in_char);   
   }
}