package exercicios;

import java.util.ArrayList;

public class Ex15GerenciadorNotas {
  public static void main(String[] args) {

    ArrayList<Double> notasAlunos = new ArrayList<>();

    notasAlunos.add(5.4);
    notasAlunos.add(9.0);
    notasAlunos.add(1.0);
    notasAlunos.add(8.3);

    double soma = 0;
    for (double nota : notasAlunos) {
      soma += nota;
    }

    double media = soma / notasAlunos.size();
    System.out.println("Notas alunos: " + notasAlunos);
    System.out.printf("Média das Notas: %.2f", media);


  }
}
