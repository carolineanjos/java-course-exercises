public class EmployeeConstructor {
	String name;
	String role;
	int age;

	EmployeeConstructor(String nameInit, String roleInit, int ageInit) {
		this.name = nameInit; // this se refere ao name da linha 2
		this.role = roleInit;
		this.age = ageInit;
	}

	public static void main(String[] args) {
		EmployeeConstructor employee1 = new EmployeeConstructor("Caroline", "Desenvolvedora", 26);

		EmployeeConstructor employee2 = new EmployeeConstructor("Maria", "Gerente", 48);

		System.out.println("Nome: " + employee1.name);
		System.out.println("Cargo: " + employee1.role);
		System.out.println("Idade: " + employee1.age);

		System.out.println("Nome: " + employee2.name);
		System.out.println("Cargo: " + employee2.role);
		System.out.println("Idade: " + employee2.age);

	}

}