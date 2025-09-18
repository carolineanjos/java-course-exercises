class Person {
 public String name;
 protected int age;
 protected String address;
 String phone;

 public Person(String name, int age, String address, String phone) {
  this.name = name;
  this.age = age;
  this.address = address;
  this.phone = phone;
 }

 public int getAge() {
  return age;
 }

 public void setAge(int age) {
  this.age = age;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }
}

public class AplicationPerson {
  public static void main(String[] args) {
    Person person = new Person("João", 67, "Rua x, 123", "123456789");

    System.out.println(person.getAge());
    person.setAge(45);
    System.out.println(person.getAge());
    System.out.println(person.getAddress());
    System.out.println(person.getPhone());
  }
}