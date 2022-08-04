public class Exceptions {

  public static void testMethod() throws ArrayIndexOutOfBoundsException {
    // Some code in which I know an exception will occur
    throw new ArrayIndexOutOfBoundsException();
  }

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
      System.out.println("Now I will throw the same exception using the testMethod method\n");
      testMethod();
    }

  }
}
