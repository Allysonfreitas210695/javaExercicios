package unidade1;

import java.util.Scanner;

public class Q12 {
	
	public static void imprime(int number) {
		String msgFinaly = ""+number+" =";
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0)
				msgFinaly += " "+i;
		}
		
		System.out.println(msgFinaly);
	}
	
	public static boolean perfeitoDivisor(int number) {
		int soma = 0;
		
		for (int i = 1; i <= number / 2; i++) {
			if(number % i == 0)
				soma += i;
		}
		
		return (soma == number) ? true : false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 1, qtd = 0;
		System.out.println("Digite o total de numero Perfeitos: ");
		int num = input.nextInt();
		
		while(qtd < num) {
			boolean verificar = perfeitoDivisor(i);
			if(verificar) {
				qtd++;
				imprime(i);
			}
			i++;
		}
		
		input.close();
	}

}
