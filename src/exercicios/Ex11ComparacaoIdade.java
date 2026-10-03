package exercicios;

import java.util.Scanner;

public class Ex11ComparacaoIdade {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        System.out.println(idade > 18);
        System.out.println(idade < 18);
        System.out.println(idade == 18);
        System.out.println(idade != 18);
        System.out.println(idade <= 18);
        System.out.println(idade >= 18);

        scanner.close();
    }
}
