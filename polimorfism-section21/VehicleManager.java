abstract class Vehicle {
  private String licensePlate;
  private int year;

  public Vehicle(String licensePlate, int year) {
    this.licensePlate = licensePlate;
    this.year = year;
  }

  public void showInfo() {
    System.out.println("Placa do carro: " + year + " Ano do carro: " + licensePlate);
  }
}

class Bus extends Vehicle {
  int seats;

  public Bus(String licensePlate, int year, int seats) {
    super(licensePlate, year);
    this.seats = seats;
  }

    public void showInfo() {
      super.showInfo();
    System.out.println("Tem " + seats + " assentos no ônibus");
  }
}

class Truck extends Vehicle {
  int axle;

   public Truck(String licensePlate, int year, int axle) {
    super(licensePlate, year);
    this.axle = axle;
  }

  public void showInfo() {
      super.showInfo();
    System.out.println("Tem " + axle + " eixos no caminhão");
  }
}

public class VehicleManager {
  public static void main(String[] args) {
    Bus myBus = new Bus("ABC-1234", 2015, 43);
    Truck myTruck = new Truck("XYZ-9876", 2020, 3);

    myBus.showInfo();
    myTruck.showInfo();
  }
}