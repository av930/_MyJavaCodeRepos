import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by joongkeun.kim on 2017-07-04.
 */
public class MethodsOfNumberClass {
    public static void main(String args[]) {
        Integer x = 10;
        Integer y = 20;
        Integer z =30;
        Short a = 1;


        System.out.println("Returns primitive data type");
        System.out.println(x.byteValue() );
        System.out.println(x.doubleValue());
        System.out.println(x.longValue() );

        System.out.println("Return object types ");
        System.out.println(Byte.valueOf(x.byteValue()));
        System.out.println(Double.valueOf(x.doubleValue()));
        System.out.println(Long.valueOf(x.longValue()));

        System.out.println("compareTo");
        System.out.println(x.compareTo(1));
        System.out.println(x.compareTo(2));
        System.out.println(x.compareTo(3));

        System.out.println("equals");
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));

        System.out.println("toString");
        System.out.println(x.toString());
        System.out.println(Integer.toString(12));

        System.out.println("toNumber");
        System.out.println(Integer.parseInt("9"));
        System.out.println(Double.parseDouble("5"));
        System.out.println(Integer.parseInt("444",16));

        System.out.println("absolute values");
        System.out.println(Math.abs(-8));
        System.out.println(Math.abs(-4E2));
        System.out.println(Math.abs(-10.2));

        System.out.println("ceil & floor");
        System.out.println(Math.ceil(-100.675));
        System.out.println(Math.ceil(90.444));
        System.out.println(Math.floor(-100.675));
        System.out.println(Math.floor(90.444));

        System.out.println("converge to closest double");
        System.out.println(Math.rint(100.456));
        System.out.println(Math.rint(100.654));
        System.out.println(Math.rint(100.5));

        System.out.println("converge to closest integer: 반올림");
        System.out.println(Math.round(100.456));
        System.out.println(Math.round(100.654));
        System.out.println(Math.round(100.5));

        System.out.println("min & max");
        System.out.println(Math.min(12.123, 12.456));
        System.out.println(Math.min(23.12, 23.0));
        System.out.println(Math.max(12.123, 12.456));
        System.out.println(Math.max(23.12, 23.0));

        System.out.println("exponential & log: e^X, logX");
        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("The value of e is %.4f%n", Math.PI);
        System.out.printf("exp(%.3f) is %.3f%n", 4.0, Math.exp(4.0));
        System.out.printf("logE(%.3f) is %.3f%n", 4.0, Math.log(4.0));
        System.out.printf("log10(%.3f) is %.3f%n", 10.0, Math.log10(10.0));
        System.out.printf("pow(%.3f, %.3f) is %.3f%n", 4.0, 2.0, Math.pow(4, 2));
        System.out.printf("sqrt(%.3f) is %.3f%n", 4.0, Math.sqrt(4.0));
        System.out.format("The sin of %.1f degrees is %.4f%n", 30.0, Math.sin(Math.toRadians(30)));
        System.out.format("The cos of %.1f degrees is %.4f%n", 60.0, Math.cos(Math.toRadians(60)));
        System.out.format("The tan of %.1f degrees is %.4f%n", 45.0, Math.tan(Math.toRadians(45)));
        System.out.format("The radian of %.4f is %.4f toDegrees %n", Math.PI, Math.toDegrees(Math.PI));
        System.out.format("The arccosine of %.4f is %.4f degrees %n", Math.cos(Math.PI),Math.toDegrees(Math.acos(Math.sin(Math.PI))));
        System.out.println( Math.random());
        System.out.println( Math.random());

    }
}
