import java.io.IOException;

/**
 * Created by joongkeun.kim on 2017-07-04.
 */
public class UsecaseOfForLabel {
    public static void main(String args[]) {

        char choice = 0;
        do {
            System.out.print("input alphabet [a] or [b] or [c]: ");
            try {
                choice = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            switch (choice) {
                case 'a':
                    System.out.print("label A <");
                    labelBreak:
                    for (int i= 5; i> 0; i--) {
                        int count = i;
                        do {
                            System.out.print("\t: " + count--);
                            if (count == 3) break labelBreak;
                        } while (count > 0);
                    }
                    System.out.print(" > end A \n");
                case 'b':
                    System.out.print("label B <");
                    labelContinue:
                    for (int i= 5; i> 0; i--) {
                        int count = i;
                        do {
                            System.out.print("\t| " + count--);
                            if (count == 3) continue labelContinue;
                        } while (count > 0);
                    }
                    System.out.print(" > end B \n");

            }
        }
        while (choice != 'c');
        System.out.print("input value is 'c', now exit");

    }
}
