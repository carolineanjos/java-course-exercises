public class Box<T> {
  private T[] elements;
  
  public Box(int capacity) {
    elements = (T[]) new Object[capacity];
  }

  public void add(T element, int index) {
    elements[index] = element;
  }

  public T get(int index) {
    return elements[index];
  }
  
  public static void main(String[] args) {
  // Criando uma CaixaDePreços para Double
  Box<Double> priceBox = new Box<>(3);
  priceBox.add(10.5, 0);
  priceBox.add(20.0, 1);
  System.out.println("Price 1: " + priceBox.get(0)); // Saída: 10.5
  System.out.println("Price 2: " + priceBox.get(1)); // Saída: 20.0

  // Criando uma CaixaDeLetras para Character
  Box<Character> letterBox = new Box<>(2);
  letterBox.add('A', 0);
  letterBox.add('B', 1);
  System.out.println("Letter 1: " + letterBox.get(0)); // Saída: A
  System.out.println("Letter 2: " + letterBox.get(1)); // Saída: B
  }
}