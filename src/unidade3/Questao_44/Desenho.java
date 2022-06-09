
public class Desenho {
  private FiguraGeometrica figuraA;
  private FiguraGeometrica figuraB;
  private double coordenadaX, coordenadaY;

  Desenho(FiguraGeometrica figuraA, FiguraGeometrica figuraB, double coordenadaX, double coordenadaY){
    this.figuraA = figuraA;
    this.figuraB = figuraB;
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
  }

  public void apresenta(){
    this.figuraA.desenha();
    this.figuraB.desenha();
    System.out.println("Coordenada x: "+this.coordenadaX+" y: "+this.coordenadaY);
  }
  
}
