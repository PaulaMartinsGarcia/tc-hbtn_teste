public class OperacaoBasicaTeste {

	public static boolean testar_soma() {
		return OperacaoBasica.somar(5, 3) == 8;
	}
	
	public static boolean testar_subtracao() {
		return OperacaoBasica.subtrair(5, 3) == 2;
	}
	
	public static boolean testar_multiplicacao() {
		return OperacaoBasica.multiplicar(5, 3) == 15;
	}
	
	public static boolean testar_divisao() {
		return OperacaoBasica.dividir(9, 3) == 3;
	}
	
	public static boolean testar_sqrt() {
		return OperacaoBasica.sqrt(49) == 7;
	}
	
	public static boolean testar_primo() {
		return OperacaoBasica.numero_primo(7) == ("Numero válido, o numero é primo");
	}
	
	public static boolean testar_nao_primo() {
		return OperacaoBasica.numero_primo(4).equals("Número válido, mas não é primo");
	}
	
	public static boolean testar_primo_menor_zero() {
		return !OperacaoBasica.numero_primo(-2).equals("Número invalido. Numero menor ou igual a 1 não é primo");
	}
}
