package aulas.EstruturasCondicionais;

import java.util.Scanner;

public class IfeElse {
  public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);

    System.out.println("Informe seu nome: ");
    String name = scanner.nextLine();

    System.out.println("Informa sua idade: ");
    String Sidade = scanner.nextLine();
    int idade = Integer.parseInt(Sidade);

//    if (idade >= 18)
//      System.out.printf("%s , voce tem %d então é Maior de Idade" , name, idade);
//    else {
//      System.out.printf("%s, voce tem %d então é Menor de Idade", name , idade);
//    }

    // Ternário
    String msg = idade > 18 ? name + " Voce pode dirigir" : name + " Não pode Dirigir";
    System.out.println(msg);

  }
}