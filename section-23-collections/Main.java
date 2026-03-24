import java.util.Set;
import java.util.HashSet;
//import java.util.* <--- importa todas as classes do pacote java.util

public class Main {
  public static void main(String[] args) {
    Set<String> conjunto = new HashSet<>();

    //Adicionando elementos
    conjunto.add("Java");
    conjunto.add("Python");
    conjunto.add("C++");

    //Verificando se o conjunto contém um elemento
    System.out.println("Contém 'Java'? " + conjunto.contains("Java"));

    //Adicionando mais elementos
    conjunto.add("JavaScript");
    conjunto.add("Ruby");

    System.out.println("Conjunto completo: " + conjunto);

    //Removendo um elemento
    conjunto.remove("Python");
    System.out.println("Conjunto após remoção: " + conjunto);

    //Tentando adicionar um elemento duplicado
    boolean foiAdicionado = conjunto.add("Java");
    System.out.println("Java foi aicionado novamente? " + foiAdicionado);

    //Limpando o conjunto
    conjunto.clear();
    System.out.println("Conjunto após limpar: " + conjunto);
  }
}