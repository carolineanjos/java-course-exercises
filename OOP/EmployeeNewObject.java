public class EmployeeNewObject {
	String name;
	String role;
	int age;

	public static void main(String[] args) {
		EmployeeNewObject employee1 = new EmployeeNewObject();
		employee1.name = "Caroline";
		employee1.role = "Developer";
		employee1.age = 26;

		EmployeeNewObject employee2 = new EmployeeNewObject();
		employee2.name = "Maria";
		employee2.role = "Developer";
		employee2.age = 28;

		System.out.println("Nome: " + employee1.name);
		System.out.println("Cargo: " + employee1.role);
		System.out.println("Idade: " + employee1.age);

		System.out.println("Nome: " + employee2.name);
		System.out.println("Cargo: " + employee2.role);
		System.out.println("Idade: " + employee2.age);

	}

}