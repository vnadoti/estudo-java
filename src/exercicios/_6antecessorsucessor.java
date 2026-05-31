package exercicios;
import java.util.Scanner;

public class _6antecessorsucessor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(input.next());

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.printf("Número: %d\nAntecessor: %d\nSucessor: %d",
                numero,
                antecessor,
                sucessor);

    }
}
