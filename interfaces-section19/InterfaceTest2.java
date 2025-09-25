interface RestaurantOrder {
void addItem(String item, double price);
void calculateTotal();
}

public class InterfaceTest2 implements RestaurantOrder {
  private double total = 0;

  public void addItem(String item, double price){
    System.out.println("Itens adicionados: " + item + " - R$" + price);
    total += price;
  }

  public void calculateTotal(){
    System.out.println("O total foi: R$ " + total);
  }

  public static void main(String[] args) {
    InterfaceTest2 test = new InterfaceTest2();
    test.addItem("Hamburguer", 20);
    test.addItem("Milkshake", 30);
    test.calculateTotal();
  }
}