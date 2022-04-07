package unidade2;


public class ShowTime {
  public static void main(String[] args) {
    Time time = new Time();

    time.nomeTime("ABC");

    time.addJogadores("Allyson");
    time.addJogadores("Cleanio");
    time.addJogadores("Noberto");
    time.addJogadores("Jose Franscisco");
    time.addJogadores("Pereira");

    time.addEmpate();
    time.addEmpate();
    time.addDerrota();

    time.addVitoria();
    time.addVitoria();
    time.addVitoria();

    time.imprime();
  }
}