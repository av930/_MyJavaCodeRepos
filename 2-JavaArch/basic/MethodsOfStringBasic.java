import java.io.UnsupportedEncodingException;

/**
 * Created by joongkeun.kim on 17/01/04/004.
 */
public class MethodsOfStringBasic {
    public static void main(String[] args) {
        MethodsOfStringBasic Obj = new MethodsOfStringBasic();
        String abc = "ABC";
        String abcdefg = "abcdefg";
        String hijklmnop = new String("abc hijklmnop");
        String alphabet = new String("abcdefg hijklmnop qrstuvwzyz");


        //It returns the character at the specified index. Specified index value should be between 0 to length() -1 both inclusive. It throws IndexOutOfBoundsException if index<0||>= length of String.
        System.out.println("######## char charAt(int index): " + alphabet.charAt(6));
        //It is similar to the charAt method however it returns the Unicode code point value of specified index rather than the character itself.
        System.out.println("######## int codePointAt(int index): " + alphabet.codePointAt(6));
        //It copies the characters of src array to the dest array. Only the specified range is being copied(srcBegin to srcEnd) to the dest subarray(starting fromdestBegin).
        char[] charArray = new char[20];
        alphabet.getChars(8, 16, charArray, 0);
        System.out.println("######## void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin):" + new String(charArray));
        //Compares the string with the specified string and returns true if both matches else false.
        System.out.println("######## boolean equals(Object obj): " + abc.contentEquals(abcdefg.substring(0, 3)));
        //It compares the string to the specified string buffer.
        System.out.println("######## boolean contentEquals(StringBuffer sb): " + abc.contentEquals(abcdefg.substring(0, 3)));
        //It works same as equals method but it doesn’t consider the case while comparing strings. It does a case insensitive comparison.
        System.out.println("######## boolean equalsIgnoreCase(String string): " + abc.equalsIgnoreCase((abcdefg.substring(0, 3)).toUpperCase()));
        System.out.println("######## boolean equalsIgnoreCase(String string): " + abc.equalsIgnoreCase((abcdefg.substring(0, 3)).toLowerCase()));
        //This method compares the two strings based on the Unicode value of each character in the strings.
        System.out.println("######## int compareTo(String string): " + abc.compareTo(abcdefg.substring(0, 3)));
        //Same as CompareTo method however it ignores the case during comparison.
        System.out.println("######## int compareToIgnoreCase(String string): " + abc.compareToIgnoreCase(abcdefg.substring(0, 3).toLowerCase()));
        //It compares the substring of input to the substring of specified string.
        System.out.println("######## boolean regionMatches(int srcoffset, String dest, int destoffset, int len): " + abcdefg.regionMatches(0, alphabet, 0, 6));
        //boolean startsWith(String prefix, int offset): It checks whether the substring (starting from the specified offset index) is having the specified prefix or not.
        //boolean startsWith(String prefix): It tests whether the string is having specified prefix, if yes then it returns true else false.
        //boolean endsWith(String suffix): Checks whether the string ends with the specified suffix.
        //It returns the hash code of the string.
        System.out.println("######## int hashCode(): " + abcdefg.hashCode() + ":" + abc.hashCode() + ":"+ hijklmnop.hashCode() + ":"+ alphabet.hashCode());
        //int indexOf(int ch): Returns the index of first occurrence of the specified character ch in the string.
        //int indexOf(int ch, int fromIndex): Same as indexOf method however it starts searching in the string from the specified fromIndex.
        //int lastIndexOf(int ch): It returns the last occurrence of the character ch in the string.
        //int lastIndexOf(int ch, int fromIndex): Same as lastIndexOf(int ch) method, it starts search from fromIndex.
        //int indexOf(String str): This method returns the index of first occurrence of specified substring str.
        //int lastindexOf(String str): Returns the index of last occurrence of string str.
        //        String substring(int beginIndex): It returns the substring of the string. The substring starts with the character at the specified index.
        //String substring(int beginIndex, int endIndex): Returns the substring. The substring starts with character at beginIndex and ends with the character at endIndex.
        //String concat(String str): Concatenates the specified string “str” at the end of the string.
        //String replace(char oldChar, char newChar): It returns the new updated string after changing all the occurrences of oldChar with the newChar.
        //boolean contains(CharSequence s): It checks whether the string contains the specified sequence of char values. If yes then it returns true else false. It throws NullPointerException of ‘s’ is null.
        //        String replaceFirst(String regex, String replacement): It replaces the first occurrence of substring that fits the given regular expression “regex” with the specified replacement string.
        //        String replaceAll(String regex, String replacement): It replaces all the occurrences of substrings that fits the regular expression regex with the replacement string.
        //        String[] split(String regex, int limit): It splits the string and returns the array of substrings that matches the given regular expression. limit is a result threshold here.
        //String[] split(String regex): Same as split(String regex, int limit) method however it does not have any threshold limit.
        //        String toLowerCase(Locale locale): It converts the string to lower case string using the rules defined by given locale.
        //        String toLowerCase(): Equivalent to toLowerCase(Locale. getDefault()).
        //        String toUpperCase(Locale locale): Converts the string to upper case string using the rules defined by specified locale.
        //        String toUpperCase(): Equivalent to toUpperCase(Locale.getDefault()).
        //        String trim(): Returns the substring after omitting leading and trailing white spaces from the original string.

        //Converts the string to a character array.
        char [] tempcharArray = abcdefg.toCharArray();
        for (char temp: tempcharArray){
            System.out.println("######## char[] toCharArray(): " + temp);
        }

        //It returns a string that contains the characters of the specified character array.
        String tempString="123";
        System.out.println("######## static String copyValueOf(char[] data): " + tempString.copyValueOf(tempcharArray));
        System.out.println("######## static String copyValueOf(char[] data): " + tempString.copyValueOf(tempcharArray, 4, 3));
        //static String copyValueOf(char[] data, int offset, int count): Same as above method with two extra arguments – initial offset of subarray and length of subarray.
        //static String valueOf(data type): This method returns a string representation of specified data type.
        //byte[] getBytes(String charsetName): It converts the String into sequence of bytes using the specified charset encoding and returns the array of resulted bytes.
        //This method is similar to the above method it just uses the default charset encoding for converting the string into sequence of bytes.
        try {
            byte[] tempbyteArray = abcdefg.getBytes("UTF-16");
            System.out.println("######## byte[] getBytes(): ");
            for (byte temp : tempbyteArray) {
                System.out.print(temp);
            }
        }catch(UnsupportedEncodingException ex){
                System.out.println("######## error");
            }


        //int length(): It returns the length of a String.
        //boolean matches(String regex): It checks whether the String is matching with the specified regular expression regex.

    }
}
