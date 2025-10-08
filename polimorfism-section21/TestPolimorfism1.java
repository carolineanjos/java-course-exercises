// compilador adiciona o extends object indiretamente
abstract class Animal extends Object { //Superclass
  public abstract void makeSound();
}

class Dog extends Animal { //Subclass
  public void makeSound() {
    System.out.println("O cachorro faz auau");
  }
}


public class TestPolimorfism1 {
  public static void main(String[] args) {

    // Criando objetos polimorfos
    Object myDog = new Dog();

    //myDog.makeSound(); -> jeito normal de chamar métodos

    Dog convertObj = (Dog) myDog; //Casting object
    convertObj.makeSound();

    //outra forma menos verbosa:
    ((Dog) myDog).makeSound();

  }
}