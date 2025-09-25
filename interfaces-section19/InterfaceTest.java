interface Vehicle {
  void init();
  void stop();

  default void honk() {
    System.out.println("Buzinou!");
  }
}

class Car implements Vehicle {
  public void init() {
    System.out.println("Ligando o carro");
  }

  public void stop() {
    System.out.println("Desligando o carro");
  }
}

class Truck implements Vehicle {
  public void init() {
    System.out.println("Ligando o caminhão");
  }

  public void stop() {
    System.out.println("Desligando o caminhão");
  }
}

public class InterfaceTest {
  public static void main(String[] args) {
    Car car = new Car();
    car.init();
    car.stop();
    car.honk();

    Truck truck = new Truck();
    truck.init();
    truck.stop();
  }
}