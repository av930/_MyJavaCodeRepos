class NoDigitException extends Exception {
}

public class ExceptionUserDefine {
    public static void main(String[] args) throws java.io.IOException {
        System.out.println("===== 예외처리 프로그램 (throws) =====");
        char c;
        int sum = 0;

        try {
            System.out.println("5자리로 입력해주세요.");
            for (int i = 0; i < 5; i++) {
                c = (char) System.in.read();
                if (!Character.isDigit(c))
                    throw new NoDigitException();
                else
                    sum += c - '0';
            }
            System.out.println("모두숫자입니다. ->" + sum);
        } catch (NoDigitException e) {
            System.out.println("숫자예외 발생");
        }
    }
}