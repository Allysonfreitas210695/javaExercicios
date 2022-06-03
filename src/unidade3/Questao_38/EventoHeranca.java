package unidade3.Questao_38;

import java.time.LocalDate;
import java.time.LocalTime;

// Escreva uma classe EventoHeranca que seja baseada na classe DataHora e que contenha um campo para indicar qual o evento que ela representa (use uma String para isto). Use o mecanismo de herança para criar a classe EventoHeranca

public class EventoHeranca extends DataHora{
  private String evento;
  
  EventoHeranca(){
    super();
    this.evento = "HERANÇA";
  }

  EventoHeranca(DataHora dataHora, String evento){
    super(dataHora.getHorario(), dataHora.getData());
    this.evento = evento;
  }
  
  public String getEvento() {
    return this.evento;
  }

  public void setEvento(String evento) {
    this.evento = evento;
  }

  @Override
  public String toString() {
    return "EVENTO " + this.evento + ": { " + this.getData() + ", " + this.getHorario() +" }";
  }
}
