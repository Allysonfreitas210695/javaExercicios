package unidade1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q13 {
	
	public static int soma(String transformerNumberString) {
        int soma = 0 , cont = 0;
         
        while(cont != 3) {
					for (int i = 0; i < 9; i++) {
							char value_char = Integer.toString(i).charAt(0);
							if(value_char == transformerNumberString.charAt(cont)) {
											soma += Math.pow(i, 3);
									}
					}
        	cont++;
        }
        return soma;
}
	
	public static String cuboSoma(String transformerNumberString, DecimalFormat df) {
		int cont = 0;
		String cubos = "";
		String somaCubo = "";
		
		while(cont != 3) {
			for (int i = 0; i < 9; i++) {
				char value_char = Integer.toString(i).charAt(0);
				if(value_char == transformerNumberString.charAt(cont)) {
					if(cont < 2) {
						cubos +=""+i+"^3 + ";
						somaCubo += ""+df.format(Math.pow(i, 3))+" + ";
					}else {
						cubos +=""+i+"^3 ";
						somaCubo += ""+df.format(Math.pow(i, 3));	
					}
				}
			}
			cont++;
		}
		cubos += "= ";
		return cubos+somaCubo;
	}
	
	public static String valorInicial(int valor) {
		return Integer.toString(valor);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		
		System.out.println("Digite o numero: ");
		int num = input.nextInt();
		
//		criar uma variavel de inteiro para string!
		String transformerNumberString = Integer.toString(num);
		
		
		if(num == soma(transformerNumberString)) {
			String msg = valorInicial(num) + " = " + cuboSoma(transformerNumberString, df);
			System.out.println(msg);
		}else {
			System.out.println("Resultando imcompativel");
		}
		
		input.close();
	}

}
