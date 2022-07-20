/* String Manipulation */
// This program compares a response to an answer. The response is meant to be a response to a spelling question.

class SpellChecker{
  String response = "cavyar"; //word to spell is caviar
  String answer = "caviar";
  Boolean isCorrect = false; //default to false
  Boolean[] checkArr = new Boolean[answer.length()]; //check array - 0's are incorrect letters, and 1's are correct letters

  SpellChecker() {
    System.out.println("Response: " + this.response);

    // Tell the user if the response was correctly spelled (Yes or No)
    // System.out.println("Spell Checker Initialized\n");
    this.isCorrect = false; // response.equals(answer);

    if(this.isCorrect) {
      System.out.println("Correct!\n");
    } else {
      // Specify Mispelling
      // Too Many Letters
      System.out.println("Inccorect\n");

      if(response.length() > answer.length()) {
        System.out.println("Too Many Letters");
      }
      // Too Few Letters
      if(answer.length() > response.length()) {
        System.out.println("Too Few Letters");
      }

      for(int cnt = 0; cnt < answer.length(); cnt++){
        // System.out.println("Count is: " + (cnt + 1));

        // check for inccorect letter
        if(cnt < response.length()){
          if(answer.charAt(cnt) == response.charAt(cnt)){
            checkArr[cnt] = true;
          } else {
            checkArr[cnt] = false;
          }
        } else {
          checkArr[cnt] = false;
        }
      }

      // Show user which letters they got correct with "_" inbetween
      System.out.println("\nThis is what you got correct");

      for(int cnt = 0; cnt < checkArr.length; cnt++){
        if(checkArr[cnt]){
          System.out.print(response.charAt(cnt));
        } else {
          System.out.print(" _ ");
        }
      }
    }

  }
}

public class strings{
  public static void main(String[] args) {
    // System.out.println("Main Initialized\n");
    SpellChecker check = new SpellChecker();
  }
}
