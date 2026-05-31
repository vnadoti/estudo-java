package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _10arearetangulo {
//    Peça:
//    base;
//    altura.
//    Calcule a área:

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Digite a Base: ");
        double base = input.nextDouble();

        System.out.print("Digite a Altura: ");
        double altura = input.nextDouble();
        input.close();

        double area = base * altura;

        System.out.printf(Locale.US, "A Área do Retângulo é : %.2f", area);
    }
}
