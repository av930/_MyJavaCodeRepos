package oop;

/**
 * Created by joongkeun.kim on 16/12/19/019.
 * 부모 clasd의 method와 member variable을 사용할수 있다는 것을 보여주는 예제
 */

// A class to display the attributes of the vehicle
abstract class Frame {
    String bodyType= "Mono";
    void attributes() {   }
}

class Vehicle extends Frame{
    String color;
    int speed;
    int size;
    static void info(){
        System.out.println("this is staticvalue");
    }
    void attributes() {
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
        System.out.println("Size : " + size);
        System.out.println("BodyType : " + bodyType);
    }
}

// A subclass which extends for vehicle
class Car extends Vehicle {
    int CC;
    int gears;
    void attributes() {
        // The subclass refers to the members of the superclass
        super.attributes();
        System.out.println("CC of Car : " + CC);
        System.out.println("No of gears of Car : " + gears);
    }
}
public class Inheritance {
    public static void main(String args[]) {
        Car b1 = new Car();
        b1.color = "Blue";
        b1.speed = 200 ;
        b1.size = 22;
        b1.CC = 1000;
        b1.gears = 5;
        b1.attributes();
        b1.info();
    }
}

