public class GenericBox<T> {
  private T itemInBox;

  public void store(T item) {
    this.itemInBox = item;
  }

  public T get() {
    return itemInBox;
  }

  public static void main(String[] args) {
    // Creating a box to store toy cars
    GenericBox<CarToy> toyCarBox = new GenericBox<>();
    toyCarBox.store(new CarToy("hot wheels"));

    GenericBox<Doll> dollBox = new GenericBox<>();
    dollBox.store(new Doll("barbie"));

    // No need to cast,
    // because the get() method returns a toy car and a doll!

    CarToy toyCar = toyCarBox.get();
    Doll doll = dollBox.get();

    System.out.println(toyCar.getType());
    System.out.println(doll.getName());
  }
}