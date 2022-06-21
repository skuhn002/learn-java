/* Keywords */

class Vehicle {
  int n_whl;

  Vehicle(int n_whl){
    this.n_whl = n_whl;
  }

  public void check_wheels(){
    System.out.println("This vehicle has " + n_whl + " wheels");
  }
}

public class kwd {
  public static void main(String args[]){
    Vehicle ride1 = new Vehicle(5);
    ride1.check_wheels();
    // System.out.println("Vehicle Wheel No: " + this.n_whl);
  }
}
