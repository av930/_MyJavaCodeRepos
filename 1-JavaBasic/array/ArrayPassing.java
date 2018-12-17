/**
 * Created by joongkeun.kim on 2017-07-11.
 */
public class ArrayPassing {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Print all the array elements
        for (int i = 0; i < myList.length; i++) System.out.print(myList[i] + "\t");

        // Summing all elements
        double total = 0;
        for (double temp: myList) total += temp;
        System.out.println("\nTotal is " + total);

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) if (myList[i] > max) max = myList[i];

        System.out.println("Max is " + max);

        // call by reference
        int[] xyz ={1,2,3};
        max = self_multi (xyz);
        System.out.println("result of reference: "+ xyz[0] + xyz[1] + xyz[2] + "=" + max);

        //get subarray
        double[] pArrayTemp= get(myList, 1, 2);
        for (double d: pArrayTemp) System.out.print(d+ "\t");
        System.out.println(": subarray ");
    }

    static int self_multi (int[] xyz)
    {
        xyz[0]*=xyz[0];   xyz[1]*=xyz[1];   xyz[2]*=xyz[2];
        System.out.println("array object operation");
        return xyz[0]+xyz[1]+xyz[2];
    }


    public static double[] get(double[] array, int offset, int length) {
        double[] result = new double[length];
        System.arraycopy(array, offset, result, 0, length);
        return result;
    }

}
