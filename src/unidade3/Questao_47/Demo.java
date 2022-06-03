package unidade3.Questao_47;

// Utilizando uma pilha, escreva um programa que verifique se uma string
// de entrada formada apenas por ’(’ e ’)’ está balanceada.

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        String texto = "(()){}[](())()";
//        so deixa as paranteses na ultilizaçao desse REGEX [^()] = ()
        texto = texto.replaceAll("[^()]", "");

        Stack<Character> pilha = new Stack<>();

        adicionarPilha(pilha, texto);

        balancea(pilha);
    }

    private static void adicionarPilha(Stack<Character> pilha, String texto){
        for (int i = 0; i < texto.length(); i++) {
            pilha.push(texto.charAt(i));
        }
    }

    private static void balancea(Stack<Character> pilha){
        if(!(pilha.size() % 2 == 0) || pilha.size() == 0){
            System.out.println("Está desbalanceada!");
        }else {
            int contParenteAberto = 0;
            int contParenteFechado = 0;
            while (!pilha.isEmpty()) {
                if(pilha.pop() == ')'){
                    contParenteAberto++;
                }
                if(pilha.pop() == '('){
                    contParenteFechado++;
                }
            }
            if(contParenteAberto == contParenteFechado) System.out.println("está balaceado!");
            else System.out.println("Não está balaceado!");
        }
    }

}
