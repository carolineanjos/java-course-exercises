class SuperClass {
  public void print(){
    System.out.println("print");
  }
}

class MyClass extends SuperClass {

  @Override
  public void print() {
    System.out.println("prints differently");
  }

}

public class AnnotationTester1 {
  public static void main(String[] args) {
    MyClass example = new MyClass();

    example.print();
  }
}