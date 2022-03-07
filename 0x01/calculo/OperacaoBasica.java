public class OperacaoBasica {

	public static double somar(double a, double b) {
		return a + b;
	}
	
	public static double subtrair(double a, double b) {
		return a - b;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	
	public static double dividir(double a, double b) {
		return a / b;
	}
	
	public static double sqrt(double a) {
		return Math.sqrt(a);
	}
	
public static String numero_primo(double a) {
	int cont = 0;

		if (a <= 1)
			return "Número invalido. Numero menor ou igual a 1 não é primo";
	
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				cont++;
			}
		}
		
		if (cont == 2) {
			return "Numero válido, o numero é primo";
		}
		return "Número válido, mas não é primo";
	}
}
