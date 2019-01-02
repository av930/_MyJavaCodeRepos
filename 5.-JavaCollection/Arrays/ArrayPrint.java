import java.util.Arrays;

/**
 * Created by joongkeun.kim on 2017-07-24.
 * Array를 Print하는 방법. Arrays.deepToString으로 하면 multi level의 내용까지 출력됨.
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
