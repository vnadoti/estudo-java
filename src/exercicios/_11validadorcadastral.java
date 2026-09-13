package exercicios;

public class _11validadorcadastral {

	public static void main(String[] args) {
		
		int scoreSerasa = 720;
		double rendaMensal = 4500.0;
		boolean possuiNomeSujo = false;
		
		if (possuiNomeSujo) {
			System.out.println("Crédito Negado: Restrição Cadastral");
		} else if (scoreSerasa > 700 && rendaMensal >= 4000.0) {
			System.out.println("Crédito Aprovado: Linha Premium");
		} else if ((scoreSerasa >= 500 && scoreSerasa <= 700) && rendaMensal >= 2500.0) {
			System.out.println("Crédito Aprovado: Linha Básica");
		} else {
			System.out.println("Crédito Em Análise Manual");
		}
		
		// Operador Ternario		
		boolean adimplente = true;
		String statusCliente = (adimplente) ? "Cliente Ativo" : "Cliente Bloqueado";
		System.out.println(statusCliente);
	}
}
