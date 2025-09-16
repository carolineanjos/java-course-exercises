public class EmployeeConstructorDefault {
	String name;
	String role;
	int age;

	EmployeeConstructorDefault(String nameInit, String roleInit, int ageInit) {
		this.name = nameInit; // this se refere ao name da linha 2
		this.role = roleInit;
		this.age = ageInit;
	}

	EmployeeConstructorDefault() {

	}

	public static void main(String[] args) {
		// EmployeeConstructorDefault employee1 = new EmployeeConstructorDefault("Caroline", "Desenvolvedora", 26);
		
		EmployeeConstructorDefault employee1 = new EmployeeConstructorDefault();
		employee1.name = "Caroline";

		System.out.println("Nome: " + employee1.name);
		System.out.println("Cargo: " + employee1.role);
		System.out.println("Idade: " + employee1.age);

	}

}