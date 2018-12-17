import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class UsecaseOfSwitch {
    public static void main(String args[]) {

        System.out.println("######## Character switch, PLZ input:");
        char singleChar = 0;
        try {
            singleChar = (char) System.in.read();
        } catch (IOException e) {  e.printStackTrace();  }

        switch(singleChar) {
            case 'A' : System.out.println("Excellent!"); break;
            case 'B' :
            case 'C' : System.out.println("Well done"); break;
            case 'D' : System.out.println("You passed");
            default : System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + singleChar);


        System.out.println("######## String Switch switch, PLZ input:");
        /* from java1.7 Switch String Match Supported*/
        Scanner input= new Scanner(System.in);
        String pInput= input.next();

        switch(pInput) {
            case "ABC" : System.out.println("Excellent!"); break;
            case "BCD" :
            case "CDE" : System.out.println("Well done"); break;
            case "DEF" : System.out.println("You passed");
            default : System.out.println("Invalid grade");
        }

    }
}