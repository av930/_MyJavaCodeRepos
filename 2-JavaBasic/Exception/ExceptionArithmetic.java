class ExceptionArithmetic {
    public static void main(String[] args) {
        System.out.println("===== 예외처리 프로그램 (try-catch-finally) =====");

        try {
            int ken = 0;
            int boo = 50 / ken;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("==== finally step ====");
        }
    }
}