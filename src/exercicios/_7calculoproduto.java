package exercicios;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class _7calculoproduto {
    public static void main(String[] args) {
//        Peça:
//        nome do produto;
//        preço;
//        quantidade.
//        Mostre:
//        valor total da compra.

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Qual o produto: ");
        String produto = input.nextLine();

        System.out.print("Qual o valor: ");
        BigDecimal preco2 = new BigDecimal(input.nextLine());

        System.out.print("Quantidade: ");
        int qtd = Integer.parseInt(input.next());

        input.close();
//      int valorTotal = (int) (qtd * preco2);
//      double valorTotal = qtd * preco2;

        BigDecimal valorTotal = preco2.multiply(BigDecimal.valueOf(qtd));

        System.out.printf("\nProduto: %s\nValor total da compra: R$%s\nObrigado, volte sempre!\n",
                produto,
                valorTotal);

    }
}
