package unidade3.Questao_45;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<Character> letras = new LinkedList<Character>();
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');
        letras.add('F');
        letras.add('G');
        letras.add('H');
        letras.add('I');
        letras.add('J');

//        Ordem de inserção
        System.out.println(letras);

        LinkedList<Character> letrasInversa = new LinkedList<>();

        for (int i = letras.size() - 1; i >= 0; i--) {
            letrasInversa.add(letras.get(i));
        }

//        Ordem inversa dos elementos
        System.out.println(letrasInversa);

    }
}
