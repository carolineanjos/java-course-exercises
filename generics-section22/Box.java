public class Box<T> { 
  private T somethingInBox;

  public void save(T thing) {
    this.somethingInBox = thing;
  }
  public T take(){
    return somethingInBox;
  }

  public static void main(String[] args) {
    //Criando uma caixa para guardar Strings
    Box<String> textBox = new Box<>();

    textBox.save("Hello world!");
    String text = textBox.take();

    System.out.println(text); // Imprime Hello World;
  }
}