class Fish {
  String name;
  double size;

  public Fish(String name, double size) {
    this.name = name;
    this.size = size;
  }

  public String getName() {
    return name;
  }

  public double getSize() {
    return size;
  }
}

class Octopus {
  String name;
  int tentacles;

  public Octopus(String name, int tentacles) {
    this.name = name;
    this.tentacles = tentacles;
  }

  public String getName() {
    return name;
  }

  public double getTentacles() {
    return tentacles;
  }
}

class Basket<T> {
  private T content;

  public void store(T item) {
    content = item;
  }

  public T take() {
    return content;
  }
}

public class Main {
  public static void main(String[] args) {
    Basket<Fish> fishBasket = new Basket<>(); 
    fishBasket.store(new Fish("dourado", 30.4));
    Fish fish = fishBasket.take();

    System.out.println("Peixe guardado: " + fish.getName() + ", Tamanho: " + fish.getSize());

    Basket<Octopus> octopusBasket = new Basket<>(); 
    octopusBasket.store(new Octopus("octopus1", 8));
    Octopus octopus = octopusBasket.take();

    System.out.println("Polvo guardado: " + octopus.getName() + ", Tentaculos: " + octopus.getTentacles());

  }
}