package unidade3.Questao_39;

import java.time.LocalDate;

public class LivroBiblioteca extends Livro{
  private boolean emprestado;
  private String leitor;

  public LivroBiblioteca(Livro livro){
    super(livro);
  }

  public LivroBiblioteca(String nomeLivro, String nomeAutor, LocalDate dataLancamento, String resumo, String leitor){
    super(nomeLivro, nomeAutor, dataLancamento, resumo);
    this.leitor = leitor;
    this.emprestado = true;
  }

  public String getLeitor() {
    return this.leitor;
  }

  public void setLeitor(String leitor) {
    this.leitor = leitor;
  }

  public boolean getEmprestado() {
    return this.emprestado;
  }

  public void setEmprestado(boolean emprestado) {
    if(!this.emprestado) this.emprestado = true;
  }

  @Override
  public String toString() {
    String result = super.toString();
    result += " | Emprestado: " + (this.emprestado ? "Sim" : "Não")  +
    " | Leitor: " + (this.leitor == null ? "Livro está livre para emprestimo" : this.leitor);
    return result;
  }
}
