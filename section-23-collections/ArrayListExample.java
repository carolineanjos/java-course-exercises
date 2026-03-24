import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Java");
    list.add("Python");
    list.add("C++");

    System.out.println("Contém java? " + list.contains("Java"));

    //Adicionando todos os elementos de outra coleção
    List<String> anotherList = Arrays.asList("JavaScript", "Ruby");
    list.addAll(anotherList);

    System.out.println("Lista completa: " + list);

    list.remove("Python");

    System.out.println("Lista completa após a remoção: " + list);

    String element = list.get(2);
    System.out.println("Elemento no índice 2: " + element);

    list.clear();
    System.out.println("Lista após limpar: " + list);
    
  }
}