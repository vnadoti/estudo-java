package aulas.EstruturasCondicionais;

import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

    System.out.println("Informe um numero ");
    int option = scanner.nextInt();

    switch (option){
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda");
        break;
      case 3:
        System.out.println("Terça");
        break;
      case 4:
        System.out.println("Quarta");
        break;
      case 5:
        System.out.println("Quinta");
        break;
      case 6:
        System.out.println("Sexta");
        break;
      case 7:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Dia Inválido");
    }


    // Java Moderno 14+
     switch (option){
      case 1 -> System.out.println("Domingo");
      case 2 -> System.out.println("Segunda");
      case 3 -> System.out.println("Segunda");
      case 4 -> System.out.println("Terca");
      case 5 -> System.out.println("Quarta");
      case 6 -> System.out.println("Quinta");
      case 7 -> System.out.println("Sexta");
      default -> System.out.println("Dia inválido");
     }




  }
}
