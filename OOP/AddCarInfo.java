class Car {
	String brand;
	String model;
	int year;

	public Car(){
		brand = "Desconhecido";
		model = "Desconhecido";
		year = 0;
	}

	public Car(String brandInit, String modelInit){
		brand = brandInit;
		model = modelInit;
		year = 0
	}

	public Car(String brandInit, String modelInit, int yearInit){
		brand = brandInit;
		model = modelInit;
		year = yearInit;
	}

	public void showDetails(){
		System.out.println("Marca: " + brand);
		System.out.println("Modelo: " + model);
		System.out.println("Marca: " + year);
	}

}

public class AddCarInfo {
	public static void main(String[] args){
		Car car = new Car();
		car.showDetails()
		Car car2 = new Car();
		car2.showDetails("Toyota", "Prius")
		Car car3 = new Car();
		car3.showDetails("Toyota", "Corolla", 2025)
	}
}
 