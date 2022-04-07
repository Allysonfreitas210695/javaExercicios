package unidade1;

import java.util.Scanner;

public class Q11 {
	
	public static void fibonacci(int finaly) {
		if(finaly <= 0) {
			System.out.println("Operação errada numero menor ou igual a ZERO!");
		}else {
			int n1 = 0, n2 = 1;
			String msgFinaly = n1+" "+n2;
			
			for (int i = 2; i < finaly; i++) {
				int result = n1 + n2;
				n1 = n2;
				n2 = result;
				msgFinaly += " "+result;
			}
			
			System.out.println(msgFinaly);	
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite ate onde vai a sequencia da fibonacci: ");
		
		int finaly = input.nextInt();
		
		fibonacci(finaly);
		
	
		input.close();
	}

}
