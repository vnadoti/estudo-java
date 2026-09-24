package exercicios;
import java.util.Scanner;

public class Ex02AreaQuadrado {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do lado do quadrado: ");
    int ladoQuadrado = scanner.nextInt();

    int area = ladoQuadrado * ladoQuadrado;

    System.out.printf("""
        A Area do quadrado é: %d
        """, area);

  }

}
