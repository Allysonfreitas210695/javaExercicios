package Questao_31;

import java.util.Random;

public class NumeroComplexoTeste {
  public static void main(String[] args) {
    Random rand = new Random();
    NumeroComplexo numeroComplexo1 = new NumeroComplexo(1, rand.nextInt(10));
    NumeroComplexo numeroComplexo2 = new NumeroComplexo(20);
    NumeroComplexo numeroComplexo3 = new NumeroComplexo();

    System.out.println(numeroComplexo1);
    System.out.println(numeroComplexo2);
    System.out.println(numeroComplexo3);
  }
}
