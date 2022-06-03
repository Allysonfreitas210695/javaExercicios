package unidade3.Questao_42;

public abstract class FuncionarioAbstrato {
    protected String nome;
    protected String departamento;
    protected int idade;
    protected double salario;
    protected double valorhoraTrabalhanda;

    FuncionarioAbstrato(String nome){
        this.nome = nome;
        this.valorhoraTrabalhanda = 2.0;
    }

    FuncionarioAbstrato(String nome, double horaTrabalhanda){
        this.valorhoraTrabalhanda = horaTrabalhanda;
        this.nome = nome;
    }

    public double getValorHoraTrabalhanda() {
        return this.valorhoraTrabalhanda;
    }

    public double getSalario() {
        return this.salario;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setValorHoraTrabalhanda(double horaTrabalhanda) {
        this.valorhoraTrabalhanda = horaTrabalhanda;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
