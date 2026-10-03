package aulas.EstruturasCondicionais;

import java.util.Scanner;

public class LoopWhile {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    var name = "";

    //Avalie a condiçao e faça
      while (!name.equals("exit")) {
        System.out.println("Informe um nome");
        name = scanner.nextLine();
      }

      // Faça uma vez e depois avalie a condiçao (Roda pelo menos 1x)
      do {
        System.out.println("Informe um nome: ");
        name = scanner.nextLine();
        System.out.println(name);
      } while (name.equalsIgnoreCase("exit"));

  }
}
