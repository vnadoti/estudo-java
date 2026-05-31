package exercicios;

import java.util.Scanner;

public class _2somanumeros {
    public static void main(String[] args) {

//        Peça dois números inteiros ao usuário e mostre:
//        a soma;
//        a subtração;
//        a multiplicação;
//        a divisão.

    Scanner input = new Scanner(System.in);

        System.out.println("Digite o 1 numero: ");
    int num1 = input.nextInt();
        System.out.println("Digite o 2 numero: ");
    int num2 = input.nextInt();

        System.out.println("A Soma é : " + (num1 + num2));
        System.out.println("A Subtração é : " + (num1 - num2));
        System.out.println("A Multiplicação é : " + (num1 * num2));
        System.out.println("A Divisão é : " + ((double) num1 / num2));
    }

}
