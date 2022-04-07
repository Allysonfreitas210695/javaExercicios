package unidade2;

public class LampadaTeste {
  public static void main(String[] args) {
    Lampada lampada = new Lampada();
    lampada.acende();
    lampada.mostraEstado();

    lampada.apaga();
    lampada.mostraEstado();
    
    lampada.acende();
    lampada.mostraEstado();

    lampada.qtdVezesAcesso();
  }
}
