class Calculator {
  final public int sum(int a, int b) {
    return a + b;
  }
}

public class FinalExample extends Calculator {
  // returns an error because it is a final method
  final public int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println("Calculator");
  }
}