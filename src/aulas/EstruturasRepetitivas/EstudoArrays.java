package aulas.EstruturasRepetitivas;

public class EstudoArrays {
  public static void main(String[] args) {

    // Array
    // Organize vários valores do mesmo tipo

    int [] numeros = {1, 2, 3, 4, 5};
    String [] frutas = {"Maça", "Pera", "Laranja"};
    double [] salarios = new double[5];

    salarios[0] = 2000.00;
    salarios[1] = 8000.00;
    salarios[2] = 800.00;

//    System.out.println(numeros[4]);
//    System.out.println(frutas[2]);
//    System.out.println(salarios[19]);
//
    for (int i = 0; i < salarios.length; i++) {
      System.out.println("Indice " + i +
          " Salario: " + salarios[i]);
    }

//    for (double salario : salarios) {
//      System.out.println(salario);
//    }

    salarios[2] = 250;


  }
}
