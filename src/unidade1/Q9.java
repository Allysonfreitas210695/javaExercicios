package unidade1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
//		Escreva um programa que lê dois pontos no plano cartesiano com coordenadas x e y e informa se o segundo ponto está acima, abaixo, à esquerda e à direita do primeiro.
		Scanner input = new Scanner(System.in);
		int x1, y1, x2, y2;
		System.out.println("Digite o Primeiro ponto cartesiano de (X,Y):");
		x1 = input.nextInt();
		y1 = input.nextInt();
	
		System.out.println("Digite o Segundo ponto cartesiano de (X,Y):");
		x2 = input.nextInt();
		y2 = input.nextInt();
		
		String msg = "Segundo Ponto está a ";
		
		if(x1 == x2 && y1 == y2) {
			msg += " Os dois pontos estão na mesma origem ";
		}else if(x1 == x2 || y1 == y2) {
			if(x1 > x2) {
				msg += "Esquerda";
			}else if(x1 < x2) {
				msg += "Está Direta";
			}else if(y1 > y2) {
				msg += "Está Abaixo";
			}else {
				msg += "Está Acima";
			}
		}else if(x1 > x2) {
			msg += "Esquerda ";
			if(y1 > y2) {
				msg += "Está Abaixo";
			}else {
				msg += "Está Acima";
			}
		}else {
			msg += "Direita ";
			if(y1 < y2) {
				msg += "Está Acima";
			}else {
				msg += "Está Abaixo";
			}
		}
		
		System.out.println(msg);
		input.close();
	}

}
