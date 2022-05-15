package Questao_25;

public class Time {
  String nome;
  String jogadores[] = new String[11];
  int vitorias;
  int empates;
  int derrotas;

  void nomeTime(String nomeTime){
    nome = nomeTime;
  }

  void addJogadores(String jogador){
    int cont = 0;
    for (String j : jogadores) {
      if(j == null){
         jogadores[cont] = jogador;
         break;
      }
      cont++;
    }

    if(cont == jogadores.length) 
      System.out.println("Nao pode ser adicionado mais jogadores");
  }

  void addVitoria(){
    vitorias++;
  }

  void addEmpate(){
    empates++;
  }

  void addDerrota(){
    derrotas++;
  }

  int verificarJogadores(String jogadores[], int indice){
    if(indice >= jogadores.length){
      return 0;
    }
    else if(jogadores[indice] == null){
      return 0 + verificarJogadores(jogadores, indice+1);
    }else{
      return 1 + verificarJogadores(jogadores, indice+1);
    }
  }

  void imprimerJogadores(){
    int cont = 0;
    for (String j : jogadores) {
      if(j != null){
        System.out.println("jogador["+(cont)+"]: "+j);
      }
      cont++;
    }
  }

  void imprime(){
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("    Informacao do Time    ");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Nome: "+nome);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Vitorias: "+vitorias);
    System.out.println("Derracao: "+derrotas);
    System.out.println("Empates: "+empates);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    if(verificarJogadores(jogadores, 0) > 0){
      imprimerJogadores();
    }else{
      System.out.println("time sem jogador!");
    }
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println();
  }
}
