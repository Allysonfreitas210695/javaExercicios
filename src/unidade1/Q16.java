package unidade1;

import java.util.Scanner;

public class Q16 {
	public static int fatRecursao(String msg, int fat) {
		if(fat == 0) return 1;
		else {
			msg += fat+"! ";
			System.out.println(msg);
			return fat * fatRecursao(msg, fat - 1);
		}
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("digite o numero do fatorial que deseja saber: ");
		int fatInput = input.nextInt();
		int fat = fatRecursao("", fatInput);
        System.out.println(fatInput + "!" + " = " + fat);
        
        input.close();
	}

}
