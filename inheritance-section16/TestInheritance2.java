class Employee {
  String name;
  double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void increase(double value){
    salary += value;
  }

  public double annualGain() {
    return salary * 12.0;
  }

}

class Assistant extends Employee {

  public Assistant(String name, double salary) {
    super(name, salary);
  }

  public double annualGain() {
    return super.annualGain() + 1000.0;
  }
}

public class TestInheritance2 {
  public static void main(String[] args) {
    Assistant member = new Assistant("Maria", 200);

    member.increase(500);

    System.out.println(member.name);
    System.out.println(member.annualGain());
  }
}