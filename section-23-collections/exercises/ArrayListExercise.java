import java.util.*;

public class ArrayListExercise {
  public static void main(String[] args) {
    List<String> films = new ArrayList<>();

    films.add("Star Wars");
    films.add("Sinners");
    films.add("Harry Potter");

    System.out.println("A lista contém Sinners? " + films.contains("Sinners"));
    
  }
}