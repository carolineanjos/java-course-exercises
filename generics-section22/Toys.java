class CarToy {
  private String type;

  public CarToy(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}

class Doll {
  private String name;

  public Doll(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

public class Toys {
  public static void main(String[] args) {
    CarToy car = new CarToy("Hot Wheels");
    Doll doll = new Doll("Barbie");

    System.out.println("Car:" + car.getType());
    System.out.println("Doll:" + doll.getName());
  }
}