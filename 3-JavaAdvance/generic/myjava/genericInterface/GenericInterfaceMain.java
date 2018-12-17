package genericInterface;

/** Class에서 GenericType을 사용하는 예제
class ClassGenericType<T> {
    private T t;
    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
ClassGenericType<String> classGenericType = new ClassGenericType<>();
*/

interface GenericInterface<T1> {
    public String toString(T1 arg1);
}

class GenericClassA<T> implements GenericInterface<Integer>{
    private T base;
    public GenericClassA(T arg){
        base = arg;
    }

    public String toString(Integer arg1){
        return "[" + (base + arg1.toString()) + "]";
    }

}

class GenericClassB<T> implements GenericInterface<String>{
    private T base;
    public GenericClassB(T arg){
        base = arg;
    }

    public String toString(String arg2){
        return "[" + base + Integer.parseInt(arg2) + "]";
    }
}

class GenericClassC<T> implements GenericInterface<String>{
    private T base;

    public GenericClassC(T arg){
        base = arg;
    }
    public String toString(String arg1){
        int inputVal;
        switch(arg1){
            case "ONE": inputVal = 1; break;
            case "TWO": inputVal = 2; break;
            case "THREE": inputVal = 3; break;
            case "FOUR": inputVal = 4; break;
            case "FIVE": inputVal = 5; break;
            case "SIX": inputVal = 6; break;
            case "SEVEN": inputVal = 7; break;
            case "EIGHT": inputVal = 8; break;
            case "NINE": inputVal = 9; break;
            case "TEN": inputVal = 10; break;
            default: inputVal = 0;
        }

        return "[" + base + inputVal + "]";
    }

}


public class GenericInterfaceMain {
    public static void main(String[] args) {
        GenericClassA<Integer> value1 = new GenericClassA<>(1000);
        System.out.println(value1.toString(10));
        GenericClassB<String> value3 = new GenericClassB<>("1000");
        System.out.println(value3.toString("10"));
        GenericClassC<String> value2 = new GenericClassC<>("1000");
        System.out.println(value2.toString("TEM"));

    }
}



//        GenericClass<Integer> value1 = new GenericClass<Integer>(new Integer(10));



