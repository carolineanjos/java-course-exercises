public class FeedbackNumber {
	public static void main(String[] args) {
		int level = 6;

		String feedback = switch(level) {
			case 1 -> "Muito insatisfeito";
			case 2 -> "Insatisfeito";
			case 3 -> "Neutro";
			case 4 -> "Satisfeito";
			case 5 -> "Muito satisfeito";
			default -> "Opção inválida (deve estar entre 1 e 5)";
		};

		System.out.println(feedback);
	}
}