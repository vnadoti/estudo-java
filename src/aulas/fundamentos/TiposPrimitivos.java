package aulas.fundamentos;

public class TiposPrimitivos {
        public static void main(String [] args){
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
