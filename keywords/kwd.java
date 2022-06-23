/* Keywords */

class Vehicle {
  int n_whl;
  Boolean can_tow = false;
  static String fuelType = "unleaded";

  Vehicle(int n_whl){
    this.n_whl = n_whl;
  }

  public void check(){
    System.out.println("This vehicle has " + n_whl + " wheels");
    System.out.println("This vehicle takes " + fuelType + " fuel");
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
    Vehicle ride1 = new Vehicle(4);
    Truck ride2 = new Truck();
    ride1.check();
    ride2.check();
    ride2.checkParent();
    Vehicle.fuelType = "diesel";
    ride1.check();
    ride2.check();
  }
}
