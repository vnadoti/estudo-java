package exercicios;
import java.util.Scanner;

public class Ex09IMC {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
//        Calcular o IMC utilizando peso e altura
    System.out.println("-------IMC------");
    System.out.println("Digite seu peso:");
    double peso = Double.parseDouble(scanner.nextLine());
    System.out.println("Digite sua altura:");
    double altura = Double.parseDouble(scanner.nextLine());

    double calculoIMC = peso / (altura * altura);
    System.out.printf("""
        Seu IMC é de : %.2f
        """, calculoIMC);

  }
}
