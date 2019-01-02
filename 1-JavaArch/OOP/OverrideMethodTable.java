package oop;

/**
 * Created by joongkeun.kim on 16/12/28/028.
 * 상속관계의 instance 접근시 어떤 class type으로 접근하느냐에 따른 example
 */
import java.math.BigInteger;


class Base{
    private int priv_val= 1;
    int def_val= 2;
    protected int pro_val= 3;
    public int pub_val= 4;
    static int base= 10;

    void info(){
        System.out.print("priv_val: " + priv_val + "  ");
        System.out.print("def_val: " + def_val + "  ");
        System.out.print("pro_val: " + pro_val + "  ");
        System.out.println("pub_val: " + pub_val);
        static_info(pub_val);
    }

    static void static_info(int param){
        System.out.println("base: " + base + param);
    }
}

class Derived extends Base {
    private int priv_val = 10;
    int def_val = 20;
    protected int pro_val = 30;
    public int pub_val = 40;
    static int base = 100;

    void info() {
        System.out.print("priv_val: " + priv_val + "  ");
        System.out.print("def_val: " + def_val + "  ");
        System.out.print("pro_val: " + pro_val + "  ");
        System.out.println("pub_val: " + pub_val);

        static_info(pub_val);
    }

    static void static_info(int param) {
        System.out.println("derived: " + base+ param);
    }
}

public class OverrideMethodTable
{
    public static void main (String args [])
    {

        Derived derivedObj = new Derived();
        derivedObj.info();
        derivedObj.static_info(derivedObj.pub_val);
        System.out.println("derived: " + derivedObj.base+ " derived: " + derivedObj.pub_val);

        Base baseObj = (Base) derivedObj;
        baseObj.info();
        baseObj.static_info(baseObj.pub_val);
        System.out.println("base: " + baseObj.base+ " base: " + baseObj.pub_val);


    }
}

