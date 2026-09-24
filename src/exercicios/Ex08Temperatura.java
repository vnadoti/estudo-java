package exercicios;

import java.util.Scanner;

public class Ex08Temperatura {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a Temperatura em Celsius = C:");
    double temperaturaC = Double.parseDouble(scanner.nextLine());
    double conversaoTempCparaF =  temperaturaC * 1.8 + 32;

    System.out.println("Digite a Temperatura em Fahrenheit = F:");
    double temperaturaF = Double.parseDouble(scanner.nextLine());
    double conversaoTempFparaC =  (temperaturaF - 32) / 1.8;

    System.out.printf("""
        Temperatura em Celsius : %.2f
        A Conversão de C para F = %.2f
        -------------------------------
        Temperatura em Fahrenheit : %.2f
        A Conversão de F para C = %.2f
        """, temperaturaC, conversaoTempCparaF, temperaturaF,conversaoTempFparaC);
  }
}
