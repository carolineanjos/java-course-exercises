abstract class GeometricPicture {
  abstract void calculateArea();

  abstract void calculatePerimiter();
}

class Retangle extends GeometricPicture {
  void calculateArea() {
    System.out.println("Calculando Área");
  }

  void calculatePerimiter() {
    System.out.println("Calculando perímetro");
  }
}

public class TestAbstract {
  public static void main(String[] args) {
    Retangle retangle = new Retangle();

    retangle.calculateArea();
    retangle.calculatePerimiter();
  }
}