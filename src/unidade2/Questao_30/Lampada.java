package Questao_30;

import Questao_29.Contador;

public class Lampada {
  private boolean estadoDaLampada;
  private Contador cont = new Contador();
  
  public void acende(){
    if(!estaLigada()){
       this.estadoDaLampada = true;
       this.cont.increment();
    }else{
      System.out.println("Lampada já está Ligada, operação nula");
    }
  }

  public void apaga(){
    if(estaLigada()){
      this.estadoDaLampada = !this.estadoDaLampada;
    }else{
      System.out.println("Lampada já está Apagada, operação nula");
    }
  }
  
  public void mostraEstado(){
    System.out.println("A Lampada está "+(estaLigada() ? "Ligado" : "Desligado"));
  }

  public boolean estaLigada(){
    return this.estadoDaLampada;
  }

  public void qtdVezesAcesso(){
    this.cont.imprimir();
  }
}
