package unidade3.Questao_42;

public class Funcionario extends FuncionarioAbstrato{
    Funcionario(String nome) {
        super(nome);
    }

    Funcionario(String nome, double horaTrabalhada){
        super(nome, horaTrabalhada);
    }

    public void setCalculoSalarioMes(int diasTrabalhados, float horarioFixo){
        this.setSalario(diasTrabalhados * this.getValorHoraTrabalhanda() * horarioFixo);
    }

    public double SalarioSemana(int diasTrabalhados, float horarioFixo){
        return diasTrabalhados * this.getValorHoraTrabalhanda() * horarioFixo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + this.nome + '\'' +
                ", idade=" + this.idade +
                ", departamento='" + this.departamento + '\'' +
                ", salario=" + this.salario +
                ", horaTrabalhanda=" + this.valorhoraTrabalhanda +
                '}';
    }
}
