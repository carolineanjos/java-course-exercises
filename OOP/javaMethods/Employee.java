package javaMethods;

public class Employee {
	private String name;
	private double salary;

	public Employee(String nameInit, double salaryInit) {
		name = nameInit;
		salary = salaryInit;
	}

	public String getInfo() {
		return "Nome: " + name + ", Salário: " + salary;
	}
}