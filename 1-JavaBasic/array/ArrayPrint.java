import java.util.Arrays;

/**
 * Created by joongkeun.kim on 2017-07-24.
 */
public class ArrayPrint {
    public static void main(String[] args) {

        //print String array
        String [] myStringArray = { "Aaa", "A0aa", "Abbbbb", "aaa0" };

        double myNumberArray [][]= {
                {0.50, 0.20,  0.20, 0.30},
                {0.50, 1.10,  0.50, 0.80},
                {0.50, 0.70,  0.40},
                {0.50, 0.70},
                {0.50},
        };

        //use deepToString to print out the content of array
        System.out.println(Arrays.toString(myStringArray));
        System.out.println(Arrays.deepToString(myStringArray));
        System.out.println(Arrays.toString(myNumberArray));
        System.out.println(Arrays.deepToString(myNumberArray));
    }
}
