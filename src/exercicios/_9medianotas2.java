package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class _9medianotas2 {
    public static void main(String[] args) {

    // Média Simples de 3 números
    // Peça 3 números e calcule a média

    Scanner input = new Scanner(System.in);
    input.useLocale(Locale.US);

    System.out.print("Digite um número: ");
    double n1 = input.nextDouble(); 
        
    System.out.print("Digite um número: ");
    double n2 = input.nextDouble(); 
        
    System.out.print("Digite um número: ");
    double n3 = input.nextDouble(); 

    double media = (n1 + n2 + n3) / 3;
    System.out.printf(Locale.US, "A Média dos Números são: %f",media);

    input.close();    
       
    }
}
