package exercicios;

import java.util.Scanner;

public class Ex13ParouImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int num = scanner.nextInt();

    int calcPar = num % 2;

    if (calcPar == 0){
      System.out.println("Par");
    } else {
      System.out.println("Impar");
    }

  }
}
