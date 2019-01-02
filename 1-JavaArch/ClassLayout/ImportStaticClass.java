/* KJK_TALK
 자주 사용하는 method 사용시 참조명을 단순화를 위해, import static 을 사용하여, 해당 class 를 명시적으로 load 하는 예제
 */

import static java.lang.System.out;
import static java.lang.Math.*;
import static java.lang.String.*;

class ImportStaticClass {
    public static void main(String args[])
    {
        //instead of Math.sqrt need to use only sqrt
        double var1= sqrt(5.0);
        //instead of Math.tan need to use only tan
        double var2= tan(30);

        //package 이름(System)없이 출력가능
        System.out.println("Sum of var1+ var2is: "+ (var1+ var2));
        out.println("Square of 5 is: "+var1);
        out.println("Tan of 30 is: "+var2);


        //package 이름(String) 없이 출력가능
        out.println("var1: " + String.valueOf(var1)+ "var2: "+ valueOf(var2));
    }
}