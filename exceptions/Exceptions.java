public class Exceptions {
  public static void main(String args[]){
    int[] array_1 = new int[2];
    array_1[0] = 10;
    array_1[1] = 20;

    try {
      System.out.println("Array Element 1: " + array_1[2]);
    }

    catch (ArrayIndexOutOfBoundsException nameOfException) {
      System.out.println("Exception: " + nameOfException);
    }

    finally {
      System.out.println("Can't say we didn't see this coming");
    }
    
  }
}
