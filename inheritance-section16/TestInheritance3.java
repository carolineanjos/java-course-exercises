class Person {
  String name;
  int age;

  Person(String nameInit, int ageInit) {
    this.name = nameInit;
    this.age = ageInit;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

}

class Student extends Person {
  String registration;

  Student(String name, int age, String registrationInit) {
    super(name,age);
    this.registration = registrationInit;
  }

  public String getRegistration() {
    return registration;
  }
}

public class TestInheritance3 {
  public static void main(String[] args) {
    Student member = new Student("Maria", 25, "ok");
    System.out.println(member.getName());
    System.out.println(member.getAge());
    System.out.println(member.getRegistration());
  }
}