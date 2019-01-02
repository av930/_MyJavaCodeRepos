/*
 * class 초기화 순서에 대한 example
 * static method에 대한 access example
 */
class Memorybase {
    // 1. static initializer: class 명시적 초기화
    static int classVar = 0;

    // 2. static initial block: class 초기화 블록
    static {
        System.out.print("STATIC INIT["+ classVar +"]" +"\t");
        classVar++;
        System.out.print("AFTER["+ classVar +"]" +"\n");    }

    // 3. initializer : instance 명시적 초기화
    int instanceVar = classVar;

    {// 4. initial block : instance 초기화 블록
        System.out.print("INSTANT INIT["+ instanceVar +"]" +"\t");
        instanceVar++;
        System.out.print("AFTER["+ instanceVar +"]" +"\n");   }

    Memorybase() {// 5. InnerClass : 생성자
        instanceVar++;
        System.out.print("CONSTRUCTOR ["+ instanceVar +"] created" +"\n");   }

    void methodInstance() {// 6. instance method : 일반 method
        instanceVar++;
        System.out.print("METHODINSTANCE ["+ instanceVar +"]" +"\n");   }

    static void methodStatic() {// 7. static method : static method
        classVar++;
        System.out.print("METHODSTATIC ["+ classVar +"]" +"\n");   }
}
class Memoryderived extends Memorybase {

    // 1. static initializer
    static int classVar = 1000;

    static {// 2. static initial block
        System.out.print("static init["+ classVar +"]" +"\t");
        classVar++;
        System.out.print("after["+ classVar +"]" +"\n");    }

    // 3. initializer
    int instanceVar = classVar;

    {// 4. initial block
        System.out.print("instant init["+ instanceVar +"]" +"\t");
        instanceVar++;
        System.out.print("after["+ instanceVar +"]" +"\n");    }

    Memoryderived() {// 5. InnerClass
        instanceVar++;
        System.out.print("InnerClass["+ instanceVar +"] created" +"\n");    }

    void methodInstance() {// 6. instance method : 일반 method
        instanceVar++;
        System.out.print("methodinstance ["+ instanceVar +"]" +"\n");   }

    static void methodStatic() {// 7. static method : static method
        classVar++;
        System.out.print("methodstatic ["+ classVar +"]" +"\n");   }
}

public class LayoutOfMemorySequence {
    public static void main(String[] args) {

        Memoryderived xself = new Memoryderived(); //생성 순서 테스트
        System.out.print("-------------------------------" +"\n");

        xself.methodInstance(); //override 테스트
        xself.methodStatic();
        Memorybase xselfbase= xself;
        xselfbase.methodInstance();
        xselfbase.methodStatic();
        System.out.print("-------------------------------" +"\n");

        Memoryderived yself = new Memoryderived(); //생성 순서 테스트
        return;
    }
}


