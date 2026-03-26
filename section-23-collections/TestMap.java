import java.util.HashMap;
import java.util.Map;

public class TestMap {
  public static void main(String[] args) {
    Map<String, Integer> item = new HashMap<>();

    item.put("Java", 20);
    item.put("Python", 30);
    item.put("C++", 70);

    System.out.println("Contém Java? " + item.containsKey("Java"));

    //Obtendo um valor associado à uma chave
    System.out.println("Valor associado a 'Java': " + item.get("Java"));

    item.put("Javascript", 30);
    item.put("Ruby", 10);

    System.out.println("Mapa completo: " + item);

    item.remove("Python");

    System.out.println("Mapa completo após a remoção: " + item);

    item.put("Java", 35); //Atualizando o valor associado a uma chave

    System.out.println("Mapa completo após a atualização: " + item);

    item.clear();

    System.out.println("Mapa completo após a limpeza: " + item);

  }
}
