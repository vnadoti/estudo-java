package exercicios;

public class _12classificadorbancario {
	public static void main(String[] args) {
		
		String tipoOperacao = "BOLETO"; 
		
		// O switch inteiro atribui o valor diretamente para a variável:
		double taxaBase = switch (tipoOperacao) {
		case "PIX" -> 0.0;
		case "TED" -> 10.50;
		case "BOLETO" -> 2.5;
		default -> -1.0;
		};
		
		//Switch case antigo
//		switch (tipoOperacao) {
//		case "PIX":
//			taxaBase = 0.0;
//			break;
//		case "TED":
//			taxaBase = 10.50;
//			break;
//		case "BOLETO":
//			taxaBase = 2.50;
//			break;
//		default:
//			taxaBase = -1.0;
//		}
//		
		System.out.println("Operação " + tipoOperacao + "\n" + 
		"A taxa é de : " + taxaBase);
		
	}
	
}
