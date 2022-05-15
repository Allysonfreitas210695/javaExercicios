package Questao_27;

import java.text.DecimalFormat;

public class Aluno {
  String matricula, nome;
  double n1, n2, nTrabalho;

  void addNota1(double n1){
    this.n1 = n1;
  }

  void addNota2(double n2){
    this.n2 = n2;
  }

  void addNotaTrabalho(double notaTrabalho){
    this.nTrabalho = notaTrabalho;
  }
  
  double media(){
    return ((this.n1 + this.n2)*2.5+nTrabalho*2)/7;
  }

  double provaFinal(){
    double media = media();
    return (media < 2.5 || media >= 5) ? 0 : (10 - media);
  }

  void showResultado(){
    DecimalFormat formato = new DecimalFormat("#.##");  

    String msg = "O Aluno está ";
    if(provaFinal() == 0) msg+="Aprovado!";
    else msg+= "".concat(formato.format(media()))+" na Quarta prova precisando de ".concat(formato.format(provaFinal()));

    System.out.println(msg);
  }

}
