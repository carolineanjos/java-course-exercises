class MyClass {

  public int sumCalculate(int number1, int number2) {
    return number1 + number2;
  }

  @Deprecated
  public int calculateProduct(int number1, int number2) {
    return number1 * number2;
  }
}

public class AnnotationTester2 {
  public static void main(String[] args) {
    MyClass tester = new MyClass();

    System.out.println(tester.sumCalculate(2,5));
    System.out.println(tester.calculateProduct(4,9));
  }
}