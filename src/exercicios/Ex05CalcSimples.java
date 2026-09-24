package exercicios;

import java.util.Scanner;

public class Ex05CalcSimples {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int num1 = scanner.nextInt();
    System.out.println("Digite um número: ");
    int num2 = scanner.nextInt();

    int soma = num1 + num2;
    int multi = num1 * num2;
    int sub = num1 - num2;
    int div = num1 / num2;

    System.out.printf("""
        A Soma dos números é: %d
        A Multiplicação dos números é: %d 
        A Subtração dos números é: %d 
        A Divisão dos números é: %d 
        """,soma, multi,sub,div);
  }
}
