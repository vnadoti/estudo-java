package exercicios;

import java.util.Scanner;

public class _8dobrodonumero {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            short num = input.nextShort();
            short dobroNum = (short) (num * 2);
            
            System.out.println(dobroNum);
        }
    }
}
