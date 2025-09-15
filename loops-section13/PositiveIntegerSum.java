public class PositiveIntegerSum {
	public static void main(String[] args) {
		int num = 10;
		int sum = 0;

		do {
			System.out.println(sum);

			sum += num;
			num--;

		} while(num > 0);
	}
}