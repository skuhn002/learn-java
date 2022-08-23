// Tester: Dynamic Length Data Structure - ArrayList
import java.util.*;

public class Tester{
  public static void main(String args[]){
    ArrayList<String> arr = new ArrayList<String>();
    arr.add("Hello");
    arr.add("Goodbye");
    //iterator for ArrayList
    Iterator itr = arr.iterator();
    while(itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}
