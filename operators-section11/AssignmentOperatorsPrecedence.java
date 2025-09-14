public class AssignmentOperatorsPrecedence {
	public static void main(String[] args) {
		int number = 10;

		int b = ++number;
		System.out.println(number);
		System.out.println(b);

		int c = number++;
		System.out.println(number);
		System.out.println(c);

		int d = --number;
		System.out.println(number);
		System.out.println(d);

		int e = number--;
		System.out.println(number);
		System.out.println(e);
	}
}