abstract class Animal { //Superclass
  public abstract void makeSound();

  public void objectType() {
    System.out.println("Objeto do tipo animal");
  }
}

class Dog extends Animal { //Subclass
  public void makeSound() {
    System.out.println("O cachorro faz auau");
  }
}

class Cat extends Animal { //Subclass
  public void makeSound() {
    System.out.println("O gato faz miau");
  }
}

public class TestPolimorfism {
  public static void main(String[] args) {

    // Criando objetos polimorfos
    Animal myDog = new Dog();
    Animal myCat = new Cat();

    myDog.makeSound();
    myCat.makeSound();

    myDog.objectType();
    myCat.objectType();
  }
}