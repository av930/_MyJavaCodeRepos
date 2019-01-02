package oop;

import java.math.BigInteger;

/**
 * Created by joongkeun.kim on 16/12/19/019.
 * overriding과 overloading 사용 example
 */
class BaseRef{
    long add(int a, int b){
        System.out.print("int, int, long:  ");          return (long)a+(long)b;
    }

    BigInteger add(long a, long b){
        System.out.print("long, long, BigInteger:  ");  return BigInteger.valueOf(a+b);
    }

    double add(double a, double b){
        System.out.print("double, double, double:  ");  return a+b;
    }
}

class DerivedRef extends BaseRef{
    long add(int a, int b){ //overriding
        System.out.print("int,int,int:  ");             return a+b;
    }

    float add(float a, float b){ //overloading
        System.out.print("float, float, float:  ");     return (float)super.add(a, b);
    }
}

class Polymorphism
{
    public static void main (String args [])
    {
        {
            BaseRef Obj = new BaseRef();
            System.out.println(Obj.add(Integer.MAX_VALUE, 1)); //overloading long
            System.out.println(Obj.add(Integer.MAX_VALUE, 1L)); //overloading big
            System.out.println(Obj.add(Integer.MAX_VALUE, 1.0)); //overloading double
            System.out.println(Obj.add(Float.MAX_VALUE, 1.0)); //overloading double
        }

        {
            DerivedRef Obj = new DerivedRef();
            System.out.println(Obj.add(Integer.MAX_VALUE, 1)); //override int
            System.out.println(Obj.add(Float.MAX_VALUE, 1.0F)); //override super float
            System.out.println(Obj.add(Long.MAX_VALUE, 1)); //super big
        }
    }
}

