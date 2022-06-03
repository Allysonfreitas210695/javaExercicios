package unidade3.Questao_39;

import java.time.LocalDate;

public class LivroLivraria extends Livro{
  private int quantidade;
  private float preco;

  
  public LivroLivraria(Livro livro, int qtd, float preco){
    super(livro);
    this.quantidade = qtd > 0 ? qtd : 0;
    this.preco = preco > 0 ? preco : 0;
  }

  public LivroLivraria(Livro livro){
    super(livro);
    this.quantidade = 0;
    this.preco = 0;
  }

  public LivroLivraria(String nomeLivro, String nomeAutor, LocalDate dataLancamento, String resumo, int quantidade, float preco){
    super(nomeLivro, nomeAutor, dataLancamento, resumo);
    this.quantidade = quantidade;
    this.preco = preco;
  }
  
  //getters
  public String getNomeLivro(){
    return this.getNome();
  }

  public String getAutorLivro(){
    return this.getAutor();
  }

  public String getDataLancamentoLivro(){
    return this.getDataLancamento();
  }
  public float getPreco(){
    return this.preco;
  }
  public int getQuantidade(){
    return this.quantidade;
  }

  public void setPreco(float novoPreco){
    if(novoPreco>=0.0f) this.preco = novoPreco;
  }

  public void setQuantidade(int quantidade) {
    if(quantidade > 0.0f) this.quantidade = quantidade;
  }

  @Override
  public String toString() {
    String result = super.toString();
    result += " | Quantidade: " + this.quantidade +
    " | Preço: " + this.preco;

    return result;
  }
}
