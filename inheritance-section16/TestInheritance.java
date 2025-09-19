class Vehicle {
  public void acelerate(){
    System.out.println("Veículo acelerando!");
  }
}

class Car extends Vehicle {
  public void acelerate() {
    System.out.println("Carro acelerando!");
    super.acelerate();
  }
}

public class TestInheritance {
  public static void main(String[] args) {
    Car newCar = new Car();

    newCar.acelerate();
  }
}