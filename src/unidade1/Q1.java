package unidade1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		System.out.println("digite o lado do Quadrado: ");
		double ladoArea = input.nextDouble();
		
		double areaTotal = Math.pow(ladoArea, 2);
		System.out.println("A area tem "+areaTotal);
		
		input.close();
	}

}
