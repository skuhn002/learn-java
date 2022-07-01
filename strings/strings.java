/* String Manipulation */

class SpellChecker{
  String response = "cavyar"; //word to spell is caviar
  String answer = "caviar";
  Boolean isCorrect = false; //default to false

  SpellChecker() {
    // Tell the user if the response was correctly spelled (Yes or No)
    System.out.println("Spell Checker Initialized");
    this.isCorrect = response.equals(answer);
    System.out.println(this.isCorrect.toString());
  }
}

public class strings{
  public static void main(String[] args) {
    System.out.println("Main Initialized");
    SpellChecker check = new SpellChecker();
  }
}
