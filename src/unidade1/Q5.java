package unidade1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite 3 digitos: ");
        
		int numero = input.nextInt();
		
		int centena = numero / 100;
		numero = (numero % 100);
		int dezena = numero / 10;
		int unidade = numero % 10;
		
		System.out.printf("Numero invertido: %d%d%d\n", unidade, centena, dezena );
		
		
		input.close();
	}

}
