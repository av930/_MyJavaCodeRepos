import java.net.*;
import java.io.*;
public class Jv_11_4_UDPClient {
  public static void main(String args[]) {
   try {
          DatagramSocket ds = new DatagramSocket();
          InetAddress ia = InetAddress.getByName("localhost");
          byte[] bf = args[0].getBytes();
          DatagramPacket dp = new DatagramPacket(bf, bf.length, ia, 9999);

          ds.send(dp);
    
       } catch(Exception e){
         System.out.println(e);   
       }
  }
}