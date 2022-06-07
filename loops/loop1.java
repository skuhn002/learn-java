/* Loops */

public class loop1 {
   public static void main(String args[]) {
      int x = 10;
      int [] numbers = {50, 60, 70, 80};

      System.out.print("While \n");
      while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }

      System.out.print(" \nDo... While \n");
      do {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      } while( x < 30 );


      System.out.print(" \nFor \n");
      for(int y = 30; y < 40; y = y + 1) {
         System.out.print("value of y : " + y );
         System.out.print("\n");
      }


      System.out.print(" \nEnhanced For \n");
      for(int z : numbers ) {
         System.out.print( z );
         System.out.print(",");
      }
      System.out.print("\n");
    }
}
