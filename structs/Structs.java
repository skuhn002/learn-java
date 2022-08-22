import java.util.*;

public class Structs {
  public static void main(String args[]) {
    // instance a map (hash map)
    Map m1 = new HashMap();
    Map m2 = new HashMap();

    // give the map data
    m1.put(1, "Entry 1");
    m1.put(2, "Entry 2");
    m1.put(3, 456);

    m2.put(1, "Sub-Entry 1");

    m1.put(4, m2);

    System.out.println("Check: " + m1);
  }
}
