package unidade1;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite o angulo do grau: ");
		double anguloGraus = input.nextDouble();
		 
		double radiano = anguloGraus * (Math.PI / 180);
		double seno = Math.sin(anguloGraus);
		double cosseno = Math.cos(anguloGraus)	;
		double tangente = Math.tan(anguloGraus);
		double cossecante = 1 / seno;
		double secante = 1 / cosseno;
		double cotangente = 1 / tangente;
		
		System.out.println("O grau em radiano: " + radiano);
		System.out.println("O seno de " + anguloGraus + " é " + seno);
		System.out.println("O Cosseno de " + anguloGraus + " é " + cosseno);
		System.out.println("O Tangente de "+ anguloGraus + " é " + tangente);
		System.out.println("O cossecante de "+ anguloGraus + " é " + cossecante);
		System.out.println("O secante de "+ anguloGraus + " é " + secante);
		System.out.println("O cotangente de " + anguloGraus + " é " + cotangente);
		
		input.close();
	}
}
