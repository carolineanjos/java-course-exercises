public class SumNumbers {
  public static void main(String[] args) {
    int[] numbers = new int[1000];
    int sum = 0;

    for(int i = 1; i < numbers.length; i++){
      numbers[i - 1] = i;
      sum += i;
    }

    System.out.println(sum);

  }
}