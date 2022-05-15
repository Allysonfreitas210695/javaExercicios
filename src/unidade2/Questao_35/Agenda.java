package Questao_35;
public class Agenda {
    private EntradaEmAgenda[] agendaCompromissos;
    private final static int MAX_DIA = 31;

    Agenda() {
        agendaCompromissos = new EntradaEmAgenda[MAX_DIA];
    }

    public void listaDia(int dia, int mes, int ano) {
        int verificarDia = -1;

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Encontro nesse dia, mes e ano!");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        for (EntradaEmAgenda agenda : agendaCompromissos) {
            if (agenda != null && agenda.ehNoDia(dia, mes, ano)) {
                System.out.println(agenda);
                verificarDia = 1;
            }
        }

        if(verificarDia == -1){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Você Não tem encontro nesse dia");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
    }

    public void imprimirAgenda() {
        for (EntradaEmAgenda agenda : agendaCompromissos) {
            if (agenda != null) {
                System.out.println(agenda);
            }
        }
    }

    public void addDiaAgenda(int dia, int mes, int ano, int hora, String assunto) {
        for (int i = 0; i < agendaCompromissos.length; i++) {
            if (agendaCompromissos[i] == null) {
                agendaCompromissos[i] = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
                break;
            }
        }
    }

}
