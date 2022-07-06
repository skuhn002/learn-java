/* String Manipulation */

class SpellChecker{
  String response = "ccavyar"; //word to spell is caviar
  String answer = "caviar";
  Boolean isCorrect = false; //default to false
  Boolean[] checkArr = new Boolean[answer.length()]; //check array - 0's are incorrect letters, and 1's are correct letters

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
      // Incorrect Letters - tell user all letters are in/correct if they had too few letters???
      //  All letters entered are correct - - - no response
      //      for loop through length of answer
      //        check if letters at counter/index match
      //          if match - loop
      //          else don't match - store value of index of incorrect letter (firstBad)
      //      send feedback to user
      //        firstBad has a value - tell user what the first incorrect letter was
      //        firstBad is null - [no feedback]

      for(int cnt = 0; cnt < answer.length(); cnt++){
        System.out.println("Count is: " + (cnt + 1));
        // check for inccorect letter
        if(answer.charAt(cnt) == response.charAt(cnt)){
          // System.out.println("Letter " + cnt + " (" + response.charAt(cnt) + ") is correct"); //test 1
          checkArr[cnt] = true;
        } else {
          // System.out.println("Letter " + cnt + " (" + response.charAt(cnt) + ") is incorrect");
          checkArr[cnt] = false;
        }
      }

      // System.out.println("Answer: " + this.answer);
      // System.out.println("Response: " + this.response);

      // Show user which letters they got correct with "_" inbetween
      System.out.println("This is what you got correct");

      for(int cnt = 0; cnt < checkArr.length; cnt++){
        if(checkArr[cnt]){
          System.out.print(answer.charAt(cnt));
        } else {
          System.out.print(" _ ");
        }
      }
    }

  }
}

public class strings{
  public static void main(String[] args) {
    System.out.println("Main Initialized\n");
    SpellChecker check = new SpellChecker();
  }
}
