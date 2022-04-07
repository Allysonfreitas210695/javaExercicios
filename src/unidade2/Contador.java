package unidade2;

public class Contador {
  private int cont;
  
  public void increment(){
    this.cont++;
  }

  public void decrement(){
    this.cont--;
  }

  public void zera(){
    this.cont = 0;
  }

  public void imprimir(){
    System.out.println("vezes: ".concat(Integer.toString(this.cont)));
  }

}
