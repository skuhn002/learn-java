/* Compare Integers with Conditional Statements */

class cs1 {
  public static void main(String[] args) {
    /* This class compares integers to determine which integer is bigger or if they are equal */

    int result = -2;
    int v1 = 343;
    int v2 = 343;

    // Are These Variables Equal? If Not, Which Is Bigger?
    if(v1 == v2) {
      // v1 and v2 are equal
      result = 0;
    }else {
      // Compare v1 and v2
      if(v1 > v2) {
        // Check if v1 is bigger
        result = 1;
      }else {
        // v2 is bigger
        result = -1;
      }
    }

    // Output Answer
    switch(result){
      case 1 :
        // v1 > v2
        System.out.println("V1 ("+v1+") is GREATER than V2 ("+v2+").");
        break;
      case 0 :
        // v1 == v2
        System.out.println("V1 ("+v1+") and V2 ("+v2+") are equal");
        break;
      case -1 :
        // v1 < v2
        System.out.println("V1 ("+v1+") is LESS than V2 ("+v2+").");
        break;
      case -2:
        // error
        System.out.println("Oops --- Something Went Wrong");
    }
  }
}
