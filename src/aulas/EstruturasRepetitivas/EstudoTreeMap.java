package aulas.EstruturasRepetitivas;

import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
  public static void main(String[] args) {

    TreeMap<String, Double> notasAlunos = new TreeMap<>();
    notasAlunos.put("Alice", 9.9);
    notasAlunos.put("Victor", 5.0);
    notasAlunos.put("Phietra", 8.0);

    for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
        String notaKey = nota.getKey();
        double notaValue = nota.getValue();
      System.out.println(notaKey + " - " + notaValue);
    }

    System.out.println("Primeira Chave: " + notasAlunos.firstKey());
    System.out.println("Última Chave: " + notasAlunos.lastKey());


  }
}
