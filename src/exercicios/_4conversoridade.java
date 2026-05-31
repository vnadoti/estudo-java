package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _4conversoridade {
    public static void main(String[] args) {
//        Peça a idade do usuário e mostre:
//        idade em meses;
//        idade em dias.
//                Considere:
//        1 ano = 12 meses
//        1 ano = 365 dias

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Qual a sua idade? ");
        int idade = input.nextInt();

        int idadeDias =  idade * 365;
        int idadeMeses = idade * 12;

        System.out.printf("Idade em Dias: %d \n", idadeDias);
        System.out.printf("Idade em Meses: %d \n", idadeMeses);
    }
}
