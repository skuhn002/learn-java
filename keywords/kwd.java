/* Keywords */

class Vehicle {
  int n_whl;
  Boolean can_tow = false;
  static String fuelType = "unleaded";
  final Boolean parkable = true;

  Vehicle(int n_whl){
    this.n_whl = n_whl;
  }

  public void check(){
    System.out.println("");
    System.out.println("This vehicle has " + this.n_whl + " wheels");
    System.out.println("This vehicle takes " + this.fuelType + " fuel");
    System.out.println("Parkable: " + this.parkable);
    System.out.println("");
  }
}

class Truck extends Vehicle {
  Boolean can_tow = true;

  Truck(){
    super(4);
  }

  void checkParent(){
    System.out.println("I am a truck. Can I tow? " + Boolean.toString(this.can_tow));
    System.out.println("Can parent class (Vehicle) tow? " + Boolean.toString(super.can_tow));
  }
}

public class kwd {
  public static void main(String args[]){
    // Create Vehicle and Truck instance with 'new'
    Vehicle ride1 = new Vehicle(4);
    Truck ride2 = new Truck();
    ride1.check();
    ride2.check();

    // Check Parent Value using 'super'
    ride2.checkParent();

    // Change Static Variable fuelType
    Vehicle.fuelType = "diesel";

    ride1.check();
    ride2.check();

    // Parkable is a 'final' variable
    // ride1.parkable = false; // Test: can't overide final variable parkable
  }
}
