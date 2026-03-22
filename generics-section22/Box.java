public class Box<T> { //representa o tipo de dado genérico
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

    Box<Integer> numberBox = new Box<>();
    Integer numero = Integer.valueOf(5);
    numberBox.save(numero);

    Integer valorResgatado = numberBox.take();
    System.out.println(valorResgatado);
  }
}