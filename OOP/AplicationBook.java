class Book {
  public String title;
  public String autor;
  protected int publicationYear;
  protected double price;

  public Book(){

  }

  public Book(String titleInit, String autorInit) {
    title = titleInit;
    autor = autorInit;
  }

  public Book(String titleInit, String autorInit, int publicationYearInit, double priceInit) {
    title = titleInit;
    autor = autorInit;
    publicationYear = publicationYearInit;
    price = priceInit;
  }
}

public class AplicationBook {
  public static void main(String[] args) {
    Book infoBook = new Book();
    Book infoBook1 = new Book("Titulo Teste", "Autor Teste");
    Book infoBook2 = new Book("Titulo Teste 2", "Autor Teste 2", 2015, 48.99);

    System.out.println(infoBook.title);
    System.out.println(infoBook1.title);
    System.out.println(infoBook2.price);
  }
}