package exercicios;

import java.util.Scanner;

public class _1saudacaosimples {
    public static void main(String[] args) {
//        Crie um programa que:
//        peça o nome do usuário;
//        mostre a mensagem:
//        Olá, João! Seja bem-vindo ao Java.

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Olá, %s! Seja bem-vindo ao Java.", nome);

        input.close();
    }

}
