package unidade1;

public class Q10 {
	
	public static void preencherVetor(int vet[], int tam) {
		int i;
		for(i = 0; i < tam; i++) {
			vet[i] = i + 1;
		}
	}
	
	public static void imprimiCartão(int vet[], int tam) {
		int contIndex = 0;
		String msg = "";
		
		for(int i = 0; i < tam; i++) {
			contIndex++;
			if(contIndex == 10) {
				msg += "|"+vet[i]+"|\n";
				contIndex = 0;
			}else if(contIndex != 10 && contIndex != 0){
				if(i < 9) {
					msg += "|0"+vet[i]+"| ";
				}else {
					msg += "|"+vet[i]+"| ";	
				}
			}
		}
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		int tam = 60;
		int vet[] = new int [tam];
		preencherVetor(vet, tam);
		imprimiCartão(vet, tam);
	}
	

}
