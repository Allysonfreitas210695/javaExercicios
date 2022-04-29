import java.util.Scanner;

// Escreva uma classe que encapsule uma matriz de tamanho 2 × 2 de valores do tipo float usando um array de duas dimensões. 
// Nesta classe, além do construtor, escreva um método que calcule o determinante da matriz encapsulada, 
// e um método que permita a impressão formatada dos seus valores. 
// Escreva um aplicativo de teste que demonstra as capacidades da classe criada.

public class Matriz {
    private static final int LINHA = 2;
    private static final int COLUNA = 2;
    private float matriz[][];

    Matriz(){
        matriz = new float[2][2];
    }

    public void preencherMatriz(){
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                System.out.println("digite o valor da LINHA "+i+" COLUNA "+j);
                float valor = leitor.nextFloat();
                this.matriz[i][j] = valor;
            }
        }
        leitor.close();
    }

    public void imprimirFormatadaMatriz(){
        System.out.print("Matriz formatada");
        String matrizFormat = "";
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
                if(j == 1){
                    matrizFormat += "|"+this.matriz[i][j]+"|\n";
                }else{
                    matrizFormat += "|"+this.matriz[i][j]+"| ";
                }
            }
        }
        
        
       System.out.println("\n"+matrizFormat);

    }

    public float determinanteMatriz(){
        float diagonalPricipal = 1, diagonalSegudaria = 1;
        for (int i = 0; i < LINHA; i++) {
            for (int j = 0; j < COLUNA; j++) {
               if(i == j) {
                   diagonalPricipal *= this.matriz[i][j];
               }else{
                   diagonalSegudaria *= this.matriz[i][j];
               }
            }
        }
  
       return diagonalPricipal - diagonalSegudaria; 
    }
}
