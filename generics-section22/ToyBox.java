class ToyBox {
  private Object itemInBox;

  public void store(Object item) {
    this.itemInBox = item;
  }

  public Object get() {
    return itemInBox;
  }

  public static void main(String[] args) {
    // Creating a box to store toy cars
    ToyBox toyCarBox = new ToyBox();
    toyCarBox.store(new CarToy("Hot Wheels"));

    // Creating a box to store dolls
    ToyBox dollBox = new ToyBox();
    dollBox.store(new Doll("Barbie"));

    // Checking the object type before casting
    if (toyCarBox.get() instanceof CarToy) {
      CarToy toyCar = (CarToy) toyCarBox.get();
      System.out.println(toyCar.getType());
    }

    if (dollBox.get() instanceof Doll) {
      Doll doll = (Doll) dollBox.get();
      System.out.println(doll.getName());
    }
  }
}