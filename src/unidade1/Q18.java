package unidade1;

import java.util.Scanner;

public class Q18 {
//   Crie uma função recursiva que verifique se um dado número é primo.
	
	public static int elPrimo(int num, int indice) {
		if(indice > num || indice <= 0) return 0;
		else if(num % indice == 0) {
			return 1 + elPrimo(num, indice + 1);
		}else {
			return 0 + elPrimo(num, indice + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite um numero para olhar se é primo: ");
		int num = input.nextInt();
		
		if(elPrimo(num, 1) == 2) {
			System.out.println("O numero é primo tem 2(divisores)");
		}else {
			System.out.println("o numero não é primo devido ter "+elPrimo(num, 1) + "(divisores) > 2(divisores)");
		}
		
		input.close();
	}

}
