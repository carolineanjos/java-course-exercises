import java.util.HashMap;
import java.util.Map;

public class MapExercise {
  public static void main(String[] args) {
    Map<String, Integer> products = new HashMap<>();

    products.put("Arroz", 30);
    products.put("Feijão", 30);
    products.put("Açúcar", 40);
    products.put("Macarrão", 20);
    products.put("Café", 60);

    System.out.println("Quantidade de Feijão: " + products.get("Feijão"));

    products.remove("Arroz");
    System.out.println("Estoque após a remoção: " + products);

    products.put("Arroz", 55);
    System.out.println("Estoque após a Atualização: " + products);
  }
}