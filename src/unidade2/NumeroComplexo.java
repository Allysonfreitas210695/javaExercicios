package unidade2;

public class NumeroComplexo {
  private float valorReal;
  private float valorImaginario;
  
  public NumeroComplexo(float valorReal, float valorImaginario){
    this.setValorReal(valorReal);
    this.setImaginario(valorImaginario);
  }

  public NumeroComplexo(float valorReal){
    this.setValorReal(valorReal);
    this.setImaginario(0);
  }

  public NumeroComplexo(){
    this.setValorReal(0);
    this.setImaginario(0);
  }

  public void setValorReal(float valorReal){
    this.valorReal = valorReal;
  }

  public void setImaginario(float valorImaginario){
    this.valorImaginario = valorImaginario;
  }

  public float getValorReal(){
    return this.valorReal;
  }

  public float getImaginario(){
    return this.valorImaginario;
  }

  public String toString(){
    return "O valor real é ".concat(Float.toString(this.valorReal).concat(" e o Valor imaginário é ".concat(Float.toString(this.valorImaginario))));
  }
}
