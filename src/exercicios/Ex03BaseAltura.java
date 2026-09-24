package exercicios;

import java.util.Scanner;

public class Ex03BaseAltura {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor da base: ");
    double base = scanner.nextDouble();
    System.out.println("Digite o valor da altura: ");
    double altura = scanner.nextDouble();

    double area = base * altura;
    System.out.printf("""
        A área do retangulo é : %f.2
        """ , area);


  }
}
