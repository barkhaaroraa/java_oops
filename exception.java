// Wap in Java to handle Arithmetic Exception (Classwork)
// * author: barkha arora
// * Date: 03/10/2023
// * SAP ID: 500105541

// */

public class exception {
   
   static float myfun(int a, int b) throws ArithmeticException {
       
       try {
           float i = a / b;
           return i;
       } catch (ArithmeticException e) {
           throw e;
       }
   }

   public static void main(String args) {
       int a = 1;
       int b = 0;

       try {
           // Call myfun and catch the ArithmeticException
           float c = myfun(a, b);
       } catch (ArithmeticException e) {
           System.out.println("ArithmeticException caught: Division by zero");
       } finally {
           System.out.println("Finally block executed");
       }

       System.out.println("Remaining code");
   }
}