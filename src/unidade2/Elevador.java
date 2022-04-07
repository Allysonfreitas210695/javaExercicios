package unidade2;

public class Elevador {
  int andar, qtdAndares, capacidadeElevador, qtdPessoasPresente;
  
  void inicializa(int capacidadeElevador, int qtdAndares){
    this.capacidadeElevador = capacidadeElevador;
    this.qtdAndares = qtdAndares;
    this.andar = 0;
  }

  void entrar(){
    if(this.capacidadeElevador > this.qtdPessoasPresente){
      this.qtdPessoasPresente++;
    }else{
      System.out.println("O numero de pessoas que querem entrar passa da Capacidade");
    }
  }

  void sai(){
    if(this.qtdPessoasPresente > 0){
      this.qtdPessoasPresente--;
    }
  }

  void sobe(){
    if(this.qtdAndares == this.andar){
      System.out.println("Ops nao pode Sobe!!!");
    }else{
      this.andar++;
    }
  }

  void desce(){
    if(this.andar == 0){
     System.out.println("ops você já está no terreo, sendo assim você nao pode desce!");
    }else{
      this.andar--;
    }
  }

  void showElevado(){
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Andar atual: "+this.andar);
    System.out.println("Quantidade de Andares: "+this.qtdAndares);
    System.out.println("Capacidade do elevando: "+this.capacidadeElevador);
    System.out.println("Pessoas Presente: "+this.qtdPessoasPresente);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
  }
}
