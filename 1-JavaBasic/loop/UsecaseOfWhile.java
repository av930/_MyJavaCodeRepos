package loop;

import java.util.Scanner;

/**
 * Created by joongkeun.kim on 17/01/03/003.
 */
public class UsecaseOfWhile {
    public static void main(String args[]){

        System.out.print("General Loop: ");
        int i=10;
        while(i>1){
            System.out.print("\t"+i);
            i--;
        }

        System.out.print("\nInfinite Loop\n");
        while(true){
            System.out.print("input anything:");
            Scanner input = new Scanner(System.in);
            String inputStr = input.next();
            if (inputStr.length() > 1 ) break;
        }
    }
}

