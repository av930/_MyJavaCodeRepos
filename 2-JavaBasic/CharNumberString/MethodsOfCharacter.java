/**
 * Created by joongkeun.kim on 2017-07-10.
 */
public class MethodsOfCharacter {
    public static void main(String[] args) {
        char chNorm = 'a';

        // Unicode for uppercase Greek omega character
        char chUni = '\u0061';
        System.out.println("chNorm: "+ chNorm+ "\n chUni: " +chUni);

        // an array of chars
        char[] chArray ={ 'a', '1', '\t', '\n', chNorm, chUni };
        System.out.print("chArray: ");
        for (char item: chArray) {

        System.out.print("isLetter:\t"+ Character.isLetter(item));
        System.out.print("isDigit:\t"+ Character.isDigit(item));
        System.out.print("isWhiteSpace:\t"+ Character.isWhitespace(item));
        System.out.print("isUpperCase:\t"+ Character.isUpperCase(item));
        System.out.print("isLowerCase:\t"+ Character.isLowerCase(item));
        System.out.print("toUpperCase:\t"+ Character.toUpperCase(item));
        System.out.print("toString:\t"+ Character.toString(item));
        System.out.print("toString.Length:\t"+ Character.toString(item).length());
        System.out.print("\n");
        }
    }
}
