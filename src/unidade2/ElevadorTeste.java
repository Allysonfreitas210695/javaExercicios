package unidade2;

public class ElevadorTeste {
  public static void main(String[] args) {
    Elevador elevador = new Elevador();

    elevador.inicializa(5, 7);
    elevador.entrar();
    elevador.entrar();
    elevador.entrar();
    elevador.entrar();
    elevador.entrar();

    elevador.sai();
    elevador.sai();
    elevador.sai();
    
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
    elevador.sobe();
  
    elevador.desce();
    elevador.desce();
    elevador.desce();
    elevador.desce();
    elevador.desce();
    elevador.desce();
    elevador.desce();

    elevador.showElevado();
  }
}
