package unidade3.Questao_44;

public class Triangulo {
  private double base, altura;

  Triangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getAltura() {
    return this.altura;
  }

  public double getBase() {
    return this.base;
  }
}
