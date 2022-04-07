package unidade1;

public class Q14 {
//	Duas cidades, A e B, têm populações de 7000 e 20000 habitantes, respectivamente. A cidade A tem um crescimento populacional de 3,5% ao ano, 
//	enquanto a população da cidade B cresce 1% ao ano. 
//	Faça um programa que utilize laço(s) para calcular a quantidade de anos necessária para 
//	que a população da cidade A seja maior ou igual a população da cidade B.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double popA = 7000;
       double popB = 20000;
	   
       int ano = 0;
       
       while(!(popA >= popB)) {
    	   ano++;
    	   popA = popA + (popA * 0.035);
    	   popB = popB + (popB * 0.01);
    	
       }
       
       System.out.printf("Após %d anos o país A ultrapassou B em quantidade de habitantes.", ano);
       System.out.printf("\nPopulação A: %.2f", popA);
       System.out.printf("\nPopulação B: %.2f", popB);
	}

}
