package unidade2;

// Escreva uma versão da classe RegistroAcademico (vista em aula) que tenha o campo numeroDeMatriculas declarado como static, e que incremente o valor deste campo cada vez que uma instância da classe for criada. Use o atributo numeroDeMatriculas para definir o atributo matricula automaticamente com um valor diferente para cada instância. Escreva também uma aplicação que crie algumas instâncias da classe para demonstrar seu funcionamento.

public class RegistroAcademico {
  private String nome;
	private int matricula;
	private int codigoCurso;
	private double percentualDeCobranca;
  public static int numeroDeMatriculas; 

	public void inicializaRegistro(String nome, int codigo, double percetual) {
    somaNumeroDeMatriculas();
		this.nome = nome;
		this.matricula = numeroDeMatriculas;
		this.codigoCurso = codigo;
		this.percentualDeCobranca = percetual;
	}

  private static void somaNumeroDeMatriculas(){
    numeroDeMatriculas++;
  }

  public static int totalMatriculas(){
    return numeroDeMatriculas;
  }

	public double calculaMensalidade() {
		return 100*codigoCurso*percentualDeCobranca;
	}

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void setCodigo(int codigo) {
    this.codigoCurso = codigo;
  }

  public int getCodigo() {
    return this.codigoCurso;
  }


  @Override
  public String toString() {
    return "Aluno: "+this.nome+"\nMatricula: "+this.matricula+"\nCodigo Do Curso: "+this.codigoCurso+"\n";
  }
}
