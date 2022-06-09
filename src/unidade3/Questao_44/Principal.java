
public class Principal {
  public static void main(String[] args) {
    Desenho desenho1 = new Desenho(new Circulo(), new Quadrado(), 2, 3);
    desenho1.apresenta();

    System.out.println();

    Desenho desenho2 = new Desenho(new Quadrado(), new Triangulo(), 2, 3);
    desenho2.apresenta();
  }
}
