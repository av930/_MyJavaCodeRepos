/*
 * 자주사용하는 method에 대한 method명 단순화를 위한 import static 예제
 */
package structure;

import static java.lang.System.out;
import static java.lang.Math.*;

class ImportStaticClass {
    public static void main(String args[])
    {
        //instead of Math.sqrt need to use only sqrt
        double var1= sqrt(5.0);
        //instead of Math.tan need to use only tan
        double var2= tan(30);
        //need not to use System in both the below statements
        out.println("Square of 5 is:"+var1);
        out.println("Tan of 30 is:"+var2);
    }
}