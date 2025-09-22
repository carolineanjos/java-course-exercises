final class Vehicle {
  public void turnsOn(){
    System.out.println("engine on");
  }
}

//returns an error because it is a final class
public class FinalExample2 extends Vehicle {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle();

    vehicle.turnsOn();
  }
}