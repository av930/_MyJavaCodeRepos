
/**
 * Created by joongkeun.kim on 16/12/06/006.
 main은 항상 static으로 선언되어야 호출이 가능하다.
 함수 호출을 위한 main instance 고정적으로 생성, 실제 instance들을 생성하여 호출하는 가장기본적 example

 */

public class LayoutOfClassBasic {
    public int func(int var) {
        System.out.println("func:"+ var);
        return 0;
    }

    // psvm을 입력하면 Intellij에서는 다음문장을 generation 시켜줌
    // public static void main(String[] args)

    public static void main(String[] args) {
        System.out.println("main");
        LayoutOfClassBasic rself = new LayoutOfClassBasic();
        rself.func(100);
        return;
    }
}
