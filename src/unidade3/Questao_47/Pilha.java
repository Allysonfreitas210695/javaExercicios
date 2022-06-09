

// Utilizando uma pilha, escreva um programa que verifique se uma string
// de entrada formada apenas por ’(’ e ’)’ está balanceada.

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        String texto = "(()){}(())()";
//        so deixa as paranteses na ultilizaçao desse REGEX [^()] = ()
        texto = texto.replaceAll("[^()]", "");

        Stack<Character> pilha = new Stack<>();

        balancea(pilha, texto);
    }

    private static void balancea(Stack<Character> pilha, String text){
         boolean verifique = true;
         int index = 0;

         while(index < text.length() && verifique){
            char c = text.charAt(index);
            if(c == '('){
                pilha.push(c);
            }else {
                if(pilha.isEmpty()) verifique = false;
                else pilha.pop();
            }
            index++;
         }

         if(verifique && pilha.isEmpty()){
            
            System.out.println("Está balaceada");
         }else {
            System.out.println("Não está balaceada");
         }
    }

}
