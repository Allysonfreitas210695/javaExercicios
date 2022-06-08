import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Faça um programa para somar dois números:
// O programa deve conter um método int obterIntValido() para receber número inteiro válido
// Enquanto o valor não for um número inteiro, deve-se solicitar um novo número e exibir uma mensagem de erro.
// O método principal deve utilizar obterIntValido para obter os dois operandos da soma

public class SomaDoisNumeros {
    public static int obterIntValido(){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Digite o numero: ");
            int result = input.nextInt();
            return result;
        }catch (InputMismatchException e){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Error: " + e.getMessage());
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            return obterIntValido();
        }
    }

    public static void main(String[] args) {
        int num1 = obterIntValido();
        int num2 = obterIntValido();

        System.out.println("A soma é: "+(num1+num2));
    }
}
