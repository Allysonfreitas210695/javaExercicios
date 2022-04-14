package unidade2;

// Escreva uma classe para representar uma calculadora que realiza as quatro operações básicas. Os métodos dessa classe devem aceitar qualquer combinação de tipos números como seu parâmetros (e.g.: soma(5,3.2f), divide(5.1,17)...). Não utilize sobrecarga de métodos. Escreva um aplicativo de teste que demonstra as capacidades da classe criada.

public class Calculadora {
  
  public static double soma(Object n1, Object n2){
    if((n1 instanceof Integer) && ((n2 instanceof Integer))){
      return ((Integer) n1 + (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 + (Double) n2);
    }else if((n1 instanceof Double) && (n2 instanceof Integer)){
      return ((Double) n1 + (Integer) n2);
    }else if ((n1 instanceof Double) && (n2 instanceof Double)){
      return ((Double) n1 + (Double) n2);
    }else{
      System.err.println("Variavel não permitida");
      return 0;
    }
  }

  public static double subtracao(Object n1, Object n2){
    if((n1 instanceof Integer) && ((n2 instanceof Integer))){
      return ((Integer) n1 - (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 - (Double) n2);
    }else if((n1 instanceof Double) && (n2 instanceof Integer)){
      return ((Double) n1 - (Integer) n2);
    }else if ((n1 instanceof Double) && (n2 instanceof Double)){
      return ((Double) n1 - (Double) n2);
    }else{
      System.err.println("Variavel não permitida");
      return 0;
    }
  }

  public static double divisao(Object n1, Object n2){
    if((n1 instanceof Integer) && ((n2 instanceof Integer))){
      return ((Integer) n1 / (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 / (Double) n2);
    }else if((n1 instanceof Double) && (n2 instanceof Integer)){
      return ((Double) n1 / (Integer) n2);
    }else if ((n1 instanceof Double) && (n2 instanceof Double)){
      return ((Double) n1 / (Double) n2);
    }else{
      System.err.println("Variavel não permitida");
      return 0;
    }
  }

  public static double multiplicao(Object n1, Object n2){
    if((n1 instanceof Integer) && ((n2 instanceof Integer))){
      return ((Integer) n1 * (Integer) n2);
    }else if((n1 instanceof Integer) && (n2 instanceof Double)){
      return ((Integer) n1 * (Double) n2);
    }else if((n1 instanceof Double) && (n2 instanceof Integer)){
      return ((Double) n1 * (Integer) n2);
    }else if ((n1 instanceof Double) && (n2 instanceof Double)){
      return ((Double) n1 * (Double) n2);
    }else{
      System.err.println("Variavel não permitida");
      return 0;
    }
  }
}
