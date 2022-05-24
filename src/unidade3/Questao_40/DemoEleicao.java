package Questao_40;

public class DemoEleicao {
  public static void main(String[] args) {
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    
    Prefeito prefeito = new Prefeito(new Pessoa("Allyson Bruno", 26, "branco"), "PMDB", "Portalegre", "RN");
    System.out.println(prefeito);

    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    Governador governador = new Governador(new Pessoa("Netinho de Gurgel", 62, "branco"), "PSDB", "Natal", "RN");
    System.out.println(governador);
  }
}
