
public abstract class FiguraGeometrica {
  protected Circulo circulo;
  protected Quadrado quadrado;
  protected Triangulo triangulo;


  public Circulo getCirculo() {
    return this.circulo;
  }

  public void setCirculo(Circulo circulo) {
    this.circulo = circulo;
  }

  public Quadrado getQuadrado() {
    return this.quadrado;
  }

  public void setQuadrado(Quadrado quadrado) {
    this.quadrado = quadrado;
  }

  public Triangulo getTriangulo() {
    return this.triangulo;
  }

  public void setTriangulo(Triangulo triangulo) {
    this.triangulo = triangulo;
  }

  abstract public void desenha();
}
