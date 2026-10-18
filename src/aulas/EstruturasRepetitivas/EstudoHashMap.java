package aulas.EstruturasRepetitivas;

import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
  public static void main(String[] args) {

    HashMap<String, Double> notasAlunos = new HashMap<>();
      notasAlunos.put("Alice", 9.9);
      notasAlunos.put("Victor", 6.0);
      notasAlunos.put("Phietra", 8.5);

    // Iterar atraves da Chave nome do Aluno (Key)
      for (String aluno : notasAlunos.keySet()) {
        double nota = notasAlunos.get(aluno);
        System.out.println(aluno + " : " + nota);
      }

//    System.out.println(notasAlunos.get("Alice"));

    // Iterar atraves da Chave e do Valor (Key e Value)
    for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
      String nome = nota.getKey();
      double valorNota = nota.getValue();
      System.out.println(nome + " : " + valorNota);
    }

    // Metodo tamanho do HashMap
    System.out.println(notasAlunos.size());

    // Metodo remover chave-valor
    notasAlunos.remove("Alice");
  }
}
