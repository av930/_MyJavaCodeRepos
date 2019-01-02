import java.io.*;

class Jv_10_10 {
   public static void main(String[] args) throws java.io.IOException {
        if (args.length < 2) {
   	    System.out.println("원본 파일명: args[0] => 복사 파일명: args[1] 사용원함");
            return;    
        } 
     
    	System.out.println("===== 입출력 프로그램(입력: 파일 / 출력: 파일, 화면) =====");
	System.out.print("== 문자 스트림(FileReader / FileWriter");
	System.out.print(" / PrintStream 클래스) ==");
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
         System.out.println("원본 파일명:" + args[0] + "=> 복사 파일명:" + args[1]);   
   }
}
