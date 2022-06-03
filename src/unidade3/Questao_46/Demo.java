package unidade3.Questao_46;

import java.util.HashMap;
import java.util.TreeSet;

//Escreva um programa para contar o número de ocorrências de cada letra em uma String. Por exemplo,
//a string "HELLO THERE" contém dois H s, três E s, dois L s, um O , um T e um R .
//Exiba os resultados.

public class Demo {
    public static void main(String[] args) {
        String texto = "HELLO THERE";
        HashMap<Character, Integer> mapa = new HashMap<>();
        String[] palavras = texto.split(" ");

        for ( String palavra: palavras){
            for (int i = 0; i < palavra.length(); i++) {
              Character caixaBaixa = palavra.charAt(i);

              if(mapa.containsKey(caixaBaixa)){
                  int num = mapa.get(caixaBaixa);
                  mapa.put(caixaBaixa, num + 1);
              }else {
                  mapa.put(caixaBaixa, 1);
              }
            }
        }

        TreeSet<Character> palavrasOrdenadas = new TreeSet<>(mapa.keySet());
        for (Character palavra : palavrasOrdenadas) {
            System.out.printf("%c = %s\n", palavra, mapa.get(palavra));
        }

            System.out.println(mapa);
    }
}
