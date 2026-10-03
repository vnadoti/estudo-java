package aulas.EstruturasCondicionais;

import java.util.Scanner;

public class LoopFor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//    for (;;){
//      System.out.println("Digite um nome: ");
//      String name = scanner.nextLine();
//
//        if(name.equalsIgnoreCase("exit")) break;
//       System.out.println(name);
//    }


    for ( int i = 1; i <= 101; i++ ){
      System.out.println(i);
      i++;

      if (i == 100) {
          System.out.println("Fim da Execucao");
          break;
        }
    }

  }

}
