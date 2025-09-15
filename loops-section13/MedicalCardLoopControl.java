public class MedicalCardLoopControl {
	public static void main(String[] args) {
		int output = 9;

		for(int code = 1; code < 10; code++) {

			if(code == output) {
				break;
			} 

			if (code == 3 || code == 7 || code == 10) {
				System.out.println("Código aceito");
				continue;
			}

			 
			System.out.println("Código não aceito");
			
		}
	}
}