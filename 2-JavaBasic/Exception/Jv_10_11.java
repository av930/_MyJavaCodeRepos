import java.io.*;

class Jv_10_11 {
   public static void main(String[] args) throws java.io.IOException {
        if (args.length < 2) {
   	    System.out.println("���� ���ϸ�: args[0] => ���� ���ϸ�: args[1] ������");
            return;    
        } 

        System.out.println("===== ����� ���α׷�(�Է�: ���� / ���: ����, ȭ��) =====");
        System.out.print("== ���� ��Ʈ��(FileReader / FileWriter / BufferedReader");
        System.out.print(" / BufferedWriter / PrintStream Ŭ����) ==");
        System.out.println();   

        FileReader fr = new FileReader(args[0]);
        FileWriter fw = new FileWriter(args[1]);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        String line;
        line = br.readLine(); 
        while (line != null) {
           bw.write(line, 0, line.length());
           System.out.print(line);
           bw.newLine();
           line = br.readLine();
        }

         br.close();
         bw.close();
         System.out.println();   
         System.out.println("���� ���ϸ�:" + args[0] + "=> ���� ���ϸ�:" + args[1]);   
   }
}