public class AutomaticPromotion {
	public static void main(String[] args) {
		byte varByte = 23;
		short varShort = 250;
		char varChar = "A";
		int varInt = 9000;
		long varLong = 7L;
		float varFloat = 3.6789f;
		double varDouble = 1.5;

		int firstPromotion = varByte + varShort;
		System.out.println(firstPromotion);

		float secondPromotion = varFloat + varShort;
		System.out.println(secondPromotion);
	}
}