public class MonthDays {
	public static void main(String[] args) {
		String month = "Fevereiro";

		String numberDays = switch(month) {
		case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro" -> "O número de dias é 31";
		case "Abril", "Junho", "Setembro", "Novembro" -> "O número de dias é 30";
		case "Fevereiro" -> "O número de dias é 28";
		default -> "O número de dias é desconhecido";
		};

		System.out.println(numberDays);
	}
}