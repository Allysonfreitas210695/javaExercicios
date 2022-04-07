package unidade1;

public class Q15 {
	public static int potencia(int base, int expoente) {
		return (expoente > 1) ? base * potencia(base, expoente - 1) : expoente == 0 ? 1 : base;
	}

	public static void main(String[] args) {
		int pot = potencia(5, 1);
		System.out.println("Resultado " + pot);
	}

}
