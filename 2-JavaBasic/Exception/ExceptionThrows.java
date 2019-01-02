class ExceptionThrows {
   static void calc() throws ArithmeticException {   
          int ken = 0;
          int boo = 50 / ken;
   }

   public static void main(String[] args) {
	System.out.println("===== 예외처리 프로그램 (throws) =====");

	try {	
              calc();
        }
        catch (ArithmeticException e) {
             System.out.println(e);  
        }
       finally {
 	     System.out.println("==== finally step ====");	
        }
   } 
}