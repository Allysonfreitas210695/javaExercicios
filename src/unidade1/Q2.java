package unidade1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a Primeiro Valor: ");
		float n1 = input.nextFloat();
		System.out.print("Digite a Segundo Valor: ");
		float n2 = input.nextFloat();
		System.out.print("Digite a Terceiro Valor: ");
		float n3 = input.nextFloat();
		
		float soma = (n1 + n2 + n3);
		float media = soma / 3;
		
		System.out.print("A soma é: " + soma + "\n");
		System.out.print("A Media Aritmetrica é: " + media);
		input.close();
		
	}

}
