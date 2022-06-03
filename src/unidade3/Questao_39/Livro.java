package unidade3.Questao_39;

import java.time.LocalDate;

public class Livro {
  private String nome, autor, resumo;
  private LocalDate dataLancamento;

  //construtores
  public Livro(String nomeLivro, String nomeAutor, LocalDate dataLancamento, String resumo){
    this.nome = nomeLivro;
    this.autor = nomeAutor;
    this.dataLancamento = dataLancamento;
    this.resumo = resumo;
  }

  Livro(Livro livro){
    this.nome = livro.nome;
    this.autor = livro.autor;
    this.dataLancamento = livro.dataLancamento;
    this.resumo = livro.resumo;
  }

  Livro(){

  }

  //getters
  public String getNome(){
    return this.nome;
  }
  public String getAutor(){
    return this.autor;
  }
  public String getDataLancamento(){
    return this.dataLancamento.toString();
  }
  public String getResumo(){
    return this.resumo;
  }

  //setters
  public void setResumo(String resumo){
    this.resumo = resumo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setDataLancamento(LocalDate dataLancamento) {
    this.dataLancamento = dataLancamento;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    String msg = "";
    msg += "| Nome: "+this.nome +
    " | Autor: "+ this.autor +
    " | Data de Lamçamento: " + this.dataLancamento +
    " | Resumo do Livro: " + this.resumo; 
    return msg;
  }
}
