package unidade2;

public class AlunoTeste {
  public static void main(String[] args) {
    Aluno aluno = new Aluno();

    aluno.addNota1(8);
    aluno.addNota2(1);
    aluno.addNotaTrabalho(5);


    aluno.showResultado();
  }
}
