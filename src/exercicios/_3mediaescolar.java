package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _3mediaescolar {
    public static void main(String[] args) {
//        Peça:
//        nome do aluno;
//        nota 1;
//        nota 2.
//        Calcule a média e mostre:

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
            String nome = input.nextLine();
        System.out.println("Digite a nota1: ");
            double nota1 = input.nextDouble();
        System.out.println("Digite a nota2: ");
            double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("Olá, %s! \nSua média final é de %f", nome, media);
    }

}
