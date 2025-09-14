public class SimpleApproval {
	public static void main(String[] args) {
		double note1 = 4.5;
		double note2 = 9;

		double finalNote = (note1 + note2) / 2;

		 if(finalNote >= 6) {
		 	System.out.println("Aluno aprovado");
		 } else {
		 	System.out.println("Aluno reprovado");
		 }
	}	
}