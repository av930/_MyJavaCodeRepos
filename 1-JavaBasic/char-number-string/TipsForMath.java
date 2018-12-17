public class TipsForMath {
    public static void main(String[] args) {
        int var = 1000;

        System.out.println("######## +를 -로 바꾸기");
        System.out.println("minus:" + (~var + 1));

        System.out.println("######## 소수점 4째자리부터 무시");
        System.out.println("round down: " + (int) (3.141592 * var) / (float) var);

        System.out.println("######## ABCD중 ramdon Char 만들기");
        System.out.println("ABCD random: " + (char) (Math.random() * 4 + 'A'));

        System.out.println("######## byte c = a+b; a+b가 int임, (byte) casting해야 build err 발생않함 ");
        System.out.println("######## 사칙연산시 변수 2개의 type이 일치하는 경우를 제외하고, 연산의 결과는 int임");
        byte a = 10;
        byte b = 30;
        byte c = (byte) (a + b);
        System.out.println("char: " + c);
    }
}