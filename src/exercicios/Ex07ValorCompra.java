package exercicios;

import java.util.Scanner;

public class Ex07ValorCompra {
  /*
  Criar um programa que calcule o valor final de uma compra
  a partir de preço, quantidade e percentual de desconto.
  */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o preço do Produto: ");
    double preco = Double.parseDouble(scanner.nextLine());

    System.out.println("Digite a quantidade do Produto: ");
    int quantidade = Integer.parseInt(scanner.nextLine());

    System.out.println("% de Desconto: 0 a 100");
    double desconto = Double.parseDouble(scanner.nextLine());

    double valorCompra = preco * quantidade;
    double valorDesconto = valorCompra * (desconto / 100);
    double valorFinal = valorCompra - valorDesconto;

    System.out.printf("""
        -----------------------------------
        O Preço unitário do Produto é: R$%.2f
        A Quantidade do Produto foi de : %d
        Valor total sem desconto é de : %.2f
        -----------------------------------
        O Desconto aplicado foi de: R$%.2f
        O Valor final da compra: R$%.2f
        """, preco, quantidade, valorCompra, valorDesconto, valorFinal);

    scanner.close();
  }
}
