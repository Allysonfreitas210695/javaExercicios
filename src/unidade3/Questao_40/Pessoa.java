package unidade3.Questao_40;

public class Pessoa {
  private String nome;
  private int idade;
  private String cor;

  public Pessoa(String nome, int idade, String cor) {
    this.nome = nome;
    this.idade = idade;
    this.cor = cor;
  }

  public Pessoa(Pessoa pessoa) {
   this.nome = pessoa.nome;
   this.idade = pessoa.idade;
   this.cor = pessoa.cor;
  }

  public Pessoa() {

  }

  public String getCor() {
    return this.cor;
  }

  public int getIdade() {
    return this.idade;
  }

  public String getNome() {
    return this.nome;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    String result = " | Nome: " + this.nome + " | Idade: " + this.idade + " | Cor: " + this.cor;

    return result;
  }
}
