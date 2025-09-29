abstract class Store {
  int docNum;
  String name;
  boolean isOpen = true;

  abstract void openStore();
  abstract void closeStore();
}

class ComercialStore extends Store {
  int docNum;
  String name;
  boolean isOpen = true;

  void openStore(){
    System.out.println("Abrindo a loja");
  }

  void closeStore() {
    System.out.println("Fechando a loja");
  }
}

public class TestAbstract2 {
  public static void main(String[] args) {
    ComercialStore store = new ComercialStore();

    store.openStore();
    store.closeStore();
    System.out.println(store.docNum = 123456789);
    System.out.println(store.name = "Test name");
    System.out.println(store.isOpen = false);
  }
}

