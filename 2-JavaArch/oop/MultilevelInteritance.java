package oop;

/**
 * Created by joongkeun.kim on 16/12/23/023.
 * 기본적으로 상속은 1개, 여러개 상속하고 싶은것은 interface로 선언하고, 해당 method는 스스로 구현해서 사용하자는 example
 *
 */

interface Wheels {
    void numberOfwheel();
}

class BaseCar implements Wheels {
    public BaseCar() { System.out.println("Class BaseCar"); }
    public void vehicleType() { System.out.println("1st: Vehicle Type: BaseCar");}
    public void numberOfwheel() { System.out.println("4 wheels");}
}

class Menufacturer extends BaseCar {
    public Menufacturer()
    {
        System.out.println("Class Menufacturer");
    }
    public void brand()
    {
        System.out.println("Brand: hyundai");
    }
    public void speed()
    {
        System.out.println("Max: 100Kmph");
    }
}

interface Bus extends Wheels {
    void accommodity();
}

public class MultilevelInteritance extends Menufacturer implements Bus {

    public MultilevelInteritance(){ System.out.println("Menufacturer Model: 800"); }
    //from base class
    public void speed()
    {
        System.out.println("Max: 80Kmph");
    }
    public void vehicleType() { System.out.println("Bus"); };

    //from interface
    public void numberOfwheel() { System.out.println("12 wheels");}
    public void accommodity() { System.out.println("40 People accomodated"); };

    public static void main(String args[])
    {
        MultilevelInteritance obj=new MultilevelInteritance();
        System.out.println("-------------------------------------");

        obj.brand();
        obj.vehicleType();
        obj.numberOfwheel();
        obj.accommodity();
        obj.speed();
    }
}

