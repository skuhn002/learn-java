import java.util.*;

public class Tester{
  public static void main(String args[]){
    String arr[] = new String[2];
    arr[0] = "Hello";
    arr[1] = "Goodbye";
    System.out.println(arr[0]);
    for(int i=0; i<2; i++){
      System.out.println("Array Element " + i + ": " + arr[i]);
    }
  }
}
