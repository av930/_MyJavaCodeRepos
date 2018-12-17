import java.util.Arrays;

/**
 * Created by joongkeun.kim on 2017-07-19.
 */
public class ArrayAssignCopy {
    public static void main(String[] args) {
        int[] source = new int[] {1, 2, 3};
        int[] target = new int[5];

        target[3] = 4;
        target[4] = 5;

        // array copy
        System.arraycopy(source, 0, target, 0, source.length);
        for (int str : target) System.out.print(str +"\t");
        System.out.print("\n");

        // array reset with specific value
        Arrays.fill(target, 0);
        for (int str : target) System.out.print(str +"\t");
    }
}
