package exercicios;

import java.util.Scanner;

public class Ex06MediasNotas {
  public static void main(String[] args) {
  /*
  Criar um programa que receba três notas armazenadas
  em variáveis e calcule a média final.
  */
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    double nota1 = Double.parseDouble(scanner.nextLine());
    System.out.println("Digite a segunda nota: ");
    double nota2 = Double.parseDouble(scanner.nextLine());
    System.out.println("Digite a terceira nota: ");
    double nota3 = Double.parseDouble(scanner.nextLine());

    System.out.println("Digite a Avaliação da Escola: ");
    int ava = Integer.parseInt(scanner.nextLine());

    System.out.println("Digite o nome do Aluno: ");
    String nomeAluno = scanner.nextLine();

    double mediaNotas = (nota1 + nota2 + nota3) / 3;

    System.out.printf("""
        O Nome do Aluno é: %s
        A Média da nota é : %.1f
        A Avaliação da Escola foi de : %d
        """, nomeAluno, mediaNotas, ava);

    scanner.close();
  }
}
