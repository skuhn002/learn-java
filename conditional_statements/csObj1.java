/* Hello World (Java) */

class csObj1 {
  public static void main(String[] args) {
    /* This class compares integers to determine which integer is bigger or if they are equal */

    int v1 = 343;
    int v2 = 343;
    int result = -2;

    // Are These Variables Equal? If Not, Which Is Bigger?
    if(v1 == v2) {
      // Check if v1 and v2 are equal
      System.out.println("V1 ("+v1+") and V2 ("+v2+") are equal");
      result = 0;

    }else {
      // Compare v1 and v2
      if(v1 > v2) {
        // Check if v1 is bigger
        System.out.println("V1 ("+v1+") is GREATER than V2 ("+v2+").");
        result = 1;
      }else {
        // v2 is bigger
        System.out.println("V1 ("+v1+") is LESS than V2 ("+v2+").");
        result = -1;
      }

    }

    // Switch Example
    switch(result){
      case -1 :
        break;
      case 0 :
        break;
      case 1 :
        break;
      case -2:
        System.out.println("Oops --- Something Went Wrong");
    }
  }
}
