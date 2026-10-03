package aulas.fundamentos;

import java.util.Scanner;

public class EntradaDados {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe seu nome: ");
    String name = scanner.next();
    System.out.println("Informe sua idade: ");
    int idade = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Informe sua cidade: ");
    String city = scanner.nextLine();
    System.out.println("Informe sua profissao: ");
    String profissao = scanner.nextLine();
    scanner.close();

    System.out.printf("""
        Nome: %s
        Idade: %d
        Cidade: %s 
        Profissão: %s
        """, name, idade, city, profissao);
  }
}
