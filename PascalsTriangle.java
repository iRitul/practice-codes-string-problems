import java.util.Scanner;
public class PascalsTriangle {
   static int factorial(int n) {
      int fact;

      for(fact = 1; n > 1; n--){
         fact *= n;
      }
      return fact;
   }
   static int ncr(int n,int r) {
      return factorial(n) / ( factorial(n-r) * factorial(r) );
   }
   public static void main(String args[]){
      System.out.println();
      int n, i, j;
	  Scanner s=new Scanner(System.in);
      n = s.nextInt();

      for(i = 0; i < n; i++) {
         for(j = 0; j <= n-i; j++){
            System.out.print(" ");
         }
         for(j = 0; j <= i; j++){
            System.out.print(" "+ncr(i, j));
         }
         System.out.println();
      }
   }
}