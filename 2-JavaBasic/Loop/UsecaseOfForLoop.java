package loop;

import java.util.Scanner;

/**
 * Created by joongkeun.kim on 17/01/03/003.
*/
public class UsecaseOfForLoop {
    public static void main(String args[]){
        System.out.print("General Loop: ");

        for(int i=10; i>0; i--){
            System.out.print("\t" + i);
        }

        System.out.print("\nInfinite Loop\n");
        for ( ; ; ){
            System.out.print("input anything:");
            Scanner input = new Scanner(System.in);
            String inputStr = input.next();
            if (inputStr.length() > 1 ) break;
        }

        loop.UsecaseOfForLoop myClass= new loop.UsecaseOfForLoop();
        myClass.arrayForeach(4);
    }

    enum mySample {ABC, A123, BCD, B234};
    public int arrayForeach(int var) {


        String[] aString = {"ABC", "A123", "BCD", "B234"};

        System.out.println("#################################################### arrayForeach");
        int[][] score = new int[var][];

        score[0] = new int[]{1};
        score[1] = new int[]{1, 2};
        score[2] = new int[]{1, 2, 3};
        score[3] = new int[]{1, 2, 3, 4};
        for (int[] i : score) //foreach
        {
            for (int j : i) System.out.print(j);
            System.out.print("\t\t");
        }

        System.out.print("\nNumberClass are  : ");
        for (mySample item : mySample.values()) {
            System.out.print(item);
        }

        System.out.print("\nString are  : ");
        for (String pString : aString) {
            System.out.print(pString);
        }
        return 0 ;
    }


}
