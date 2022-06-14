/* Print a Statement Multiple Times using Loops */

public class loop1 {
   public static void main(String args[]) {
     // Do Bart Simpson's Homework
     //    Assignment: Print the phrase "Grammar is not a time of waste" n times using a for loop

     int n = 10; // Bart's teacher says to write the assigned phrase n times
     int i = 1;

     String loop_type = "while"; // which type of loop to use
     System.out.print("Loop Type: " + loop_type + "\n\n");

     switch(loop_type) {
       case "for":
         for (i=i; i <= n; i++) {
           System.out.print("(" + i + ") Grammar is not a time of waste" + "\n");
         }
         break;
       case "while":
         while(i <= n) {
           System.out.print("(" + i + ") Grammar is not a time of waste" + "\n");
           i++;
         }
         break;
       case "dowhile":
         do {
           System.out.print("(" + i + ") Grammar is not a time of waste" + "\n");
           i++;
         } while(i <= n);
         break;
       case "for+":
         int [] repeats = {1,2,3,4,5,6,7,8,9,10}; //set to work for n = 10
         for (int x : repeats) {
           System.out.print("(" + x + ") Grammar is not a time of waste" + "\n");
         }
     }
    }
}
