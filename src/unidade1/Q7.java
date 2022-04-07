package unidade1;

import java.util.Scanner;

public class Q7 {
//	Escreva um programa que lê um número que representa o valor da carta, de um (ás) a treze (rei), e outro número correspondente ao 
//	naipe (1 = ouros, 2 = paus, 3 = copas e 4 = espadas). 
//	O programa deve imprimir o nome da carta por extenso.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o numero da carta: ");
		int carta_input = input.nextInt();
		
		System.out.println("digite o numero da naipe: ");
		int naipe_input = input.nextInt();
		
		
		if (!carta(carta_input).equalsIgnoreCase("null") && !naipe(naipe_input).equalsIgnoreCase("null")) {
			System.out.println(carta(carta_input) + " de " + naipe(naipe_input));
		}else {
			System.out.println("carta ou naipe nao existe!!!");
		}
		
		input.close();
	}
	
	public static String carta(int carta) {
		switch (carta) {
		case 1: {
			return "Ás";
		}
		case 2: {
			return "Dois";
		}
		case 3: {
		   return "Treis";
		}
		case 4: {
			return "Quatro";
		}
		case 5: {
			return "Cinco";
		}
		case 6: {
			return "Seis";
		}
		case 7: {
			return "Sete";
		}
		case 8: {
			return "Oito";
		}
		case 9: {
			return "Nove";
		}
		case 10: {
			return "Dez";
		}
		case 11: {
			return "Valete";
		  
		}
		case 12: {
			return "Dama";
		}
		case 13: {
			return "Rei";
		}
		default:
			return "null";
		}
	}
	
	public static String naipe(int naipe) {
		switch (naipe) {
		case 1: {
			return "ouros";
		}
		case 2: {
			return "paus";
		}
		case 3: {
			return "copas";
		}
		case 4: {
			return "espadas";
		}
		default:
			return "null";
		}
	}

}
