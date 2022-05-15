package Questao_29;

public class ContadorTeste {
  public static void main(String[] args) {
    Contador cont = new Contador();
    cont.increment();
    cont.increment();
    cont.increment();

    cont.imprimir();

    cont.decrement();
    cont.imprimir();

    cont.zera();
    cont.imprimir();
  }
}
