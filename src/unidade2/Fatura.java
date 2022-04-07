package unidade2;

public class Fatura {
  int id;
  String descricao;
  int quantidade;
  float preco;
  
  void colocarId(int id){
    this.id = id;
  }

  void colocarDescricao(String descricao){
    if(this.descricao != null || this.descricao != "") this.descricao = descricao;
    else this.descricao = "Descrição invalida";
  }

  void addQuantidade(int qtd){
    if(qtd < 0) this.quantidade = 0;
    else this.quantidade = qtd;
  }

  void addPreco(float preco){
    if(preco < 0) this.preco = 0.0f;
    else this.preco = preco;
  }

  float calculaTotal(){
    return this.quantidade * this.preco;
  }

  void showFatura(){
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("Id: ".concat(Integer.toString(this.id)));
    System.out.println("Descrição: "+this.descricao);
    System.out.println("Quantidade: ".concat(Integer.toString(this.quantidade)));
    System.out.println("Preço: ".concat(Float.toString(this.preco)));
    System.out.println("Total a pagar: ".concat(Float.toString(calculaTotal())));
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
  }

}
