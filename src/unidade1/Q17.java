package unidade1;

import java.util.Scanner;

public class Q17 {
	/*
	 Crie uma função recursiva mdc que retorna o máximo divisor comum de m e n . 
	 O mdc de m e n é definido recursivamente como segue:
		 a. se n > m, retorne mdc(n, m);
		 b. se n = 0, retorne m;
		 c. senão, retorne mdc(n, m%n), onde % é o operador de resto da divisão.
	 */
	
	public static int mdc(int m, int n) {
		//1 fase 12 e 18 sera trocado resultado mdc(18,12)
		//2 fase vai para else " trocando de posicao mdc(12, 18%12 = 6)"
		//3 fase vai para else de novo "mdc(6, 12%6=0)
		//4 fase cai no else if que é 0 e returna m
		if(n > m) return mdc(n, m);
		else if(n == 0) return m;
		else return mdc(n, m%n);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite o valor positivo do m: ");
		int m = input.nextInt();
		System.out.println("digite o valor positivo do n: ");
		int n = input.nextInt();
		
		if(n < 0 || m < 0) System.out.println("Valor invalido não aceita valores negativo!!");
		else System.out.println(mdc(m, n));
        
        input.close();
	}

}
