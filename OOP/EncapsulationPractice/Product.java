public class Product {
	private String name;
	private double price;
	private int quantity;

	public Product(String nameInit, double priceInit, int quantityInit) {
		this.name = nameInit;
		this.price = priceInit;
		this.quantity = quantityInit;
	}

	public static void main(String[] args){
		Product product = new Product("Morango", 23.99, 20);

		System.out.println(product.name);
		System.out.println(product.price);
		System.out.println(product.quantity);
	}
	
}