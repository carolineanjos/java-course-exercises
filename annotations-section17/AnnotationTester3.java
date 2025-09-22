class DeprecatedExample {

  @Deprecated
  public String obsoletMethod() {
    return "método obsoleto";
  }
}

public class AnnotationTester3 {
  @SuppressWarnings("deprecation")
  public static void main(String[] args) {
    DeprecatedExample example = new DeprecatedExample();

    System.out.println(example.obsoletMethod());
  }
}