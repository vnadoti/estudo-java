package aulas.fundamentos;

public class TiposeVariaveis {
        public static void main(String [] args){

        // ❎ variavel = Um contêiner reutilizável com um valor.

        // 🟥 Primitivo = Valores simples e são armazenados diretamente na memória (stack)
        // 🟦 Referencia = Armazena-se um endereço na memória (stack) que aponta para o (heap)

        // 🟥 Primitivo vs 🟦 Referencia
        //    ---------              ---------
        //    int                     string
        //    double                  array
        //    char                    object
        //    boolean

        int idade = 20;
        int ano = 2026;
        int quantity = 1;

        System.out.println("The year is: " + ano);

        double price = 19.99;
        double temp = 3.5;
        double temperatura = -12.5;

        System.out.println("$" + price);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(currency + " = USD dollar");

        boolean isStudent = true;
        boolean isTeaching = false;
        boolean isOnline = true;

        System.out.println(isStudent + " " + isTeaching + " " + isOnline);

        if (isStudent){
                System.out.println("You are a student");
        } else {
                System.out.println("You are not a student");
        }

        String name = "Nadoti";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";

        System.out.println("Hello " + name);
        System.out.println("Your favorite food is: " + food);
        System.out.println("Your e-mail: " + email);
        System.out.println("Your car is: " + car);

        String nomePessoa = "Victor";
        int idadePessoa = 30;
        double alturaPessoa = 1.60;
        char sexoPessoa = 'M';
        boolean isMaior = true;

        System.out.printf("Meu nome é %s \n" +
            "idade é %d \n" +
            "altura é %.2f \n" +
            "sexo é %c \n" +
            "isMaior é %b \n",
            nomePessoa,
            idadePessoa,
            alturaPessoa,
            sexoPessoa,
            isMaior);
        }
}
