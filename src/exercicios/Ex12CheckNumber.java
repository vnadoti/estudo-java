package exercicios;

import java.util.Scanner;

public class Ex12CheckNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um número: ");
    int num = scanner.nextInt();

    if (num > 0) {
      System.out.println("Numero Positivo: " + num);
    } else if (num < 0){
      System.out.println("Numero Negativo : " + num);
    }else{
      System.out.println("Numero é 0");
    }

  }
}
