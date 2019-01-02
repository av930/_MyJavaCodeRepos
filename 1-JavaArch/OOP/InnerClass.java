package oop;

/**
 * Created by joongkeun.kim on 16/12/24/024.
 * 다양한 inner class 테스트
 */


public class InnerClass {

    // inner class
    class MyInnerClass {
        String s1= "1st string";
        String s2= "2nd string";

        public void seeOuter() {
            System.out.println("[innerclass]");
        }
        public void seeInner() {
            System.out.println("test");
        }
    }

    // static innerclass
    static class MyInnerClassDemo { //static inner
        public static void seeStatic() {
            System.out.println("[static inner class]");
        }
    }


    public InnerClass() {
        MyInnerClass pObj= new MyInnerClass();
        pObj.seeOuter();
        pObj.seeInner();
    }

    public void disp() {
        System.out.println("local method");

        //inner class
        MyInnerClass pInner = new MyInnerClass();
        pInner.seeOuter();
        pInner.seeInner();

        //local class
        class MyInnerClassDemo extends MyInnerClass {
            public void seeOuter() {
                System.out.println(s1 + s2 + " [localclass]");
            }
        }
        MyInnerClassDemo pDemo = new MyInnerClassDemo();
        pDemo.seeOuter();
        pDemo.seeInner();

        //anonymous Class
        MyInnerClassDemo anonymousClass = new MyInnerClassDemo(){
            public void seeOuter(){
                System.out.println(s2 + s1 +" [anonyclass]");
            }
        };
        anonymousClass.seeOuter();
        anonymousClass.seeInner();
    }

    public static void main(String args[]) {
        MyInnerClassDemo.seeStatic();

        InnerClass obj = new InnerClass();
        obj.disp();
    }
}

