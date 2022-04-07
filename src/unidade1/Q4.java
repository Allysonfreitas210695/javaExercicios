package unidade1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite o Grau o qual voce que converte para Fahrenheit: ");
		float celcius = input.nextFloat();
		
		float f = (celcius * 1.8f) + 32;
		
		System.out.printf("Resultado em Fahrenheit: %.2f\n",f);
		input.close();
	}

}
