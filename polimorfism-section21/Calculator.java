abstract class Operation {

  public abstract double calculate(double value1, double value2);
}

class Addition extends Operation {
  @Override
  public double calculate(double value1, double value2){
    System.out.println("Adição:");
    return value1 + value2;
  }
}

class Subtraction extends Operation {
  @Override
  public double calculate(double value1, double value2){
    System.out.println("Subtração:");
    return value1 - value2;
  }
}

class Multiplication extends Operation {
  @Override
  public double calculate(double value1, double value2){
    System.out.println("Multiplicação:");
    return value1 * value2;
  }
}

class Division extends Operation {
  @Override
  public double calculate(double value1, double value2){
    System.out.println("Divisão:");
      if (value2 != 0) {
        return value1 / value2;
      } else {
        System.out.println("Erro: Divisão por zero não é permitida.");
        return Double.NaN; 
      }
  }
}

public class Calculator {
  public static void main(String[] args) {
    Operation addition = new Addition();
    Operation subtraction = new Subtraction();
    Operation multiplication = new Multiplication();
    Operation division = new Division();

    System.out.println(addition.calculate(34,40));
    System.out.println(subtraction.calculate(50,43));
    System.out.println(multiplication.calculate(3,90));
    System.out.println(division.calculate(90,3));
  }
}