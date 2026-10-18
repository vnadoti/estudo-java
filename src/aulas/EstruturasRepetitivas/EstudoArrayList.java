package aulas.EstruturasRepetitivas;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
  public static void main(String[] args) {

    List<String> listaDeCompras  = new ArrayList<>();
    listaDeCompras.add("Tomate");
    listaDeCompras.add("Sabão de Pó");
    listaDeCompras.add("Macarrão");

    // Adicionou "Banana" no index 1 após Tomate.
    listaDeCompras.add(1, "Banana");

    // Percorreu e mostrou a lista de compras
    for (String compra : listaDeCompras) {
      System.out.println(compra);
    }

    // Pegou o item na posicao index 2 e mostrou o item
    String item = listaDeCompras.get(2);
    System.out.println("Tenho que comprar: " + item);

    // Removeu o item do intex 1 -> No caso "Banana"
    listaDeCompras.remove(1);

    // Percorreu e mostrou a lista novamente
    for (String compra2 : listaDeCompras) {
      System.out.println(compra2);
    }

    System.out.println("----------------------");

    // Verificar se a lista está vazia
    boolean estaVazia = listaDeCompras.isEmpty();
    System.out.println(estaVazia);

    // Verificar o tamanho da Lista
    int tamanhoLista =  listaDeCompras.size();
    System.out.println(tamanhoLista);

    //Verificar se um item contem na Lista
    boolean contemLista = listaDeCompras.contains("Tomate");
    System.out.println(contemLista);

    // Removi todos os itens e chequei se está vazia e o tamanho delas

    // listaDeCompras.clear();
    // System.out.println(listaDeCompras.isEmpty());
    // System.out.println(listaDeCompras.size());

    System.out.println("---------------");

    listaDeCompras.forEach(produtos -> System.out.println(produtos));


  }
}
