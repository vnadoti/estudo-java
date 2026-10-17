package aulas.EstruturasRepetitivas;

import java.util.Scanner;

public class LoopWhileDoWhile {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    var name = "";

    //While
    //Avalie a condiçao e faça
      while (!name.equalsIgnoreCase("exit")) {
        System.out.println("Informe um nome");
        name = scanner.nextLine();
      }

    int contador = 0;
    while (contador < 11) {
      System.out.println("Contador: " + contador);
      contador++ ;
    }

    //Do-While
    // Faça uma vez e depois avalie a condiçao (Roda pelo menos 1x)
      do {
        System.out.println("Informe um nome: ");
        name = scanner.nextLine();
        System.out.println(name);
      } while (name.equalsIgnoreCase("exit"));

  }
}
