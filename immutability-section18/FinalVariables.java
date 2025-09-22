class FinalValues {
    final int maxNumber = 200;
    final String message = "Hello World";

    public void printFinalValues(){
        System.out.println(maxNumber);
        System.out.println(message);
    }

}

public class FinalVariables {
    public static void main(String[] args) {
        FinalValues values = new FinalValues();
        // values.maxNumber = 30;

        values.printFinalValues();
    }
}