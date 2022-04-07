package unidade1;

public class Q19 {
    /*
     Dado um polinômio 
     	Pn(x) = a0xn + a1xn-1 + … + an-1x + an
	 este pode ser definido recursivamente como
	 	Pn(x) = xPn-1(x) + an
	 Escreva uma função recursiva para calcular Pn(x). Os parâmetros {a0, …, an} e o 
	 valor x devem ser solicitados ao usuário na função main.
     */
	
	public static int polinomio(int n, int x, int i) {
		if(n == 0) {
			return i;
		}
		else return x * polinomio(n-1, x, i) + n;
	}
	
	public static void main(String[] args) {
       System.out.println(polinomio(3, 2 ,3));
	}

}
