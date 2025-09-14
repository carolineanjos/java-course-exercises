public class FrequencyAndNoteApproval {
	public static void main(String[] args) {
		int note1 = 7;
		int note2 = 10;
		int frequency = 83;

		double media = (note1 + note2) / 2;

		if(media >= 7 && frequency > 75) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
	}
}