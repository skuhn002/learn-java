/* Loops */

public class loop1 {
   public static void main(String args[]) {
      int x = 10;

      while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }

      for(int y = 10; y < 20; y = y + 1) {
         System.out.print("value of y : " + y );
         System.out.print("\n");
      }
   }
}
