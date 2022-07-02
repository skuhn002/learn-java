/* String Manipulation */

class SpellChecker{
  String response = "cavyar"; //word to spell is caviar
  String answer = "caviar";
  Boolean isCorrect = false; //default to false

  SpellChecker() {
    // Tell the user if the response was correctly spelled (Yes or No)
    System.out.println("Spell Checker Initialized\n");
    this.isCorrect = response.equals(answer);

    if(this.isCorrect) {
      System.out.println("Answer: " + this.answer);
      System.out.println("Response: " + this.response);
    } else {
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
