import java.io.*;

class Jv_10_9 {
   public static void main(String[] args) throws java.io.IOException {
        if (args.length < 2) {
   	    System.out.println("원본 파일명: args[0] => 복사 파일명: args[1] 사용원함");
            return;    
        } 
     
    	System.out.println("===== 입출력 프로그램(입력: 파일 / 출력: 파일, 화면) =====");
	System.out.print("== 바이트 스트림(FileInputStream / FileOutputStream");
	System.out.print(" / OutputStream 클래스) ==");
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
         System.out.println("원본 파일명:" + args[0] + "=> 복사 파일명:" + args[1]);   
   }
}
