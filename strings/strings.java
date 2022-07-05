/* String Manipulation */

class SpellChecker{
  String response = "ccavyar"; //word to spell is caviar
  String answer = "caviar";
  Boolean isCorrect = false; //default to false

  SpellChecker() {
    // Tell the user if the response was correctly spelled (Yes or No)
    System.out.println("Spell Checker Initialized\n");
    this.isCorrect = false; // response.equals(answer);

    if(this.isCorrect) {
      System.out.println("Answer: " + this.answer);
      System.out.println("Response: " + this.response);
    } else {
      // Specify Mispelling
      // Too Many Letters
      if(response.length() > answer.length()) {
        System.out.println("Too Many Letters");
      }
      // Too Few Letters
      if(answer.length() > response.length()) {
        System.out.println("Too Few Letters");
      }
      // Incorrect Letters - tell user all letters are in/correct if they had too few letters
      //  All letters entered are correct - - - no response
      //      for loop through length of answer
      //        check if letters at counter/index match
      //          if match - loop
      //          else don't match - store value of index of incorrect letter (firstBad)
      //      send feedback to user
      //        firstBad has a value - tell user what the first incorrect letter was
      //        firstBad is null - [no feedback]

      System.out.println("Answer: " + this.answer);
      System.out.println("Response: " + this.response);
    }

  }
}

public class strings{
  public static void main(String[] args) {
    System.out.println("Main Initialized\n");
    SpellChecker check = new SpellChecker();
  }
}
