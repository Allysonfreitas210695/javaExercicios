package Questao_33;

public class RegistroAcademicoTeste {
  public static void main(String[] args) {
    RegistroAcademico aluno1 = new RegistroAcademico();
    aluno1.inicializaRegistro("Allyson", 1, 0.5);
    System.out.println(aluno1);

    RegistroAcademico aluno2 = new RegistroAcademico();
    aluno2.inicializaRegistro("jose",2, 0.5);
    System.out.println(aluno2);

    RegistroAcademico aluno3 = new RegistroAcademico();
    aluno3.inicializaRegistro("Bruno",2, 0.7);
    System.out.println(aluno3);

    RegistroAcademico aluno4 = new RegistroAcademico();
    aluno4.inicializaRegistro("Francisco",2, 0.7);
    System.out.println(aluno4);

    System.out.println("Total de Alunos matriculas foram "+ RegistroAcademico.totalMatriculas());
  }
}
