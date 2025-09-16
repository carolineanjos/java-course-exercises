import javaMethods.Employee; // or import company.data.*

public class PayrollMethod {
	public static void main(String[] args) {
		Employee employee = new Employee("Caroline", 8000);
		System.out.println(employee.getInfo());
	}
}