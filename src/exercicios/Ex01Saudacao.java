package exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Ex01Saudacao {
  /*
  Escreva um código que receba o nome e o ano de nascimento
  de alguém e informe na tela a mensagem "Olá fulano, você
  tem X anos"
  */
  public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String nome = scanner.nextLine();

    System.out.println("Digite o ano do seu nascimento:");
    int anoNascimento = scanner.nextInt();
    int baseYear = OffsetDateTime.now().getYear();
    int idade = baseYear - anoNascimento;

    System.out.printf("""
        Olá %s, você tem %d anos
        """, nome, idade);
  }
}
