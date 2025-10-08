interface Vehicle {
  void acelerate();
}

//Subclasse Carro
class Car implements Vehicle {
  public void acelerate() {
    System.out.println("O carro está acelerando");
  }
}

class Motocycle implements Vehicle {
  public void acelerate() {
    System.out.println("A moto está acelerando");
  }
}

public class TestPoliInterface {
  public static void main(String[] args) {
    //Criando objetos polimorfos

    Vehicle myCar = new Car();
    Vehicle myMotocycle = new Motocycle();

    myCar.acelerate();
    myMotocycle.acelerate();
  }
}