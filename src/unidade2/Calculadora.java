

public class Calculadora {
    public <T, G> void  soma(T n1, G n2){
      if((n1 instanceof Integer) && ((n2 instanceof Integer))){
        int soma = ((Integer) n1 + (Integer) n2);
        System.out.printf("soma: %d\n", soma);
      }else if((n1 instanceof Integer) && (n2 instanceof Double)){
        double soma = ((Integer) n1 + (Double) n2);
        System.out.printf("soma: %.2f\n", soma);
      }else if((n1 instanceof Double) && (n2 instanceof Integer)){
        double soma = ((Double) n1 + (Integer) n2);
        System.out.printf("soma: %.2f\n", soma);
      }else if ((n1 instanceof Double) && (n2 instanceof Double)){
        double soma = ((Double) n1 + (Double) n2);
        System.out.printf("soma: %.2f\n", soma);
      }else{
        System.err.println("Variavel não permitida");
      }
    }

    public <T, G> void  subtracao(T n1, G n2){
      if((n1 instanceof Integer) && ((n2 instanceof Integer))){
        int subtracao = ((Integer) n1 - (Integer) n2);
        System.out.printf("subtracao: %d\n", subtracao);
      }else if((n1 instanceof Integer) && (n2 instanceof Double)){
        double subtracao = ((Integer) n1 - (Double) n2);
        System.out.printf("subtracao: %.2f\n", subtracao);
      }else if((n1 instanceof Double) && (n2 instanceof Integer)){
        double subtracao = ((Double) n1 - (Integer) n2);
        System.out.printf("subtracao: %.2f\n", subtracao);
      }else if ((n1 instanceof Double) && (n2 instanceof Double)){
        double subtracao = ((Double) n1 - (Double) n2);
        System.out.printf("subtracao: %.2f\n", subtracao);
      }else{
        System.err.println("Variavel não permitida");
      }
    }
    
    public <T, G> void  divisao(T n1, G n2){
      if((n1 instanceof Integer) && ((n2 instanceof Integer))){
        int divisao = ((Integer) n1 / (Integer) n2);
        System.out.printf("divisao: %d\n", divisao);
      }else if((n1 instanceof Integer) && (n2 instanceof Double)){
        double divisao = ((Integer) n1 / (Double) n2);
        System.out.printf("divisao: %.2f\n", divisao);
      }else if((n1 instanceof Double) && (n2 instanceof Integer)){
        double divisao = ((Double) n1 / (Integer) n2);
        System.out.printf("divisao: %.2f\n", divisao);
      }else if ((n1 instanceof Double) && (n2 instanceof Double)){
        double divisao = ((Double) n1 / (Double) n2);
        System.out.printf("divisao: %.2f\n", divisao);
      }else{
        System.err.println("Variavel não permitida");
      }
    }
    
    public <T, G> void  multiplicao(T n1, G n2){
      if((n1 instanceof Integer) && ((n2 instanceof Integer))){
        int multiplicao = ((Integer) n1 * (Integer) n2);
        System.out.printf("multiplicao: %d\n", multiplicao);
      }else if((n1 instanceof Integer) && (n2 instanceof Double)){
        double multiplicao = ((Integer) n1 * (Double) n2);
        System.out.printf("multiplicao: %.2f\n", multiplicao);
      }else if((n1 instanceof Double) && (n2 instanceof Integer)){
        double multiplicao = ((Double) n1 * (Integer) n2);
        System.out.printf("multiplicao: %.2f\n", multiplicao);
      }else if ((n1 instanceof Double) && (n2 instanceof Double)){
        double multiplicao = ((Double) n1 * (Double) n2);
        System.out.printf("multiplicao: %.2f\n", multiplicao);
      }else{
        System.err.println("Variavel não permitida");
      }
    }
}
