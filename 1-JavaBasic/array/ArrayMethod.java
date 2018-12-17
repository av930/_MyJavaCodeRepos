import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by joongkeun.kim on 2017-07-18.
 */
public class ArrayMethod {
    public static void main(String[] args) {
        int[] listOfYou = {4, 9, 2, 3, 5, 1, 2};

        // Print all the array elements
        for (int i = 0; i < listOfYou.length; i++) System.out.print(listOfYou[i] + "\t");
        System.out.println("listOfYou: original");

        // Sort in memory
        Arrays.sort(listOfYou);
        for (int i = 0; i < listOfYou.length; i++) System.out.print(listOfYou[i] + "\t");
        System.out.println("listOfYou: sorted");


        // Transform to Integer of Array to use Collection
        Integer[] listOfYouArray = new Integer[listOfYou.length];
        for (int i = 0; i < listOfYou.length; i++)
            listOfYouArray[i] = new Integer(listOfYou[i]);

        // Reverse Order sort
        Arrays.sort(listOfYouArray, Collections.reverseOrder());
        for (int i = 0; i < listOfYouArray.length; i++) System.out.print(listOfYouArray[i] + "\t");
        System.out.println("listOfYou: reverse sorted");

        // shuffle to Randomize
        List <Integer> list= Arrays.asList(listOfYouArray);
        Collections.shuffle(list);
        for (Integer i: list) System.out.print(i + "\t");
        System.out.println("listOfYou: shuffled");
        System.out.println("min VS max: "+ Collections.min(list) +" VS "+Collections.max(list));

        int ret= Arrays.binarySearch(listOfYou, 2);
        for (int i: listOfYou) System.out.print(i +"\t");
        if (ret >= 0) System.out.println("Value found where in index of : [" + ret + "]");

        //sort String Array
        String[] myStringArray = new String[] { "Aaa", "A0aa", "Abbbbb", "aaa0" };
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray));
    }
}
