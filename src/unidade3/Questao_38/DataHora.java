package Questao_38;

import java.time.LocalDate;
import java.time.LocalTime;

// Crie uma classe para representar uma data e um horário (DataHora).
public class DataHora {
  private LocalTime horario;
  private LocalDate data;
  
  DataHora(LocalTime horario, LocalDate data) {
    this.data = data;
    this.horario = horario;
  }

  DataHora(){
    this.data = LocalDate.now();
    this.horario = LocalTime.now();
  }

  public static LocalDate dataPersonalizada(int ano, int mes, int dia){

    return LocalDate.of(ano, mes, dia);
  }

  public static LocalTime horaPersonalizada(int hora, int min, int sec){

    return LocalTime.of(hora, min, sec);
  }


  public LocalDate getData() {
    return data;
  }

  public LocalTime getHorario() {
    return horario;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }
  public void setHorario(LocalTime horario) {
    this.horario = horario;
  }

  @Override
  public String toString() {
    return "A Data é "+this.data+" com harário de " + this.horario;
  }
}
