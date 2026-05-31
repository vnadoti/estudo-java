package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _5cadastrosimples {
//    Crie variáveis para:
//    nome;
//    idade;
//    altura;
//    sexo.
//    Depois exiba tudo formatado.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);

    System.out.print("Digite seu nome: ");
    String nome = input.nextLine();

    System.out.print("Digite sua idade: ");
    int idade = Integer.parseInt(input.nextLine());

    System.out.print("Digite sua altura: ");
    double altura = Double.parseDouble(input.nextLine());

    System.out.print("Digite seu sexo (M/F): ");
    char sexo  = input.next().charAt(0);


    System.out.printf("Nome: %s\nIdade: %d\nAltura: %.2f\nSexo: %c\n",
            nome,
            idade,
            altura,
            sexo);
    }
}
