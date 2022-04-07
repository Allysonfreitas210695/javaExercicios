package unidade2;

public class FaturaTeste {
  public static void main(String[] args) {
    Fatura fatura = new Fatura();
    
    fatura.colocarId(1234);
    fatura.colocarDescricao("Mouse Pad");
    fatura.addPreco(7.99f);
    fatura.addQuantidade(2);

    // se o valor for negativo (preço ou quantidade) o preco resulta em 0.0
      // fatura.addPreco(-7.99f);
      // fatura.addQuantidade(2);

    fatura.showFatura();
  }
}
