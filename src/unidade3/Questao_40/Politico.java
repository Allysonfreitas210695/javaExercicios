package Questao_40;

public class Politico extends Pessoa{
   private String SIGLA;

   public Politico(Pessoa pessoa, String SIGLA){
     super(pessoa);
     this.SIGLA = SIGLA;
   }

   public Politico(String nome, int idade, String cor, String SIGLA){
    super(nome, idade, cor);
    this.SIGLA = SIGLA;
  }

   public Politico(){

   }

   public String getSIGLA() {
     return SIGLA;
   }

   public void setSIGLA(String SIGLA) {
     SIGLA = SIGLA;
   }

   @Override
   public String toString() {
    String result = super.toString();
    result += " | SIGLA: "+ this.SIGLA;

    return result;
   }
}