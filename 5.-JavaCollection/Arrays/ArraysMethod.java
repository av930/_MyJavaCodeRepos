import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by joongkeun.kim on 2017-07-18.
 * int 배열을 collection을 이용하기 위해, integer 배열로 바꾸고
 * 정렬, 역정렬, 램덤화, 최소/최대, 검색이 가능하도록 한다.
 */
public class ArraysMethod {
    public static void main(String[] args) {
        int[] listOfint = {4, 9, 2, 3, 5, 1, 2};

        // Print all the array elements
        for (int i = 0; i < listOfint.length; i++) System.out.print(listOfint[i] + "\t");
        System.out.println("listOfint: original");

        // Sort in memory
        Arrays.sort(listOfint);
        for (int i = 0; i < listOfint.length; i++) System.out.print(listOfint[i] + "\t");
        System.out.println("listOfint: sorted");


        // Transform from int Array to Collection
        Integer[] listOfInteger = new Integer[listOfint.length];
        for (int i = 0; i < listOfint.length; i++)
            listOfInteger[i] = new Integer(listOfint[i]);

        // Reverse Order sort using Comparator
        System.out.println("listOfint: reverse sorted");
        Arrays.sort(listOfInteger, Collections.reverseOrder());
        for (int i = 0; i < listOfInteger.length; i++)
            System.out.print(listOfInteger[i] + "\t");

        // shuffle to Randomize
        List <Integer> list= Arrays.asList(listOfInteger);
        Collections.shuffle(list);
        for (Integer i: list) System.out.print(i + "\t");
        System.out.println("listOfint: shuffled");
        System.out.println("min VS max: "+ Collections.min(list) +" VS "+Collections.max(list));

        int ret= Arrays.binarySearch(listOfint, 2);
        for (int i: listOfint) System.out.print(i +"\t");
        if (ret >= 0) System.out.println("Value found where in index of : [" + ret + "]");

        //sort String Array
        String[] myStringArray = new String[] { "Aaa", "A0aa", "Abbbbb", "aaa0" };
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray));
    }
}
