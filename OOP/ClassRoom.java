public class ClassRoom {
  static int total = 0;

  public static int AddToTotal() {
    return total++;
  }

  public static String TotalNumber() {
    return "O total de alunos na sala de aula é: " + total;
  }
}