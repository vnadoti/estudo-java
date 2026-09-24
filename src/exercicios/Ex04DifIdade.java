package exercicios;
import java.util.Scanner;

public class Ex04DifIdade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade1 = scanner.nextInt();
    System.out.println("Digite a idade do seu amigo: ");
    int idade2 = scanner.nextInt();
    int difIdade;

    if (idade1 > idade2) {
      difIdade = idade1 - idade2;
    } else{
      difIdade = idade2 - idade1;
    }

    System.out.printf("""
        A Diferença de idade é de %d anos.
        """, difIdade);
    }
}
