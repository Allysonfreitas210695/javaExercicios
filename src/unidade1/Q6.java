package unidade1;

import java.util.Scanner;

public class Q6 {
/*
 Escreva um programa que recebe um valor inteiro representando um intervalo 
 em minutos e imprime o equivalente a esse período expresso em valores inteiros para dias, 
 horas e minutos. Ex.: 9257 minutos = 6 dias, 10 horas e 17 minutos.
 */    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite o intervalo de tempo: ");
        int intervalo = input.nextInt();
        
        int dias = intervalo / (24 * 60);
        intervalo = intervalo % (24 * 60);
		
        int horas = intervalo / 60;
        intervalo = intervalo % 60;
		
		int minutos = intervalo % 60;
		
        System.out.println("dias: " + dias + " horas: " + horas +" minutos: " + minutos);
		input.close();
	}

}
