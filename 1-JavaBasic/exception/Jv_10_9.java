import java.io.*;

class Jv_10_9 {
   public static void main(String[] args) throws java.io.IOException {
        if (args.length < 2) {
   	    System.out.println("���� ���ϸ�: args[0] => ���� ���ϸ�: args[1] ������");
            return;    
        } 
     
    	System.out.println("===== ����� ���α׷�(�Է�: ���� / ���: ����, ȭ��) =====");
	System.out.print("== ����Ʈ ��Ʈ��(FileInputStream / FileOutputStream");
	System.out.print(" / OutputStream Ŭ����) ==");
        System.out.println();   
        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);
        int rByte = 0; 
        while ((rByte = fis.read()) != -1) {
           fos.write(rByte);
           System.out.write(rByte);
        }

         fis.close();
         fos.close();
         System.out.println();   
         System.out.println("���� ���ϸ�:" + args[0] + "=> ���� ���ϸ�:" + args[1]);   
   }
}
