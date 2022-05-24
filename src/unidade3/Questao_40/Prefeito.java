package Questao_40;

public class Prefeito extends Politico{
  private String cidade;
  private String estado;

  public Prefeito(String nome, int idade, String cor, String SIGLA, String cidade, String estado){
    super(nome, idade, cor, SIGLA);
    this.cidade = cidade;
    this.estado = estado;
  }

  public Prefeito(Pessoa pessoa, String SIGLA, String cidade, String estado){
    super(pessoa, SIGLA);
    this.cidade = cidade;
    this.estado = estado;
  }

  public String getCidade() {
    return cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  @Override
  public String toString() {
    String result = super.toString();
    result += " | Cidade: " + this.cidade + " | Estado: " + this.estado + " | Cargo: Prefeito";

    return result;
  }
}
