//import present interface

public class Present implements PresentIntf {

  public void OpenPresent() {
    System.out.println("Present Open: Look Inside!\n");
  }

  public void RevealToyCar() {
    System.out.println("Look! It\'s a toy car!");
  }

  public static void main(String[] args){
    Present p = new Present();
    p.OpenPresent();
    p.RevealToyCar();
  }
}
