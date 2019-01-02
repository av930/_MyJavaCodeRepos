import java.io.*;

class Jv_10_10 {
   public static void main(String[] args) throws java.io.IOException {
        if (args.length < 2) {
   	    System.out.println("���� ���ϸ�: args[0] => ���� ���ϸ�: args[1] ������");
            return;    
        } 
     
    	System.out.println("===== ����� ���α׷�(�Է�: ���� / ���: ����, ȭ��) =====");
	System.out.print("== ���� ��Ʈ��(FileReader / FileWriter");
	System.out.print(" / PrintStream Ŭ����) ==");
        System.out.println();   

        FileReader fr = new FileReader(args[0]);
        FileWriter fw = new FileWriter(args[1]);
        int rByte = 0; 
        while ((rByte = fr.read()) != -1) {
           fw.write(rByte);
           System.out.print((char) rByte);
        }

         fr.close();
         fw.close();
         System.out.println();   
         System.out.println("���� ���ϸ�:" + args[0] + "=> ���� ���ϸ�:" + args[1]);   
   }
}
