package unidade3.Questao_39;

public class DemoLivraria {
  public static void main(String[] args) {
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    LivroBiblioteca livroBiblioteca = new LivroBiblioteca(new Livro("code clean", "jose alfrendo", PersonalizarData.dataFormat(2022, 05, 24), "Livro para ter um codigo mais limpo!"));

    livroBiblioteca.setEmprestado(true);
    livroBiblioteca.setLeitor("Allyson Bruno de Freitas");

    System.out.println(livroBiblioteca);

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    
    LivroLivraria livroLivraria = new LivroLivraria(new Livro("code clean", "jose alfrendo", PersonalizarData.dataFormat(2022, 05, 24), "Livro para ter um codigo mais limpo!"), 100, 100.50f);

    System.out.println(livroLivraria);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
  }
}
