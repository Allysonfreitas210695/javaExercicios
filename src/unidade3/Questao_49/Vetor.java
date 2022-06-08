// Escreva um programa que:
// armazene em um vetor os nomes dos meses do ano
// solicite ao usuário que digite um valor inteiro
// mostre o nome do mês correspondente ao número digitado
// trate as exceções geradas pela digitação de valores inválidos para o índice do mês


import java.util.Scanner;
import java.util.Stack;

public class Vetor {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };
      
        try{
            System.out.print("digite o numero mes correspondente: ");
            int numeroMes = scanner.nextInt();
            System.out.println(meses[numeroMes-1]);
            scanner.close();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exceção: " + e);
            System.out.println("Erro no Indice do Array");
        }
        catch(InputMismatchException e){
            System.out.println("Exceção: " + e);
            System.out.println("A entrada deveria ser inteira. Por favor tente novamente.");
        }finally{
            scanner.close();
        }
    }
}
