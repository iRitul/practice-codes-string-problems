public class ThrowExample {
   static void checkEligibilty(int Age, int Height){ 
      if(Age<12 && Height<140) {
         throw new ArithmeticException("Student is not eligible for registration"); 
      }
      else {
         System.out.println("Student Entry is Valid!!"); 
      }
   } 

   public static void main(String args[]){ 
     System.out.println("Welcome to the Registration process!!");
     checkEligibilty(10, 130); 
     System.out.println("Have a nice day.."); 
 } 
}