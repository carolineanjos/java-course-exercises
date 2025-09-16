package company.data;

public class Employee {
	String name;
	double salary;

	public Employee(String nameInit, double salaryInit) {
		name = nameInit;
		salary = salaryInit;

		System.out.println("Nome: " + name);
		System.out.println("Salário: " + salary);
	}
}