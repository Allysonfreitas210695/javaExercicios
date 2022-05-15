package Questao_32;

public class MaiorValor {
  
  public static int maior(int n1, int n2){
    return (
            n1 > n2 ? n1 : n2
          );
  }

  public static int maior(int n1, int n2, int n3){
    return (
            n1 > n2 && n1 > n3 ? 
            n1 : n2 > n3 ? 
            n2 : n3
          );
  }

  public static int maior(int n1, int n2, int n3, int n4){
    return (
            n1 > n2 && n1 > n3 && n1 > n4 ? 
            n1 : n2 > n3 && n2 > n4 ? 
            n2 : n3 > n4 ? 
            n3 : n4
          );
  }

  public static int maior(int n1, int n2, int n3, int n4, int n5){
    return (
            n1 > n2 && n1 > n3 && n1 > n4 ? 
            n1 : n2 > n3 && n2 > n4 ? 
            n2 : n3 > n4 ? 
            n3 : n4 > n5 ? 
            n4 : n5
          );
  }

  public static double maior(double n1, double n2){
    return (
            n1 > n2 ? n1 : n2
          );
  }

  public static double maior(double n1, double n2, double n3){
    return (
            n1 > n2 && n1 > n3 ? 
            n1 : n2 > n3 ? 
            n2 : n3
          );
  }

  public static double maior(double n1, double n2, double n3, double n4){
    return (
            n1 > n2 && n1 > n3 && n1 > n4 ? 
            n1 : n2 > n3 && n2 > n4 ? 
            n2 : n3 > n4 ? 
            n3 : n4
          );
  }

  public static double maior(double n1, double n2, double n3, double n4, double n5){
    return (
            n1 > n2 && n1 > n3 && n1 > n4 ? 
            n1 : n2 > n3 && n2 > n4 ? 
            n2 : n3 > n4 ? 
            n3 : n4 > n5 ? 
            n4 : n5
          );
  }

}
