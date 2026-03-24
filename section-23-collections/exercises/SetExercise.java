import java.util.*;

public class SetExercise {
  public static void main(String[] args) {
    Set<Integer> numbers = new HashSet<>();

    numbers.add(6);
    numbers.add(8);
    numbers.add(4);
    numbers.add(2);

    System.out.println("Contém o número 2? " + numbers.contains(2));

    //numbers.remove(4);

    System.out.println("Todos os números restantes: " + numbers);

  }
}