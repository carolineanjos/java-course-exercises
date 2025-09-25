interface Product {
  String getName();
  int getQuantity();
  void addQuantity(int quantity);
  void removeQuantity(int quantity);
}

class ProductImp implements Product {
  private String name;
  private int quantity;

  public ProductImp(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }
  
  public String getName() {
    return name;
  }

  public int getQuantity() {
    return quantity;
  }


  public void addQuantity(int quantity) {
    this.quantity += quantity;
  }

  public void removeQuantity(int quantity) {
    if(this.quantity > quantity) {
      this.quantity -= quantity;
    } else {
      System.out.println("Quantidade insuficiente para remover do estoque");
    }
  }
}

public class InterfaceTest3 {
  public static void main(String[] args) {
    ProductImp product = new ProductImp("Arroz", 200);

    System.out.println("Produto: " + product.getName());
    System.out.println("Quantidade no estoque: " + product.getQuantity());

    product.addQuantity(50);
    System.out.println("A quantidade total depois de adicionar é: " + product.getQuantity());

    product.removeQuantity(100);
    System.out.println("A quantidade total depois de remover é: " + product.getQuantity());

  }
}