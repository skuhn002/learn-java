import java.util.*;

public class Structs {
  public static void main(String args[]) {
    // instance a map (hash map)
    System.out.println("HashMap: ");
    Map m1 = new HashMap();
    Map m2 = new HashMap();

    m1.put(1, "Entry 1");
    m1.put(2, "Entry 2");
    m1.put(3, 456);

    m2.put(1, "Sub-Entry 1");

    m1.put(4, m2);

    System.out.println(m1);


    // instance an array
    System.out.println("\nArray: ");
    int a1[] = new int[4];

    a1[0] = 13;
    a1[1] = 25;
    a1[2] = 30;
    a1[3] = 42;

    for(int i=0;i<a1.length;i++){
      System.out.println("Element " + i + " - " + a1[i]);
    }

  }
}
