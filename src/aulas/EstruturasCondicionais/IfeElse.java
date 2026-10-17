package aulas.EstruturasCondicionais;

import java.util.Scanner;

public class IfeElse {
  public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);
//
//    System.out.println("Informe o seu nome: ");
//    String name = scanner.nextLine();
//
//    System.out.println("Informa a sua idade: ");
//    String Sidade = scanner.nextLine();
//    int idade = Integer.parseInt(Sidade);
//
//    if (idade >= 18){
//      System.out.println("Você é maior de idade!");
//    } else {
//      System.out.println("Você é menor de idade!");
//    }


    boolean estaChovendo = true;
    boolean temCartao = false;
    boolean temDinheiro = true;

    if (temDinheiro && temCartao){
      System.out.println("Pedir Ifood");
    } else if(temDinheiro || temCartao) {
      System.out.println("Comprar Hotdoog no zé");
    } else {
      System.out.println("Faz Janta");
    }

    String msg = temDinheiro ? "Pede um Ifood" : "Faz Janta";
    System.out.println(msg);

//    // Ternário
//    String msg = idade > 18 ? name + " Voce pode dirigir" : name + " Não pode Dirigir";
//    System.out.println(msg);

  }
}