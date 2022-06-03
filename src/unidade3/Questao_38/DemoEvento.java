package unidade3.Questao_38;

public class DemoEvento {
  public static void main(String[] args) {
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    EventoDelegacao eventoDelegacao1 = new EventoDelegacao();
    EventoDelegacao eventoDelegacao2 = new EventoDelegacao("DELEGAÇÃO", new DataHora(DataHora.horaPersonalizada(10, 31, 20), DataHora.dataPersonalizada(2022, 5, 24)));
    
    System.out.println(eventoDelegacao1);
    System.out.println(eventoDelegacao2);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    
    EventoHeranca eventoHeranca1 = new EventoHeranca();
    EventoHeranca eventoHeranca2 = new EventoHeranca(new DataHora(DataHora.horaPersonalizada(10, 31, 20), DataHora.dataPersonalizada(2022, 5, 24)), "HERANÇA");

    System.out.println(eventoHeranca1);
    System.out.println(eventoHeranca2);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
  }
}
