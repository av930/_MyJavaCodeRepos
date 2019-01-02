package genericClass; /** Class에서 GenericType을 사용하는 예제
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

class GenericClass<T> {
    private T base;
    public GenericClass(T arg){
        base = arg;
    }
    public String toString(){
        return "[" + base + "]";
    }
}

public class GenericClassMain {
    public static void main(String[] args) {
        GenericClass<Integer> baseue1 = new GenericClass<>(new Integer(10));
        System.out.println(baseue1.toString());
        GenericClass<String> baseue2 = new GenericClass<>("TEN");
        System.out.println(baseue2.toString());

    }
}



//        GenericClass<Integer> baseue1 = new GenericClass<Integer>(new Integer(10));



