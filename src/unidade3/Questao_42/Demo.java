package unidade3.Questao_42;

public class Demo {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("jose");
    funcionario.setDepartamento("Tecnologia da Infomação");
    funcionario.setIdade(20);
    funcionario.setCalculoSalarioMes(20, 8);

    System.out.println(funcionario.SalarioSemana(5,8));
    System.out.println(funcionario);
  }
}
